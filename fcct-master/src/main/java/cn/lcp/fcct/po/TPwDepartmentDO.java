package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 部门类型数据实体类
 */
@Data
public class TPwDepartmentDO implements Serializable{

    /**部门编号*/
    private Integer deptId ;

    /**部门名称*/
    private String deptName ;

    /**部门层级*/
    private Integer deptLevel ;

    /**所属公司编号*/
    private Integer comId ;

    /**部门类型:0部门,1公司*/
    private Integer deptType ;

    /**无父级此值为:0*/
    private Integer parentDepId ;

}
