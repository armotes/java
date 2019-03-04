package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceLogFileDO implements Serializable{

    /**设备日志ID*/
    private Integer deviceFileId ;

    /**关联设备id T_pw_device(device_id)*/
    private Integer deviceId ;

    /**日志上传路径*/
    private String logUrl ;

    /**日志上传时间*/
    private java.util.Date logUploadTime ;

    /**MD5生成的上传回调key*/
    private String callKey ;

    /**后台推送用户id  T_pw_staff(staffId)*/
    private Integer staffId ;

    /**后台用户推送时间*/
    private java.util.Date userPushTime ;

    /**上传状态0,信息已推送 1成功 2失败中*/
    private Integer uploadStatus ;

}
