package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceInstallListDO implements Serializable{

    /**安装工单列表*/
    private Integer listId ;

    /**安装责任人t_pw_staff(staff_id)*/
    private Integer installStaffId ;

    /**预约安装时间*/
    private java.util.Date timeAppointment ;

    /**责任人t_pw_staff(staff_id)*/
    private Integer respStaffId ;

    /**维护人员t_pw_staff(staff_id)*/
    private Integer maintainStaffId ;

    /**订单ID*/
    private Integer orderId ;

    /**备注*/
    private String memo ;

    /**创建时间*/
    private java.util.Date createDatetime ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
