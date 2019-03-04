package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次表数据实体类
 */
@Data
public class TPwOrderDO implements Serializable{

    /**自动生成序列号*/
    private Integer orderId ;

    /**负责员工Id t_pw_staff(staff_id)*/
    private Integer respStaffId ;

    /**创建员工Id t_pw_staff(staff_id)*/
    private Integer createStaffId ;

    /**订单联系人Id(t_pw_contactor_info(contact_id)*/
    private Integer contactId ;

    /**客户Id t_pw_custom_info(customer_id)*/
    private Integer customerId ;

    /**产品单价*/
    private java.math.BigDecimal singlePrice ;

    /**设备数量*/
    private Integer deviceCount ;

    /**收费模式(1:售水;2:租赁;3:零售;5:学校)*/
    private Integer chargeMode ;

    /**预约安装时间*/
    private java.util.Date appointmentTime ;

    /**租赁到期时间*/
    private java.util.Date rentTime ;

    /**备注*/
    private String memo ;

    /**所属行业t_pw_industry(industry_id)*/
    private Integer industryId ;

    /**水机所属行业区域t_pw_industry_area(area_id)*/
    private Integer areaId ;

    /**批次策略t_order_batch_config(batch_config_id)*/
    private Integer orderConfigId ;

    /**创建时间*/
    private java.util.Date createDatetime ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

    /**公司Id t_pw_company_info(com_id)*/
    private Integer comId ;

    /**产品Id t_pw_product(product_id)*/
    private Integer productId ;

    /**订单状态：1审核中2审核通过3已驳回4已派单5已安装*/
    private Integer orderStatus ;

    /**审核意见*/
    private String reviewComment ;

}
