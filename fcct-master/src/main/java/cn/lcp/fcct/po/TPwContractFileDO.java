package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单合同文件表数据实体类
 */
@Data
public class TPwContractFileDO implements Serializable{

    /**自动增长编号*/
    private Integer fileId ;

    /**订单Id*/
    private Integer orderId ;

    /**文件名称*/
    private String fileName ;

    /**文件大小(单位为B)*/
    private Integer fileSize ;

    /**文件路径*/
    private String filePath ;

    /**上传的员工编号t_pw_staff(staff_id)*/
    private Integer staffId ;

}
