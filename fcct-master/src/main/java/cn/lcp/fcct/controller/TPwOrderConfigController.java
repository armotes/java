package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwOrderConfigDO;
import cn.lcp.fcct.service.TPwOrderConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次策略表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwOrderConfig")
public class TPwOrderConfigController {

        @Autowired
        private TPwOrderConfigService tPwOrderConfigService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwOrderConfigDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwOrderConfigDO tPwOrderConfigDO){
            log.info("添加单条TPwOrderConfigDO数据:"+tPwOrderConfigDO);
            tPwOrderConfigService.insertData(tPwOrderConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwOrderConfigDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwOrderConfigDO tPwOrderConfigDO){
            log.info("修改单条TPwOrderConfigDO数据:"+tPwOrderConfigDO);
            tPwOrderConfigService.updateData(tPwOrderConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwOrderConfigDO数据
         */
        @RequestMapping("/updateData/{orderConfigId}")
        public void deleteById(@PathVariable("orderConfigId")Integer orderConfigId){
            log.info("根据ID删除TPwOrderConfigDO数据:"+orderConfigId);
            tPwOrderConfigService.deleteById(orderConfigId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwOrderConfigDO一条数据
         */
        @RequestMapping("/getById/{orderConfigId}")
        public TPwOrderConfigDO getById(@PathVariable("orderConfigId")Integer orderConfigId){
            log.info("根据ID获取TPwOrderConfigDO一条数据:"+orderConfigId);
            TPwOrderConfigDO tPwOrderConfig = tPwOrderConfigService.getById(orderConfigId);
            return tPwOrderConfig;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwOrderConfigDO
         */
        @RequestMapping("/getAll")
        public List<TPwOrderConfigDO> getAll(){
            log.info("获取TPwOrderConfigDO所有条数据");
            List<TPwOrderConfigDO> tPwOrderConfigList = tPwOrderConfigService.getAll();
            return tPwOrderConfigList;
        }


}
