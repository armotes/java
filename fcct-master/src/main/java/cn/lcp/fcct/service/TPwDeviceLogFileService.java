package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwDeviceLogFileDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 服务接口
 */
public interface TPwDeviceLogFileService {

    /**添加单条数据*/
    public void insertData(TPwDeviceLogFileDO tPwDeviceLogFileDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceLogFileDO tPwDeviceLogFileDO);

    /**根据ID删除数据*/
    public void deleteById(Integer deviceFileId);

    /**根据ID获取数据*/
    public TPwDeviceLogFileDO getById(Integer deviceFileId);

    /**获取所有数据*/
    public List<TPwDeviceLogFileDO> getAll();
}
