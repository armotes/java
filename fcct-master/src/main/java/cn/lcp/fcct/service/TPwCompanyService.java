package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwCompanyDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司信息表服务接口
 */
public interface TPwCompanyService {

    /**添加单条数据*/
    public void insertData(TPwCompanyDO tPwCompanyDO);

    /**修改单条数据*/
    public void updateData(TPwCompanyDO tPwCompanyDO);

    /**根据ID删除数据*/
    public void deleteById(Integer comId);

    /**根据ID获取数据*/
    public TPwCompanyDO getById(Integer comId);

    /**获取所有数据*/
    public List<TPwCompanyDO> getAll();
}
