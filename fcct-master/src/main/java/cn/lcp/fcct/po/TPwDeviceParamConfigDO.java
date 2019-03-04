package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceParamConfigDO implements Serializable{

    /**ID*/
    private Integer cfgId ;

    /**设备ID【t_pw_device(device_id)】*/
    private Integer deviceId ;

    /**巡检时间(单位分钟)*/
    private Integer cfgNetworkTime ;

    /**巡检次数(单位次)*/
    private Integer cfgNetworkTimes ;

    /**PP棉使用时间(单位天)*/
    private Integer cfgPpTime ;

    /**PP棉制水已使用流量(单位ml)*/
    private Integer cfgPpFlow ;

    /**PP棉制水最大流量(单位ml)*/
    private Integer cfgPpMaxFlow ;

    /**PP棉结算流量(RO机上传)*/
    private Integer cfgPpChangeFlow ;

    /**PP棉制更换时间*/
    private java.util.Date cfgPpChangeTime ;

    /**颗粒活性炭使用时间(单位天) 注：颗粒活性炭使用时长 100天*/
    private Integer cfgGrainCarbonTime ;

    /**颗粒活性炭制水已使用流量(ml)*/
    private Integer cfgGrainCarbonFlow ;

    /**颗粒活性炭制水最大流量(ml)*/
    private Integer cfgGrainCarbonMaxFlow ;

    /**颗粒活性炭结算流量(RO机上传)*/
    private Integer cfgGrainCarbonChangeFlow ;

    /**颗粒活性炭更换时间*/
    private java.util.Date cfgGrainCarbonChangeTime ;

    /**压缩活性炭使用时间(单位天)注：压缩活性炭使用时长 100天*/
    private Integer cfgPressCarbonTime ;

    /**压缩活性炭制水已使用流量(ml)*/
    private Integer cfgPressCarbonFlow ;

    /**压缩活性炭制水最大流量(ml)*/
    private Integer cfgPressCarbonMaxFlow ;

    /**压缩活性炭结算流量(RO机上传)*/
    private Integer cfgPressCarbonChangeFlow ;

    /**压缩活性炭更换时间*/
    private java.util.Date cfgPressCarbonChangeTime ;

    /**后置活性炭使用时间(单位天)注：后置活性炭使用时长 100天*/
    private Integer cfgPoseCarbonTime ;

    /**后置活性炭制水已使用流量(ml)*/
    private Integer cfgPoseCarbonFlow ;

    /**后置活性炭制水最大流量(ml)*/
    private Integer cfgPoseCarbonMaxFlow ;

    /**后置活性炭结算流量(RO机上传)*/
    private Integer cfgPoseCarbonChangeFlow ;

    /**后置活性炭更换时间*/
    private java.util.Date cfgPoseCarbonChangeTime ;

    /**RO反渗透膜使用时间(单位天)注：RO反渗透膜使用时长 540天*/
    private Integer cfgRoTime ;

    /**RO反渗透膜制水已使用流量(ml)*/
    private Integer cfgRoFlow ;

    /**RO反渗透膜制水最大流量(ml)*/
    private Integer cfgRoMaxFlow ;

    /**RO反渗透膜结算流量(RO机上传)*/
    private Integer cfgRoChangeFlow ;

    /**RO反渗透膜更换时间*/
    private java.util.Date cfgRoChangeTime ;

    /**监控数据上报时间间隔（单位分钟）(激活时间开始)*/
    private Integer cfgUpTime ;

    /**设备单次最大出水量（单位ml）*/
    private Integer cfgMaxFlow ;

    /**音量控制*/
    private Integer cfgVolume ;

    /**冲洗时间间隔(/分/次)*/
    private Integer cfgFlushInterval ;

    /**冲洗持续时长(/次/秒)*/
    private Integer cfgFlushDuration ;

    /**加热临界温度*/
    private Integer cfgHeatingTemp ;

    /**制冷临界温度*/
    private Integer cfgCoolingTemp ;

    /**是否加热(0-否 1-是)*/
    private Integer cfgHeatingAllday ;

    /**按时间段加热*/
    private String cfgHeatingInterval ;

    /**是否制冷(0-否 1-是)*/
    private Integer cfgCoolingAllday ;

    /**按时间段制冷*/
    private String cfgCoolingInterval ;

    /**RO机换算比例*/
    private Integer cfgConversionRatio ;

}
