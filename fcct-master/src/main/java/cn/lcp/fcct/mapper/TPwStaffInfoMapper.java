package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwStaffInfoDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 员工信息表Mapper接口
 */
public interface TPwStaffInfoMapper {

    /**添加单条数据*/
    public void insertData(TPwStaffInfoDO tPwStaffInfoDO);

    /**修改单条数据*/
    public void updateData(TPwStaffInfoDO tPwStaffInfoDO);

    /**根据ID删除数据*/
    public void deleteById(Integer staffId);

    /**根据ID获取数据*/
    public TPwStaffInfoDO getById(Integer staffId);

    /**获取所有数据*/
    public List<TPwStaffInfoDO> getAll();

}
