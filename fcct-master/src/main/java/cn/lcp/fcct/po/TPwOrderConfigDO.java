package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次策略表数据实体类
 */
@Data
public class TPwOrderConfigDO implements Serializable{

    /**配置消息*/
    private Integer orderConfigId ;

    /**滤芯数量*/
    private Integer filterNum ;

    /**热水单价*/
    private java.math.BigDecimal hotPrice ;

    /**温水单价*/
    private java.math.BigDecimal warmPrice ;

    /**冰水单价*/
    private java.math.BigDecimal coldPrice ;

    /**纸杯单价*/
    private java.math.BigDecimal cupPrice ;

    /**设备使用年限*/
    private java.util.Date useTime ;

    /**单词取水最大流量ml*/
    private Integer maxGetwaterCapacity ;

    /**单次消费最大流量ml*/
    private Integer maxConsumeCapacity ;

    /**饮水机广告倒计时*/
    private Integer advsCountDown ;

    /**饮水机操作倒计时*/
    private Integer operationCountdown ;

    /**RO机换算比例(默认值为1100)*/
    private Integer conversionRatio ;

    /**备注*/
    private String memo ;

    /**创建时间*/
    private java.util.Date createDatetime ;

}
