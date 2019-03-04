package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwPurchaseDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品采购单Mapper接口
 */
public interface TPwPurchaseMapper {

    /**添加单条数据*/
    public void insertData(TPwPurchaseDO tPwPurchaseDO);

    /**修改单条数据*/
    public void updateData(TPwPurchaseDO tPwPurchaseDO);

    /**根据ID删除数据*/
    public void deleteById(Integer purchaseId);

    /**根据ID获取数据*/
    public TPwPurchaseDO getById(Integer purchaseId);

    /**获取所有数据*/
    public List<TPwPurchaseDO> getAll();

}
