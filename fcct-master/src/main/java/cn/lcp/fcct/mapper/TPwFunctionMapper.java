package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwFunctionDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 功能【菜单】信息Mapper接口
 */
public interface TPwFunctionMapper {

    /**添加单条数据*/
    public void insertData(TPwFunctionDO tPwFunctionDO);

    /**修改单条数据*/
    public void updateData(TPwFunctionDO tPwFunctionDO);

    /**根据ID删除数据*/
    public void deleteById(Integer funId);

    /**根据ID获取数据*/
    public TPwFunctionDO getById(Integer funId);

    /**获取所有数据*/
    public List<TPwFunctionDO> getAll();

}
