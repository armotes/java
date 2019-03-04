package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwStockLogDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品出入库记录Mapper接口
 */
public interface TPwStockLogMapper {

    /**添加单条数据*/
    public void insertData(TPwStockLogDO tPwStockLogDO);

    /**修改单条数据*/
    public void updateData(TPwStockLogDO tPwStockLogDO);

    /**根据ID删除数据*/
    public void deleteById(Integer stockLogId);

    /**根据ID获取数据*/
    public TPwStockLogDO getById(Integer stockLogId);

    /**获取所有数据*/
    public List<TPwStockLogDO> getAll();

}
