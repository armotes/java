package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色和功能【菜单】关联表数据实体类
 */
@Data
public class TPwRoleFunDO implements Serializable{

    /**关联编号*/
    private Integer tId ;

    /**功能编号：【t_pw_function（funId）】*/
    private Integer funId ;

    /**角色编号【t_pw_role（roleId）】*/
    private Integer roleId ;

}
