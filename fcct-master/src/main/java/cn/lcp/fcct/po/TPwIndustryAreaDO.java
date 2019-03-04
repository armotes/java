package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业区域信息表数据实体类
 */
@Data
public class TPwIndustryAreaDO implements Serializable{

    /**行业区域编号*/
    private Integer areaId ;

    /**行业区域的名字[名字需唯一]*/
    private String areaName ;

    /**区域类型:1局部;2所有*/
    private Integer areaType ;

    /**行业区域描述*/
    private String areaDes ;

    /**行业区域所属于的省*/
    private String areaProvince ;

    /**区域所在的城市*/
    private String areaCity ;

    /**最后更新时间*/
    private java.util.Date lastUpdateTime ;

}
