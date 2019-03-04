package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司信息表数据实体类
 */
@Data
public class TPwCompanyDO implements Serializable{

    /**公司的主键编号*/
    private Integer comId ;

    /**公司名字*/
    private String comName ;

    /**公司类型表*/
    private Integer typeId ;

    /**公司法人*/
    private String comVatPep ;

    /**公司地址*/
    private String comAdd ;

    /**公司营业执照*/
    private String comPic ;

    /**公司电话*/
    private String comTel ;

    /**公司账号银行名称*/
    private String accountBank ;

    /**银行账号*/
    private String account ;

    /**合作状态:0正常,1解约*/
    private Integer comStatus ;

    /**分成比例*/
    private float divRate ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
