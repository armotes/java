package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceUserDO implements Serializable{

    /**主键*/
    private Integer deviceUserId ;

    /**设备ID*/
    private Integer deviceId ;

    /**用户ID*/
    private Integer userId ;

    /**备注*/
    private String memo ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
