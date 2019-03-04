package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwDeviceParamConfigDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 服务接口
 */
public interface TPwDeviceParamConfigService {

    /**添加单条数据*/
    public void insertData(TPwDeviceParamConfigDO tPwDeviceParamConfigDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceParamConfigDO tPwDeviceParamConfigDO);

    /**根据ID删除数据*/
    public void deleteById(Integer cfgId);

    /**根据ID获取数据*/
    public TPwDeviceParamConfigDO getById(Integer cfgId);

    /**获取所有数据*/
    public List<TPwDeviceParamConfigDO> getAll();
}
