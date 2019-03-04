package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品数据实体类
 */
@Data
public class TPwProductDO implements Serializable{

    /**产品ID*/
    private Integer productId ;

    /**产品型号*/
    private String productModel ;

    /**产品名称*/
    private String productName ;

    /**产品类型（1设备 2家用机 3零配件）*/
    private Integer productType ;

    /**成本价*/
    private java.math.BigDecimal productCostPrice ;

    /**建议零售价*/
    private java.math.BigDecimal productSuggestedPrice ;

    /**研发团队*/
    private String productDepTeam ;

    /**研发时间*/
    private java.util.Date productDepTime ;

    /**产品描述(备注)*/
    private String productMemo ;

    /**添加者ID（员工ID）*/
    private Integer staffId ;

    /**创建时间*/
    private java.util.Date creatTime ;

    /**0-未发布，1-上线，2下线*/
    private Integer productStatus ;

    /**主图地址*/
    private String productMainImagePath ;

}
