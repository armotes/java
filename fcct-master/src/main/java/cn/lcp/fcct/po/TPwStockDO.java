package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品库存数据实体类
 */
@Data
public class TPwStockDO implements Serializable{

    /**主键*/
    private Integer stockId ;

    /**产品ID*/
    private Integer productId ;

    /**产品库存数量*/
    private Integer stockCount ;

    /**所属公司编号*/
    private Integer comId ;

}
