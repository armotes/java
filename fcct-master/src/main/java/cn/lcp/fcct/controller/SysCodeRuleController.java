package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.SysCodeRuleDO;
import cn.lcp.fcct.service.SysCodeRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 编码规则控制器
 */
@Slf4j
@RestController
@RequestMapping("/sysCodeRule")
public class SysCodeRuleController {

        @Autowired
        private SysCodeRuleService sysCodeRuleService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条SysCodeRuleDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody SysCodeRuleDO sysCodeRuleDO){
            log.info("添加单条SysCodeRuleDO数据:"+sysCodeRuleDO);
            sysCodeRuleService.insertData(sysCodeRuleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条SysCodeRuleDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody SysCodeRuleDO sysCodeRuleDO){
            log.info("修改单条SysCodeRuleDO数据:"+sysCodeRuleDO);
            sysCodeRuleService.updateData(sysCodeRuleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除SysCodeRuleDO数据
         */
        @RequestMapping("/updateData/{sysCodeRuleId}")
        public void deleteById(@PathVariable("sysCodeRuleId")Integer sysCodeRuleId){
            log.info("根据ID删除SysCodeRuleDO数据:"+sysCodeRuleId);
            sysCodeRuleService.deleteById(sysCodeRuleId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取SysCodeRuleDO一条数据
         */
        @RequestMapping("/getById/{sysCodeRuleId}")
        public SysCodeRuleDO getById(@PathVariable("sysCodeRuleId")Integer sysCodeRuleId){
            log.info("根据ID获取SysCodeRuleDO一条数据:"+sysCodeRuleId);
            SysCodeRuleDO sysCodeRule = sysCodeRuleService.getById(sysCodeRuleId);
            return sysCodeRule;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据SysCodeRuleDO
         */
        @RequestMapping("/getAll")
        public List<SysCodeRuleDO> getAll(){
            log.info("获取SysCodeRuleDO所有条数据");
            List<SysCodeRuleDO> sysCodeRuleList = sysCodeRuleService.getAll();
            return sysCodeRuleList;
        }


}
