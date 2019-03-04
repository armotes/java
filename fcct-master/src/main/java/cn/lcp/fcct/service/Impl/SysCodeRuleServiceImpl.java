package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.SysCodeRuleMapper;
import cn.lcp.fcct.po.SysCodeRuleDO;
import cn.lcp.fcct.service.SysCodeRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 编码规则服务实现类
 */
@Slf4j
@Service
public class SysCodeRuleServiceImpl implements SysCodeRuleService {


        @Autowired
        private SysCodeRuleMapper sysCodeRuleMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条SysCodeRuleDO数据
         */
        @Override
        public void insertData(SysCodeRuleDO sysCodeRuleDO){
            log.info("添加单条SysCodeRuleDO数据:"+sysCodeRuleDO);
            sysCodeRuleMapper.insertData(sysCodeRuleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条SysCodeRuleDO数据
         */
        @Override
        public void updateData(SysCodeRuleDO sysCodeRuleDO){
            log.info("修改单条SysCodeRuleDO数据:"+sysCodeRuleDO);
            sysCodeRuleMapper.updateData(sysCodeRuleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除SysCodeRuleDO数据
         */
        @Override
        public void deleteById(Integer sysCodeRuleId){
            log.info("根据ID删除SysCodeRuleDO数据:"+sysCodeRuleId);
            sysCodeRuleMapper.deleteById(sysCodeRuleId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取SysCodeRuleDO一条数据
         */
        @Override
        public SysCodeRuleDO getById(Integer sysCodeRuleId){
            log.info("根据ID获取SysCodeRuleDO一条数据:"+sysCodeRuleId);
            SysCodeRuleDO sysCodeRule = sysCodeRuleMapper.getById(sysCodeRuleId);
            return sysCodeRule;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据SysCodeRuleDO
         */
        @Override
        public List<SysCodeRuleDO> getAll(){
            log.info("获取SysCodeRuleDO所有条数据");
            List<SysCodeRuleDO> sysCodeRuleList = sysCodeRuleMapper.getAll();
            return sysCodeRuleList;
        }


}
