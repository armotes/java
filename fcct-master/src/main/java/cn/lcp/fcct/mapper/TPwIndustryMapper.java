package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwIndustryDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业信息表Mapper接口
 */
public interface TPwIndustryMapper {

    /**添加单条数据*/
    public void insertData(TPwIndustryDO tPwIndustryDO);

    /**修改单条数据*/
    public void updateData(TPwIndustryDO tPwIndustryDO);

    /**根据ID删除数据*/
    public void deleteById(Integer industryId);

    /**根据ID获取数据*/
    public TPwIndustryDO getById(Integer industryId);

    /**获取所有数据*/
    public List<TPwIndustryDO> getAll();

}
