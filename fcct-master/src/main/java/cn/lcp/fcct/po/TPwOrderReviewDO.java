package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单审核记录表数据实体类
 */
@Data
public class TPwOrderReviewDO implements Serializable{

    /**编号信息*/
    private Integer reviewId ;

    /**订单Id*/
    private Integer orderId ;

    /**订单状态：1审核中2审核通过3已驳回4已派单5已安装*/
    private Integer orderStatus ;

    /**员工ID*/
    private Integer staffId ;

    /**操作意见和内容*/
    private String reviewComment ;

}
