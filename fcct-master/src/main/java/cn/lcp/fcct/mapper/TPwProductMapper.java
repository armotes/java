package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwProductDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品Mapper接口
 */
public interface TPwProductMapper {

    /**添加单条数据*/
    public void insertData(TPwProductDO tPwProductDO);

    /**修改单条数据*/
    public void updateData(TPwProductDO tPwProductDO);

    /**根据ID删除数据*/
    public void deleteById(Integer productId);

    /**根据ID获取数据*/
    public TPwProductDO getById(Integer productId);

    /**获取所有数据*/
    public List<TPwProductDO> getAll();

}
