package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwCustomInfoDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户信息表Mapper接口
 */
public interface TPwCustomInfoMapper {

    /**添加单条数据*/
    public void insertData(TPwCustomInfoDO tPwCustomInfoDO);

    /**修改单条数据*/
    public void updateData(TPwCustomInfoDO tPwCustomInfoDO);

    /**根据ID删除数据*/
    public void deleteById(Integer coustomerId);

    /**根据ID获取数据*/
    public TPwCustomInfoDO getById(Integer coustomerId);

    /**获取所有数据*/
    public List<TPwCustomInfoDO> getAll();

}
