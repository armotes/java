package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwDeviceUseDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: Mapper接口
 */
public interface TPwDeviceUseMapper {

    /**添加单条数据*/
    public void insertData(TPwDeviceUseDO tPwDeviceUseDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceUseDO tPwDeviceUseDO);

    /**根据ID删除数据*/
    public void deleteById(Integer deviceUseId);

    /**根据ID获取数据*/
    public TPwDeviceUseDO getById(Integer deviceUseId);

    /**获取所有数据*/
    public List<TPwDeviceUseDO> getAll();

}
