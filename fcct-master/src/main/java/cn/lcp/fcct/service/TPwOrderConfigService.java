package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwOrderConfigDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次策略表服务接口
 */
public interface TPwOrderConfigService {

    /**添加单条数据*/
    public void insertData(TPwOrderConfigDO tPwOrderConfigDO);

    /**修改单条数据*/
    public void updateData(TPwOrderConfigDO tPwOrderConfigDO);

    /**根据ID删除数据*/
    public void deleteById(Integer orderConfigId);

    /**根据ID获取数据*/
    public TPwOrderConfigDO getById(Integer orderConfigId);

    /**获取所有数据*/
    public List<TPwOrderConfigDO> getAll();
}
