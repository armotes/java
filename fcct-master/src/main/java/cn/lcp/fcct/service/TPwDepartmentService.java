package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwDepartmentDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 部门类型服务接口
 */
public interface TPwDepartmentService {

    /**添加单条数据*/
    public void insertData(TPwDepartmentDO tPwDepartmentDO);

    /**修改单条数据*/
    public void updateData(TPwDepartmentDO tPwDepartmentDO);

    /**根据ID删除数据*/
    public void deleteById(Integer deptId);

    /**根据ID获取数据*/
    public TPwDepartmentDO getById(Integer deptId);

    /**获取所有数据*/
    public List<TPwDepartmentDO> getAll();
}
