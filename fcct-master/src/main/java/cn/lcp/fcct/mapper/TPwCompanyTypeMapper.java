package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwCompanyTypeDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司类型Mapper接口
 */
public interface TPwCompanyTypeMapper {

    /**添加单条数据*/
    public void insertData(TPwCompanyTypeDO tPwCompanyTypeDO);

    /**修改单条数据*/
    public void updateData(TPwCompanyTypeDO tPwCompanyTypeDO);

    /**根据ID删除数据*/
    public void deleteById(Integer typeId);

    /**根据ID获取数据*/
    public TPwCompanyTypeDO getById(Integer typeId);

    /**获取所有数据*/
    public List<TPwCompanyTypeDO> getAll();

}
