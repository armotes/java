package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户信息表数据实体类
 */
@Data
public class TPwCustomInfoDO implements Serializable{

    /**客户编号*/
    private Integer coustomerId ;

    /**客户负责人ID*/
    private Integer respStaffId ;

    /**所属公司t_pw_company(com_id)*/
    private Integer companyId ;

    /**客户名称*/
    private String customerName ;

    /**客户电话*/
    private String customerTel ;

    /**客户地址*/
    private String customerAdd ;

    /**客户备注*/
    private String customerMemo ;

    /**客户状态*/
    private Integer customerStatus ;

    /**所属行业t_pw_industry(industry_id)*/
    private Integer industryId ;

    /**创建人ID*/
    private Integer createStaffId ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
