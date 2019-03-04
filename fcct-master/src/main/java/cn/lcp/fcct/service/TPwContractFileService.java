package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwContractFileDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单合同文件表服务接口
 */
public interface TPwContractFileService {

    /**添加单条数据*/
    public void insertData(TPwContractFileDO tPwContractFileDO);

    /**修改单条数据*/
    public void updateData(TPwContractFileDO tPwContractFileDO);

    /**根据ID删除数据*/
    public void deleteById(Integer fileId);

    /**根据ID获取数据*/
    public TPwContractFileDO getById(Integer fileId);

    /**获取所有数据*/
    public List<TPwContractFileDO> getAll();
}
