package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 员工信息表数据实体类
 */
@Data
public class TPwStaffInfoDO implements Serializable{

    /**员工编号*/
    private Integer staffId ;

    /**员工别名*/
    private String staffAliasName ;

    /**员工真实姓名,作操作日志用*/
    private String staffRealName ;

    /**员工的公司邮箱*/
    private String staffEmail ;

    /**角色编号【t_pw_function（roleId）】*/
    private Integer roleId ;

    /**公司编号【t_pw_company（comId）】*/
    private Integer comId ;

    /**员工图像*/
    private String staffIcon ;

    /**登录密码*/
    private String staffPwd ;

    /**员工电话*/
    private String staffTel ;

    /**微信通用Id*/
    private String wxUnionId ;

    /**OpenId*/
    private String wxOpenId ;

    /**个人工作台*/
    private String staffDashboard ;

    /**员工IP*/
    private String staffIp ;

    /**员工账户状态*/
    private Integer staffStatus ;

    /**员工最后更新时间*/
    private java.util.Date lastUpdateTime ;

    /**部门ID【t_pw_department】*/
    private Integer deptId ;

}
