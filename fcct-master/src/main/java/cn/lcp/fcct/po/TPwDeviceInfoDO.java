package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceInfoDO implements Serializable{

    /**设备编号*/
    private Integer deviceId ;

    /**工单ID（激活时选择）*/
    private Integer listId ;

    /**订单ID*/
    private Integer orderId ;

    /**设备编号*/
    private String deviceNumber ;

    /**设备地理位置（激活时上报）*/
    private String deviceLocation ;

    /**经度*/
    private  float deviceLongitude ;

    /**纬度*/
    private  float deviceLatitude ;

    /**设备状态（0：未激活；1：已激活；2：下线；3：异常；4：故障）*/
    private Integer deviceStatus ;

    /**信鸽ID*/
    private String pushId ;

    /**产品ID【t_pw_product(ID)】*/
    private Integer productId ;

    /**设备版本【新老版本兼容】*/
    private String deviceVersion ;

    /**单次取水最大流量ml*/
    private Integer maxGetwaterCapacity ;

    /**单次消费最大流量ml*/
    private Integer maxConsumeCapacity ;

    /**饮水机广告倒计时*/
    private Integer advsCountDown ;

    /**饮水机操作倒计时*/
    private Integer operationCountDown ;

    /**MD5生成的token,用于api接口登陆校验*/
    private String deviceToken ;

    /**机身编号*/
    private String machineNumber ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
