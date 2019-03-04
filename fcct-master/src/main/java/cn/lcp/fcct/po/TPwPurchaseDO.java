package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品采购单数据实体类
 */
@Data
public class TPwPurchaseDO implements Serializable{

    /**采购单ID*/
    private Integer purchaseId ;

    /**产品ID*/
    private Integer productId ;

    /**采购单位*/
    private Integer comId ;

    /**采购数量*/
    private Integer purchaseCount ;

    /**预期采购时间*/
    private java.util.Date expectTime ;

    /**实际到货时间*/
    private java.util.Date realTime ;

    /**创建时间*/
    private java.util.Date creatTime ;

    /**添加者ID（员工ID）*/
    private Integer staffId ;

    /**审核状态0审核中,1审核通过,2已驳回*/
    private Integer checkStatus ;

    /**采购流程状态0未开始,1进行中,2已完成*/
    private Integer purchaseStatus ;

}
