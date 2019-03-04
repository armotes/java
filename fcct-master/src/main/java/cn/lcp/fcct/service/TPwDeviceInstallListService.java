package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwDeviceInstallListDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 服务接口
 */
public interface TPwDeviceInstallListService {

    /**添加单条数据*/
    public void insertData(TPwDeviceInstallListDO tPwDeviceInstallListDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceInstallListDO tPwDeviceInstallListDO);

    /**根据ID删除数据*/
    public void deleteById(Integer listId);

    /**根据ID获取数据*/
    public TPwDeviceInstallListDO getById(Integer listId);

    /**获取所有数据*/
    public List<TPwDeviceInstallListDO> getAll();
}
