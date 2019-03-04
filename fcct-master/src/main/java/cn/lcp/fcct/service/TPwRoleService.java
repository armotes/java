package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwRoleDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色信息服务接口
 */
public interface TPwRoleService {

    /**添加单条数据*/
    public void insertData(TPwRoleDO tPwRoleDO);

    /**修改单条数据*/
    public void updateData(TPwRoleDO tPwRoleDO);

    /**根据ID删除数据*/
    public void deleteById(Integer roleId);

    /**根据ID获取数据*/
    public TPwRoleDO getById(Integer roleId);

    /**获取所有数据*/
    public List<TPwRoleDO> getAll();
}
