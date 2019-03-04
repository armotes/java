package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwCompanyRespDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司水机责任人服务接口
 */
public interface TPwCompanyRespService {

    /**添加单条数据*/
    public void insertData(TPwCompanyRespDO tPwCompanyRespDO);

    /**修改单条数据*/
    public void updateData(TPwCompanyRespDO tPwCompanyRespDO);

    /**根据ID删除数据*/
    public void deleteById(Integer respId);

    /**根据ID获取数据*/
    public TPwCompanyRespDO getById(Integer respId);

    /**获取所有数据*/
    public List<TPwCompanyRespDO> getAll();
}
