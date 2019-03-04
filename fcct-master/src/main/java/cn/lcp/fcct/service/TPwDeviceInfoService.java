package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwDeviceInfoDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 服务接口
 */
public interface TPwDeviceInfoService {

    /**添加单条数据*/
    public void insertData(TPwDeviceInfoDO tPwDeviceInfoDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceInfoDO tPwDeviceInfoDO);

    /**根据ID删除数据*/
    public void deleteById(Integer deviceId);

    /**根据ID获取数据*/
    public TPwDeviceInfoDO getById(Integer deviceId);

    /**获取所有数据*/
    public List<TPwDeviceInfoDO> getAll();
}
