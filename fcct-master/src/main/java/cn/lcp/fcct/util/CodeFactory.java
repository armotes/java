package cn.lcp.fcct.util;

import cn.lcp.fcct.schema.DataBaseTableInfo;
import cn.lcp.fcct.schema.InformationSchema;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class CodeFactory {
    public static CodeFactory instance;
    private static Boolean FLAG ;
    private static String code_package ;
    private static List<String> codeTemplates = new ArrayList<>();
    private static List<String> files = new ArrayList<>();
    private static Boolean excludeFirstParamater;
    private static List<String> excludefiles = new ArrayList<>();
    private static List<String> exclude_fileds = new ArrayList<>();
    public static String data_base_name ;

    private CodeFactory(){}
    public static CodeFactory getInstance(){
        if(instance == null){
            instance = new CodeFactory();
            try {
                Properties properties = new Properties();
                FileInputStream in = new FileInputStream("CodeTemplates/CodeTemplates.properties");
                properties.load(in);
                in.close();
                FLAG = Boolean.parseBoolean(properties.getProperty("COVER_FLAG").trim());
                code_package = properties.getProperty("CODE_PACKAGE").trim();
                data_base_name = properties.getProperty("DATA_BASE_NAME").trim();
                excludeFirstParamater = Boolean.parseBoolean(properties.getProperty("EXCLUDE_FIRST_PARAMATER").trim());
                for (String exclude_file:properties.getProperty("EXCLUDE_FILES").trim().split(",")) {
                    excludefiles.add(exclude_file);
                }
                for (String exclude_filed:properties.getProperty("EXCLUDE_FILEDS").trim().split(",")) {
                    exclude_fileds.add(exclude_filed);
                }
                for (String code_templates_folder:properties.getProperty("TEMPLATES").trim().split(",")) {
                    switch (code_templates_folder){
                        case "po":
                            codeTemplates.add("Po.java");
                            files.add(code_package+"po/");
                            break;
                        case "dao":
                            codeTemplates.add("Dao.java");
                            files.add(code_package+"dao/");
                            break;
                        case "mapper":
                            codeTemplates.add("Mapper.java");
                            files.add(code_package+"mapper/");
                            break;
                        case "service":
                            codeTemplates.add("Service.java");
                            files.add(code_package+"service/");
                            break;
                        case "serviceImpl":
                            codeTemplates.add("ServiceImpl.java");
                            files.add(code_package+"service/Impl/");
                            break;
                        case "controller":
                            codeTemplates.add("Controller.java");
                            files.add(code_package+"controller/");
                            break;
                        case "xml":
                            codeTemplates.add("Mapper.xml");
                            files.add("src/main/resources/mapper/");
                            break;
                    }
                }
                for (String code_template:properties.getProperty("EXCLUDE_FILES").trim().split(",")) {
                    excludefiles.add(code_template);
                }
            }catch (IOException e){
                throw new RuntimeException("配置加载错误,请确认路径或参数是否正确!");
            }

        }
        return instance;
    }

    private Boolean excludeParamater(Integer index,String paramater){
        if(excludeFirstParamater&&index == 0){
            return false;
        }
        for (String excludefile:excludefiles) {
            if(excludefile.equals(paramater)){
                return false;
            }
        }
        return true;
    }

    private Boolean validateParamateNum(List<InformationSchema> informationSchemas,List<String> exclude_fileds){
        List<String> vpn = new ArrayList<>();
        for (int i = 0; i < informationSchemas.size(); i++) {
            if(excludeFirstParamater&&i==0){
                continue;
            }
            String columnName = informationSchemas.get(i).getColumnName();
            if(exclude_fileds.contains(columnName)){
                vpn.add(columnName);
            }
        }
        return vpn.size()!=1;
    }

    private String formatSqlParamater(String sqlParamater){

        String paramater = "";
        switch (sqlParamater){
            case "int":
                paramater = "Integer";
                break;
            case "bigint":
                paramater = "Long";
                break;
            case "varchar":
                paramater = "String";
                break;
            case "datetime":
                paramater = "java.util.Date";
                break;
            case "timestamp":
                paramater = "java.util.Date";
            case "decimal":
                paramater = "java.math.BigDecimal";
                break;
            case "float":
                paramater = "float";
                break;
        }
        return paramater;
    }

    /**
     *
     * @param dataBaseTableInfo 数据库表名和注释
     * @param informationSchemas 表内相关属性
     *         columnName:列名 dataType:列类型 columnComment:列描述
     * @throws Exception
     */
    public void CreateCode(DataBaseTableInfo dataBaseTableInfo, List<InformationSchema> informationSchemas){
        if (codeTemplates.size() != files.size()) {
            throw new RuntimeException("templates.length != files.length");
        }
        VelocityContext context = new VelocityContext();
        Map<String, String> entity = getEntity(dataBaseTableInfo,informationSchemas);

        String conversionTableName = entity.get("poEntity");

        //表注释
        context.put("tableComment",dataBaseTableInfo.getTableComment());

        //实体类
        context.put("poEntity",conversionTableName);
        context.put("poEntityDO",conversionTableName+"DO");
        context.put("poParamaterEntity",entity.get("poParamaterEntity"));

        context.put("poEntityLower",entity.get("poEntityLower"));
        context.put("poEntityLowerDO",entity.get("poEntityLower")+"DO");
        context.put("poIDType",entity.get("poIDType"));
        context.put("poIDName",entity.get("poIDName"));

        context.put("columnIDName",entity.get("columnIDName"));
        context.put("tableName",entity.get("tableName"));
        context.put("columnNames",entity.get("columnNames"));
        context.put("entityParamNames",entity.get("entityParamNames"));
        context.put("xmlUpdateIF",entity.get("xmlUpdateIF"));

        context.put("author","armote");
        context.put("creatTime",formart(new Date(),"yyyy-MM-dd HH:mm:ss"));
        try{
            for (int i = 0; i < files.size(); i++) {
                Template template = Velocity.getTemplate("/CodeTemplates/"+codeTemplates.get(i), "UTF-8");
                File file = null;
                if ("Po.java".equals(codeTemplates.get(i))) {
                    file = new File(files.get(i) + conversionTableName +"DO"+ codeTemplates.get(i).substring(2));
                }else {
                    file = new File(files.get(i) + conversionTableName + codeTemplates.get(i));
                }
                System.out.println("当前文件信息:"+files.get(i)+":"+conversionTableName+":"+codeTemplates.get(i));
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (!FLAG && file.exists()) {
                    continue;
                }
                System.out.println("创建路径:"+file.getPath());
                System.out.println(file.getAbsolutePath());
                FileWriter fileWriter = new FileWriter(file);
                template.merge(context, fileWriter);
                fileWriter.close();
            }
        }  catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @Auther: zhouaqiang
     * @DATE: 2019/2/21 0021 下午 3:43
     * @Description:具体设置模板信息的地方
     */
    private Map<String,String> getEntity(DataBaseTableInfo dataBaseTableInfo,List<InformationSchema> informationSchemas){

        String tableName = dataBaseTableInfo.getTableName();
        Map<String,String> map = new HashMap<>();
        //POJO属性
        StringBuilder poParamaterEntity = new StringBuilder();
        System.out.println("当前表名："+tableName);
        String[] ts = tableName.split("_");
        StringBuilder conversionTableName = new StringBuilder();
        StringBuilder conversionTableDOName = new StringBuilder();
        StringBuilder columnNames = new StringBuilder();
        StringBuilder entityParamNames = new StringBuilder();
        StringBuilder xmlUpdateIF = new StringBuilder();

        for (String t:ts) {
            conversionTableName.append(t.substring(0,1).toUpperCase()+t.substring(1));
        }
        conversionTableDOName.append(conversionTableName).append("DO");

        String poIDName = "";
        String poIDType = "";
        String columnIDName ="";
        Boolean vpn = validateParamateNum(informationSchemas, exclude_fileds);
        String conversionTableNameLower = conversionTableName.toString().substring(0,1).toLowerCase()+conversionTableName.toString().substring(1);

        for (int i = 0; i < informationSchemas.size(); i++) {
            StringBuilder columnName = new StringBuilder();
            String cn = informationSchemas.get(i).getColumnName();
            String[] cs = cn.split("_");
            //设置xml模板
            columnNames = i!=informationSchemas.size()-1
                    ?columnNames.append("            ").append(cn).append(",\n") : columnNames.append("            ").append(cn);


            for (int j = 0; j < cs.length; j++) {
                if(j==0){
                    columnName.append(cs[j]);
                }else{
                    columnName.append(cs[j].substring(0,1).toUpperCase()).append(cs[j].substring(1));
                }
            }

            //XML实体属性集合
            entityParamNames = i!=informationSchemas.size()-1 ?
                    entityParamNames.append("             ").append("#{"+columnName+"}").append(",\n")
                    : entityParamNames.append("             ").append("#{"+columnName+"}");

            String poDataType = formatSqlParamater(informationSchemas.get(i).getDataType());
            if(i==0){
                poIDName = columnName.toString();
                poIDType = poDataType;
                columnIDName = cn;
            }else{
                xmlUpdateIF.append("                ")
                           .append("<if test=\""+columnName+"!= null\">\n")
                           .append("                        ")
                           .append(cn+" = #{"+columnName+"},\n")
                           .append("                </if>\n");

            }
            //Po
            if(!exclude_fileds.contains(informationSchemas.get(i).getColumnName())){
                //设置属性和注释
                poParamaterEntity.append("\n    /**"+informationSchemas.get(i).getColumnComment()+"*/")
                                 .append("\n")
                                 .append("    private ").append(poDataType+" " + columnName +" ;")
                                 .append("\n");

            }
            //如果是第一个列(主键)
            if(excludeParamater(i,cn)){
                //
                if(!vpn||informationSchemas.size()==i+1){
//                    serviceMethod.append("    /**查询所有数据*/\n").append("    public List<").append(conversionTableDOName).append("> getAll();\n\n");
//
//                    serviceImplMethod.append("\n        @Autowired")
//                                     .append("\n        private "+conversionTableName+"Mapper "+conversionTableNameLower+"Mapper;\n\n");
//                    serviceImplMethod.append("\n    /**添加单条数据*/\n")
//                            .append("        @Override\n")
//                            .append("    public void insert").append(conversionTableName)
//                            .append("(").append(conversionTableDOName+" "+conversionTableDONameLower+");\n\n");
                    System.out.println("改为静态处理:这里不解析模板");
                }else{
                    System.out.println("进入循环死角，请查看代码");
                }
            }
        }

        map.put("poParamaterEntity",poParamaterEntity.toString());
        map.put("poEntity",conversionTableName.toString());
        map.put("poEntityLower",conversionTableNameLower);
        map.put("poIDType",poIDType);
        map.put("poIDName",poIDName);
        map.put("columnIDName",columnIDName);
        map.put("tableName",tableName);
        map.put("columnNames",columnNames.toString());
        map.put("entityParamNames",entityParamNames.toString());
        map.put("xmlUpdateIF",xmlUpdateIF.toString());

        return  map;
    }

    /**
     * @Auther: zhouaqiang
     * @DATE: 2019/2/21 0021 下午 3:35
     * @Description: 旧方法
     */
//    private Map<String,String> getEntityOld(DataBaseTableInfo dataBaseTableInfo,List<InformationSchema> informationSchemas){
//
//        String tableName = dataBaseTableInfo.getTableName();
//        Map<String,String> map = new HashMap<>();
//        StringBuilder poParamaterEntity = new StringBuilder();
//        StringBuilder poParamaterGetSetEntity = new StringBuilder();
//        StringBuilder insertEntity = new StringBuilder();
//        StringBuilder insertEntity2 = new StringBuilder();
//        StringBuilder updateEntity = new StringBuilder();
//        StringBuilder deleteEntity = new StringBuilder();
//        StringBuilder selectEntity = new StringBuilder();
//        StringBuilder getEntity = new StringBuilder();
//
//        //Mapper接口
//        StringBuilder insertMethod = new StringBuilder();
//        StringBuilder updateMethod = new StringBuilder();
//        StringBuilder deleteMethod = new StringBuilder();
//        StringBuilder getAllMethod = new StringBuilder();
//        StringBuilder getMethod = new StringBuilder();
//
//
//
//        StringBuilder serviceEntity = new StringBuilder();
//        StringBuilder serviceImplEntity = new StringBuilder();
//        //service新接口
//        StringBuilder serviceMethod = new StringBuilder();
//        StringBuilder serviceImplMethod = new StringBuilder();
//
//        String[] ts = tableName.split("_");
//        StringBuilder conversionTableName = new StringBuilder();
//        StringBuilder conversionTableDOName = new StringBuilder();
//        for (String t:ts) {
//            conversionTableName.append(t.substring(0,1).toUpperCase()+t.substring(1));
//        }
//        conversionTableDOName.append(conversionTableName).append("DO");
//        //Dao
//        insertEntity.append("    @Insert(\"insert into "+tableName+"(");
//        insertEntity2.append(" values(");
//        String poIDName = "";
//        String tableIDName = "";
//        String poIDType = "";
//        StringBuilder setSQL = new StringBuilder();
//        setSQL.append("");
//        Boolean vpn = validateParamateNum(informationSchemas, exclude_fileds);
//        //设置Mapper:CRUD
//        String conversionTableNameLower = conversionTableName.toString().substring(0,1).toLowerCase()+conversionTableName.toString().substring(1);
//        String conversionTableDONameLower = conversionTableDOName.toString().substring(0,1).toLowerCase()+conversionTableDOName.toString().substring(1);
//
//        for (int i = 0; i < informationSchemas.size(); i++) {
//            StringBuilder columnName = new StringBuilder();
//            String cn = informationSchemas.get(i).getColumnName();
//            String[] cs = cn.split("_");
//            for (int j = 0; j < cs.length; j++) {
//                if(j==0){
//                    columnName.append(cs[j]);
//                }else{
//                    columnName.append(cs[j].substring(0,1).toUpperCase()).append(cs[j].substring(1));
//                }
//            }
//            String poDataType = formatSqlParamater(informationSchemas.get(i).getDataType());
//            if(i==0){
//                poIDName = columnName.toString();
//                tableIDName = cn;
//                poIDType = poDataType;
//            }
//            //Po
//            if(!exclude_fileds.contains(informationSchemas.get(i).getColumnName())){
//                //设置属性和注释
//                poParamaterEntity.append("\n    /**"+informationSchemas.get(i).getColumnComment()+"*/")
//                        .append("\n")
//                        .append("    private ").append(poDataType+" " + columnName +" ;")
//                        .append("\n");
//
//                //Get和Set方法
//                poParamaterGetSetEntity.append("    public ").append(poDataType+" ").
//                        append("get"+columnName.substring(0,1).toUpperCase()+columnName.substring(1)+"() {\n        return ").
//                        append(columnName+";\n    }").append("\n    public "+conversionTableName+" ").
//                        append("set"+columnName.substring(0,1).toUpperCase()+columnName.substring(1)+"(").
//                        append(poDataType+" ").
//                        append(columnName+") {\n").append("        this."+columnName+" = "+columnName+";\n        return this;\n    }\n");
//            }
//            //如果是第一个列(主键)
//            if(excludeParamater(i,cn)){
//                setSQL.append("        if("+conversionTableNameLower+".get"+columnName.toString().substring(0,1).toUpperCase()+columnName.toString().substring(1)+"()!=null){\n            updatesql.append(\""+cn+"=#{"+columnName+"} and \");\n        }\n");
//                if(!vpn||informationSchemas.size()==i+1){
//
//                    //设置Mapper里面的几个方法:放到这里是因为后面可以单独接入注解SQL的形式(需要获取列)进行开发
//                    insertMethod.append("    /**添加单条数据*/\n")
//                            .append("    public void insert").append(conversionTableName)
//                            .append("(").append(conversionTableDOName+" "+conversionTableDONameLower+");");
//
//                    updateMethod.append("    /**修改单条数据*/\n")
//                            .append("    public void update").append(conversionTableDOName)
//                            .append("(").append(conversionTableDOName+" "+conversionTableDONameLower+");");
//
//                    deleteMethod.append("    /**根据ID删除数据*/\n").append("    public void deleteById(")
//                            .append(poIDType+" "+poIDName+");");
//
//                    getMethod.append("    /**根据ID获取一条数据*/\n").append("    public ")
//                            .append(conversionTableDOName).append(" getById(")
//                            .append(poIDType+" "+poIDName+");");
//
//                    getAllMethod.append("    /**查询所有数据*/\n").append("    public List<").append(conversionTableDOName).append("> getAll();");
//
//
//                    //设置Service接口
//                    serviceMethod.append("\n    /**添加单条数据*/\n")
//                            .append("    public void insert").append(conversionTableName)
//                            .append("(").append(conversionTableDOName+" "+conversionTableDONameLower+");\n\n");
//
//                    serviceMethod.append("    /**修改单条数据*/\n")
//                            .append("    public void update").append(conversionTableDOName)
//                            .append("(").append(conversionTableDOName+" "+conversionTableDONameLower+");\n\n");
//
//                    serviceMethod.append("    /**根据ID删除数据*/\n").append("    public void deleteById(")
//                            .append(poIDType+" "+poIDName+");\n\n");
//
//                    serviceMethod.append("    /**根据ID获取一条数据*/\n").append("    public ")
//                            .append(conversionTableDOName).append(" getById(")
//                            .append(poIDType+" "+poIDName+");\n\n");
//
//                    serviceMethod.append("    /**查询所有数据*/\n").append("    public List<").append(conversionTableDOName).append("> getAll();\n\n");
//
//
//                    insertEntity2.append("#{"+columnName+"})\")\n");
//                    insertEntity.append(cn+") ");
//                    insertEntity.append(insertEntity2);
//                    insertEntity.append("    @Options(useGeneratedKeys=true, keyProperty=\""+poIDName+"\", keyColumn=\""+tableIDName+"\")\n").
//                            append("    int insert("+conversionTableName+" "+conversionTableNameLower+") throws  Exception;\n");
//                    deleteEntity.append("    @Update(\"update  "+tableName+" set is_status=1 where "+tableIDName+"=#{"+poIDName+"}\")\n").
//                            append("    int deleteById(@Param(\""+poIDName+"\") "+poIDType+" "+poIDName+") throws Exception;\n");
//                    selectEntity.append("    @Select(\"select * from "+tableName+" where is_status=0\")\n").
//                            append("    List<"+conversionTableName+"> selectAll() throws Exception;\n");
//                    getEntity.append("    @Select(\"select * from "+tableName+" where "+tableIDName+"=#{"+poIDName+"}  and is_status=0\")\n").
//                            append("    "+conversionTableName+" getById(@Param(\""+poIDName+"\") "+poIDType+" "+poIDName+") throws Exception;\n");
//                    updateEntity.append("    @SelectProvider(type="+conversionTableName+"ServiceImpl.class,method=\"updateSql\")\n" +
//                            "    int update("+conversionTableName+" "+conversionTableNameLower+");\n");
//
//                    //下面是service
//                    serviceEntity.append("    int insert("+conversionTableName+" "+conversionTableNameLower+");\n").
//                            append("    int update("+conversionTableName+" "+conversionTableNameLower+");\n").
//                            append("    List<"+conversionTableName+"> selectAll();\n").
//                            append("    "+conversionTableName+" getById("+poIDType+" "+poIDName+");\n").
//                            append("    int deleteById("+poIDType+" "+poIDName+");\n").
//                            append("    String updateSql("+conversionTableName+" "+conversionTableNameLower+");");
//
//                    serviceImplEntity.append("        @Autowired\n        private "+conversionTableName+"Dao "+conversionTableNameLower+"Dao;\n\n").
//                            append("        @Override\n        public int insert("+conversionTableName+" "+conversionTableNameLower+") {\n            Integer sql_status = null;\n            try {\n                sql_status = "+conversionTableNameLower+"Dao.insert("+conversionTableNameLower+");\n            }catch (Exception e){\n                e.printStackTrace();\n            }\n            return sql_status;\n            \n\t\t}\n\n").
//                            append("        @Override\n        public int update("+conversionTableName+" "+conversionTableNameLower+") {\n            Integer sql_status = null;\n            try {\n                sql_status = "+conversionTableNameLower+"Dao.update("+conversionTableNameLower+");\n            }catch (Exception e){\n                e.printStackTrace();\n            }\n            return sql_status;\n            \n\t\t}\n\n").
//                            append("        @Override\n        public List<"+conversionTableName+"> selectAll() {\n            List<"+conversionTableName+"> datas = null;\n            try {\n                datas = "+conversionTableNameLower+"Dao.selectAll();\n            }catch (Exception e){\n                e.printStackTrace();\n            }\n            return datas;\n            \n\t\t}\n\n").
//                            append("        @Override\n        public "+conversionTableName+" getById("+poIDType+" "+poIDName+") {\n            "+conversionTableName+" data = null;\n            try {\n                data = "+conversionTableNameLower+"Dao.getById("+poIDName+");\n            }catch (Exception e){\n                e.printStackTrace();\n            }\n            return data;\n            \n\t\t}\n\n").
//                            append("        @Override\n        public int deleteById("+poIDType+" "+poIDName+") {\n            Integer sql_status = null;\n            try {\n                sql_status = "+conversionTableNameLower+"Dao.deleteById("+poIDName+");\n            }catch (Exception e){\n                e.printStackTrace();\n            }\n            return sql_status;\n            \n\t\t}\n\n").
//                            append("        @Override\n        public String updateSql("+conversionTableName+" "+conversionTableNameLower+  ") {\n        StringBuilder updatesql = new StringBuilder();\n        updatesql.append(\"update "+tableName+" set \");\n"+setSQL+"        updatesql.delete(updatesql.length()-5,updatesql.length());\n        updatesql.append(\" where "+tableIDName+"=#{"+poIDName+"}\");\n        return updatesql.toString();\n\t\t}");
//                }else{
//                    insertEntity2.append("#{"+cn+"},");
//                    insertEntity.append(cn+",");
//                }
//            }
//        }
//        map.put("insertEntity",insertEntity.toString());
//        map.put("updateEntity",updateEntity.toString());
//        map.put("deleteEntity",deleteEntity.toString());
//        map.put("selectEntity",selectEntity.toString());
//        map.put("getEntity",getEntity.toString());
//
//        //mapper的
//        map.put("insertMethod",insertMethod.toString());
//        map.put("updateMethod",updateMethod.toString());
//        map.put("deleteMethod",deleteMethod.toString());
//        map.put("getMethod",getMethod.toString());
//        map.put("getAllMethod",getAllMethod.toString());
//
//        //service
//        map.put("serviceMethod",serviceMethod.toString());
//        map.put("serviceEntity",serviceEntity.toString());
//        map.put("serviceImplEntity",serviceImplEntity.toString());
//
//        map.put("poParamaterEntity",poParamaterEntity.toString());
//        map.put("poParamaterGetSetEntity",poParamaterGetSetEntity.toString());
//        map.put("poEntity",conversionTableName.toString());
//        return  map;
//    }

    public String getDataBaseName(){
        return data_base_name;
    }

    public static String formart(Date date, String type) {
        SimpleDateFormat formatter = null;
        if (type.equals("yyyy-MM-dd HH:mm:ss")) {
            formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } else if (type.equals("yyyy-MM-dd")) {
            formatter = new SimpleDateFormat("yyyy-MM-dd");
        } else if (type.equals("yyyyMMdd")) {
            formatter = new SimpleDateFormat("yyyyMMdd");
        } else {
            System.out.println("SimpleUtils.formart：输入的时间格式有误:"+type+"改为默认格式："+"yyyy-MM-dd HH:mm:ss");
            formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        String dateString = formatter.format(date);
        return dateString;
    }

}
