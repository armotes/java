package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwContactorInfoDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户联系人信息表Mapper接口
 */
public interface TPwContactorInfoMapper {

    /**添加单条数据*/
    public void insertData(TPwContactorInfoDO tPwContactorInfoDO);

    /**修改单条数据*/
    public void updateData(TPwContactorInfoDO tPwContactorInfoDO);

    /**根据ID删除数据*/
    public void deleteById(Integer contactId);

    /**根据ID获取数据*/
    public TPwContactorInfoDO getById(Integer contactId);

    /**获取所有数据*/
    public List<TPwContactorInfoDO> getAll();

}
