package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwDeviceInstallRecordDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: Mapper接口
 */
public interface TPwDeviceInstallRecordMapper {

    /**添加单条数据*/
    public void insertData(TPwDeviceInstallRecordDO tPwDeviceInstallRecordDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceInstallRecordDO tPwDeviceInstallRecordDO);

    /**根据ID删除数据*/
    public void deleteById(Integer recordId);

    /**根据ID获取数据*/
    public TPwDeviceInstallRecordDO getById(Integer recordId);

    /**获取所有数据*/
    public List<TPwDeviceInstallRecordDO> getAll();

}
