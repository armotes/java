package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceNoticeDO implements Serializable{

    /**主键*/
    private Integer noticeId ;

    /**设备ID*/
    private Integer deviceId ;

    /**pc:1.断网；2.滤芯不足;3.滤芯用完;4.水质异常;5.纸杯不足;6.纸杯用完;7.漏电;8.漏水;9.原水缺水;10.广告视频下载地址错误;11.串口通讯异常;12.租期到期;13.热水温度超高;14.冰水温度超低15.加热异常;16.制冷异常;17.流量计故障;18:制水故障;19.UV灯故障;100:水位开关故障;101:超水位;故障子类别:21.PP棉不足；22.颗粒活性炭不足；23.压缩活性炭不足；24.后置活性炭不足；25.RO反渗透膜不足31.PP棉用完；32.颗粒活性炭用完；33.压缩活性炭用完；34.后置活性炭用完；35.RO反渗透膜用完；*/
    private Integer noticeType ;

    /**预警级别(0：异常警告；1：严重故障)*/
    private Integer noticeLeve ;

    /**预警主题*/
    private String noticeSubject ;

    /**预警详情*/
    private String noticeContent ;

    /**预警次数*/
    private Integer noticeCount ;

    /**最后产生时间*/
    private java.util.Date lastUpdateTime ;

    /**后台用户ID t_pw_staff(staffID)*/
    private Integer staffId ;

    /**预警状态（0：30分钟内未处理；1：30分钟后未处理；2：电话通知；3：已知晓；4：处理中；5：维修中；6：已返厂；7：已处理。）*/
    private Integer deviceNoticeStatus ;

}
