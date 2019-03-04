package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwPurchaseLogisticsDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单物流信息服务接口
 */
public interface TPwPurchaseLogisticsService {

    /**添加单条数据*/
    public void insertData(TPwPurchaseLogisticsDO tPwPurchaseLogisticsDO);

    /**修改单条数据*/
    public void updateData(TPwPurchaseLogisticsDO tPwPurchaseLogisticsDO);

    /**根据ID删除数据*/
    public void deleteById(Integer logisticsId);

    /**根据ID获取数据*/
    public TPwPurchaseLogisticsDO getById(Integer logisticsId);

    /**获取所有数据*/
    public List<TPwPurchaseLogisticsDO> getAll();
}
