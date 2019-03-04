package cn.lcp.fcct.dao;

import cn.lcp.fcct.schema.DataBaseTableInfo;
import cn.lcp.fcct.schema.InformationSchema;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CodeFactoryDao {
    /**
     * @Auther: zhouaqiang
     * @DATE: 2019/2/21 0021 上午 9:55
     * @Description: 有的可以不用加这个and table_type='base table'
     */
    @Select("select REPLACE(table_name,'t_pw_','') from information_schema.tables where table_schema=#{data_base_name}")
    List<String> getTableName(@Param("data_base_name") String data_base_name);

    @Select("select table_name,table_comment from information_schema.tables where table_schema=#{data_base_name}")
    List<DataBaseTableInfo> getDataBaseTableInfo(@Param("data_base_name") String data_base_name);

    @Select("select column_name,data_type,column_comment from information_schema.columns where table_schema=#{data_base_name} and table_name=#{table_name}")
    List<InformationSchema> getColumnName(@Param("data_base_name") String data_base_name,@Param("table_name") String table_name);
}
