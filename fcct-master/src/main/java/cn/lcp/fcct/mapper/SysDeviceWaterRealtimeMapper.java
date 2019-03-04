package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.SysDeviceWaterRealtimeDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: Mapper接口
 */
public interface SysDeviceWaterRealtimeMapper {

    /**添加单条数据*/
    public void insertData(SysDeviceWaterRealtimeDO sysDeviceWaterRealtimeDO);

    /**修改单条数据*/
    public void updateData(SysDeviceWaterRealtimeDO sysDeviceWaterRealtimeDO);

    /**根据ID删除数据*/
    public void deleteById(Integer deviceId);

    /**根据ID获取数据*/
    public SysDeviceWaterRealtimeDO getById(Integer deviceId);

    /**获取所有数据*/
    public List<SysDeviceWaterRealtimeDO> getAll();

}
