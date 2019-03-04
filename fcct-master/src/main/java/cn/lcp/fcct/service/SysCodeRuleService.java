package cn.lcp.fcct.service;

import cn.lcp.fcct.po.SysCodeRuleDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 编码规则服务接口
 */
public interface SysCodeRuleService {

    /**添加单条数据*/
    public void insertData(SysCodeRuleDO sysCodeRuleDO);

    /**修改单条数据*/
    public void updateData(SysCodeRuleDO sysCodeRuleDO);

    /**根据ID删除数据*/
    public void deleteById(Integer sysCodeRuleId);

    /**根据ID获取数据*/
    public SysCodeRuleDO getById(Integer sysCodeRuleId);

    /**获取所有数据*/
    public List<SysCodeRuleDO> getAll();
}
