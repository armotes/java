package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwIndustryAreaDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业区域信息表Mapper接口
 */
public interface TPwIndustryAreaMapper {

    /**添加单条数据*/
    public void insertData(TPwIndustryAreaDO tPwIndustryAreaDO);

    /**修改单条数据*/
    public void updateData(TPwIndustryAreaDO tPwIndustryAreaDO);

    /**根据ID删除数据*/
    public void deleteById(Integer areaId);

    /**根据ID获取数据*/
    public TPwIndustryAreaDO getById(Integer areaId);

    /**获取所有数据*/
    public List<TPwIndustryAreaDO> getAll();

}
