package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwPurchaseReviewDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单审核表服务接口
 */
public interface TPwPurchaseReviewService {

    /**添加单条数据*/
    public void insertData(TPwPurchaseReviewDO tPwPurchaseReviewDO);

    /**修改单条数据*/
    public void updateData(TPwPurchaseReviewDO tPwPurchaseReviewDO);

    /**根据ID删除数据*/
    public void deleteById(Integer purchaseCheckId);

    /**根据ID获取数据*/
    public TPwPurchaseReviewDO getById(Integer purchaseCheckId);

    /**获取所有数据*/
    public List<TPwPurchaseReviewDO> getAll();
}
