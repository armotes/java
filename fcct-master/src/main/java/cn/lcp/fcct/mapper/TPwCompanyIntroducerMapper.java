package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwCompanyIntroducerDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司引荐人Mapper接口
 */
public interface TPwCompanyIntroducerMapper {

    /**添加单条数据*/
    public void insertData(TPwCompanyIntroducerDO tPwCompanyIntroducerDO);

    /**修改单条数据*/
    public void updateData(TPwCompanyIntroducerDO tPwCompanyIntroducerDO);

    /**根据ID删除数据*/
    public void deleteById(Integer introId);

    /**根据ID获取数据*/
    public TPwCompanyIntroducerDO getById(Integer introId);

    /**获取所有数据*/
    public List<TPwCompanyIntroducerDO> getAll();

}
