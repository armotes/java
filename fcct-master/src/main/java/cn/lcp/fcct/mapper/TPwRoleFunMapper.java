package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwRoleFunDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色和功能【菜单】关联表Mapper接口
 */
public interface TPwRoleFunMapper {

    /**添加单条数据*/
    public void insertData(TPwRoleFunDO tPwRoleFunDO);

    /**修改单条数据*/
    public void updateData(TPwRoleFunDO tPwRoleFunDO);

    /**根据ID删除数据*/
    public void deleteById(Integer tId);

    /**根据ID获取数据*/
    public TPwRoleFunDO getById(Integer tId);

    /**获取所有数据*/
    public List<TPwRoleFunDO> getAll();

}
