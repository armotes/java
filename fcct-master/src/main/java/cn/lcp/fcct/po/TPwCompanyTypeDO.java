package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司类型数据实体类
 */
@Data
public class TPwCompanyTypeDO implements Serializable{

    /**类型编号*/
    private Integer typeId ;

    /**类型的公司*/
    private String typeName ;

    /**类型的图片*/
    private String typeIcon ;

}
