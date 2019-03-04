package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户联系人信息表数据实体类
 */
@Data
public class TPwContactorInfoDO implements Serializable{

    /**联系人编号*/
    private Integer contactId ;

    /**客户编号t_pw_custom_info(customer_id)*/
    private Integer customerId ;

    /**联系人姓名*/
    private String contactName ;

    /**联系人职位*/
    private String contactPosition ;

    /**联系人电话*/
    private String contactTel ;

    /**联系人QQ*/
    private String contactQq ;

    /**联系人邮件*/
    private String contactEmail ;

    /**联系人地址*/
    private String contactAdd ;

    /**联系人备注*/
    private String contactMemo ;

    /**联系人状态*/
    private Integer contactStatus ;

    /**是否是主要联系人*/
    private Integer contactMain ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
