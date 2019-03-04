package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceInstallRecordDO implements Serializable{

    /**安装工单列表*/
    private Integer recordId ;

    /**安装责任人t_pw_staff(staff_id)*/
    private Integer installStaffId ;

    /**设备编号t_pw_device(device_id)*/
    private Integer deviceId ;

    /**订单ID*/
    private Integer orderId ;

    /**设备状态*/
    private Integer deviceStatus ;

    /**创建时间*/
    private java.util.Date createDatetime ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
