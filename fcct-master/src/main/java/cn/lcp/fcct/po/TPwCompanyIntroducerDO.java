package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司引荐人数据实体类
 */
@Data
public class TPwCompanyIntroducerDO implements Serializable{

    /**类型编号*/
    private Integer introId ;

    /**公司编号*/
    private Integer comId ;

    /**引荐人*/
    private Integer staffId ;

}
