package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwOrderDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次表服务接口
 */
public interface TPwOrderService {

    /**添加单条数据*/
    public void insertData(TPwOrderDO tPwOrderDO);

    /**修改单条数据*/
    public void updateData(TPwOrderDO tPwOrderDO);

    /**根据ID删除数据*/
    public void deleteById(Integer orderId);

    /**根据ID获取数据*/
    public TPwOrderDO getById(Integer orderId);

    /**获取所有数据*/
    public List<TPwOrderDO> getAll();
}
