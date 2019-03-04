package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司水机责任人数据实体类
 */
@Data
public class TPwCompanyRespDO implements Serializable{

    /**责任编号*/
    private Integer respId ;

    /**公司编号*/
    private Integer comId ;

    /**引荐人*/
    private Integer staffId ;

    /**是否主要责任:0是,1不是*/
    private Integer respMain ;

    /**责任级别*/
    private Integer respLevel ;

    /**员工最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
