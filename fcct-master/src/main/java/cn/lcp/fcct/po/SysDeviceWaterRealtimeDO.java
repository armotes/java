package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 数据实体类
 */
@Data
public class SysDeviceWaterRealtimeDO implements Serializable{

    /**设备id(相当于外键,无需自增,由AO对象赋值)*/
    private Integer deviceId ;

    /**原水水质*/
    private java.math.BigDecimal deviceRawWater ;

    /**纯水水质*/
    private java.math.BigDecimal devicePureWater ;

    /**检测时间*/
    private java.util.Date deviceWaterQualityTime ;

    /**热水温度*/
    private Integer hotTemp ;

    /**冷水温度*/
    private Integer coldTemp ;

    /**是否正在制热：1-是，0-否*/
    private Integer heatingStatus ;

    /**是否正在制冷：1-是，0-否*/
    private Integer coolingStatus ;

    /**是否正在制水：1-是，0-否*/
    private Integer waterPurificationStatus ;

    /**是否正在冲洗：1-是，0-否*/
    private Integer FlushStatus ;

    /**原水状态：1：正常（不缺水），0-异常（缺水）*/
    private Integer rawWaterStatus ;

    /**漏水状态：1：正常（未漏水）0-异常（漏水）*/
    private Integer waterLeakageStatus ;

    /**开关机状态：1-开机，0-关机*/
    private Integer switchStatus ;

    /**服务开关机状态：1-开机，0-关机*/
    private Integer shutdownStatus ;

    /**水杯状态：1-正常（被缺杯）；0-异常（缺杯）*/
    private Integer waterCupStatus ;

    /**热水出水状态：1：出水中；0-停止*/
    private Integer hotWaterOutletStatus ;

    /**冷水出水状态：1：出水中；0-停止*/
    private Integer coldWaterOutletStatus ;

    /**温水出水状态：1：出水中；0-停止*/
    private Integer warmWaterOutletStatus ;

    /**加热设备温度*/
    private Integer heatingTemp ;

    /**制冷设备温度*/
    private Integer coolingTemp ;

    /**冲洗间隔(小时)*/
    private Integer flushInterval ;

    /**冲洗时长(秒)*/
    private Integer flushDuration ;

    /**设备最后使用时间*/
    private java.util.Date deviceLastUseTime ;

    /**设备最后在线时间*/
    private java.util.Date deviceLastOnlineTime ;

    /**设备原水总量ml*/
    private Integer deviceRawFlow ;

    /**设备售水总量ml*/
    private Integer deviceSaleFlow ;

}
