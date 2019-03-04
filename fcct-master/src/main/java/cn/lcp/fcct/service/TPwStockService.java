package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwStockDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品库存服务接口
 */
public interface TPwStockService {

    /**添加单条数据*/
    public void insertData(TPwStockDO tPwStockDO);

    /**修改单条数据*/
    public void updateData(TPwStockDO tPwStockDO);

    /**根据ID删除数据*/
    public void deleteById(Integer stockId);

    /**根据ID获取数据*/
    public TPwStockDO getById(Integer stockId);

    /**获取所有数据*/
    public List<TPwStockDO> getAll();
}
