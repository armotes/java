package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品出入库记录数据实体类
 */
@Data
public class TPwStockLogDO implements Serializable{

    /***/
    private Integer stockLogId ;

    /**产品型号ID*/
    private Integer productId ;

    /**操作登记的员工ID*/
    private Integer staffId ;

    /**数量*/
    private Integer stockNum ;

    /**入库（出库）时间*/
    private java.util.Date stockLogTime ;

    /**入库或出库(0入库；1出库)*/
    private Integer stockLogStatus ;

    /**备注（若是正常订单流程将自动存储“订单ID”）*/
    private String stockLogMemo ;

    /**入库或出库(0自动；1手动)*/
    private Integer stockLogType ;

}
