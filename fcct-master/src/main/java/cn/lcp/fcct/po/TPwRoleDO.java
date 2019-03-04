package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色信息数据实体类
 */
@Data
public class TPwRoleDO implements Serializable{

    /**角色编号*/
    private Integer roleId ;

    /**角色的名字*/
    private String roleName ;

    /**角色描述*/
    private String roleDes ;

}
