package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.SysDeviceWaterQualityDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: Mapper接口
 */
public interface SysDeviceWaterQualityMapper {

    /**添加单条数据*/
    public void insertData(SysDeviceWaterQualityDO sysDeviceWaterQualityDO);

    /**修改单条数据*/
    public void updateData(SysDeviceWaterQualityDO sysDeviceWaterQualityDO);

    /**根据ID删除数据*/
    public void deleteById(Integer deviceWaterQualityId);

    /**根据ID获取数据*/
    public SysDeviceWaterQualityDO getById(Integer deviceWaterQualityId);

    /**获取所有数据*/
    public List<SysDeviceWaterQualityDO> getAll();

}
