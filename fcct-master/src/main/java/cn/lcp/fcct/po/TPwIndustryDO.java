package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业信息表数据实体类
 */
@Data
public class TPwIndustryDO implements Serializable{

    /**行业编号*/
    private Integer industryId ;

    /**行业的名字*/
    private String industryName ;

    /**行业描述*/
    private String industryDes ;

}
