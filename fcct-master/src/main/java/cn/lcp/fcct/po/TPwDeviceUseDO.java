package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 数据实体类
 */
@Data
public class TPwDeviceUseDO implements Serializable{

    /**主键ID*/
    private Integer deviceUseId ;

    /**设备ID（外键)*/
    private Integer deviceId ;

    /**耗材类别（1：PP棉；2：颗粒活性炭；3：压缩活性炭；4：后置活性炭；5：RO反渗透膜；6：增压泵）*/
    private Integer deviceUseType ;

    /**更换时间*/
    private java.util.Date deviceUseTime ;

}
