package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwDeviceUserDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: Mapper接口
 */
public interface TPwDeviceUserMapper {

    /**添加单条数据*/
    public void insertData(TPwDeviceUserDO tPwDeviceUserDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceUserDO tPwDeviceUserDO);

    /**根据ID删除数据*/
    public void deleteById(Integer deviceUserId);

    /**根据ID获取数据*/
    public TPwDeviceUserDO getById(Integer deviceUserId);

    /**获取所有数据*/
    public List<TPwDeviceUserDO> getAll();

}
