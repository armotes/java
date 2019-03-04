package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 功能【菜单】信息数据实体类
 */
@Data
public class TPwFunctionDO implements Serializable{

    /**功能编号*/
    private Integer funId ;

    /**父级菜单Id*/
    private Integer funParentId ;

    /**功能的类别【0:菜单、1:button】*/
    private Integer funCategory ;

    /**功能的名字*/
    private String funName ;

    /**菜单级别【1、顶级 2、二级】*/
    private Integer funLevel ;

    /**功能的键值[url/button KEY等]*/
    private String funKey ;

    /**ZH/EN,语言包*/
    private String language ;

    /**菜单排序*/
    private Integer funOrder ;

    /**功能位置*/
    private String funPosition ;

}
