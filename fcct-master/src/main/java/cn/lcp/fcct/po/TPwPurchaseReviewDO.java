package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单审核表数据实体类
 */
@Data
public class TPwPurchaseReviewDO implements Serializable{

    /**采购审核ID*/
    private Integer purchaseCheckId ;

    /**采购单ID*/
    private Integer purchaseId ;

    /**审核状态0审核中,1审核通过,2已驳回*/
    private Integer checkStatus ;

    /**审核意见*/
    private Integer memo ;

    /**审核人ID(员工ID)*/
    private Integer staffId ;

    /**创建时间*/
    private java.util.Date checkTime ;

}
