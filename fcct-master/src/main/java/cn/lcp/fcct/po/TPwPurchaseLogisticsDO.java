package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单物流信息数据实体类
 */
@Data
public class TPwPurchaseLogisticsDO implements Serializable{

    /**采购单物流ID*/
    private Integer logisticsId ;

    /**采购单ID*/
    private Integer purchaseId ;

    /**运单号*/
    private String logisticsBill ;

    /**物流图片url*/
    private String logisticsImagesUrl ;

    /**创建时间*/
    private java.util.Date creatTime ;

    /**添加者ID（员工ID）*/
    private Integer staffId ;

}
