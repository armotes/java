package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwPurchaseLogisticsDO;
import cn.lcp.fcct.service.TPwPurchaseLogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单物流信息控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwPurchaseLogistics")
public class TPwPurchaseLogisticsController {

        @Autowired
        private TPwPurchaseLogisticsService tPwPurchaseLogisticsService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwPurchaseLogisticsDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwPurchaseLogisticsDO tPwPurchaseLogisticsDO){
            log.info("添加单条TPwPurchaseLogisticsDO数据:"+tPwPurchaseLogisticsDO);
            tPwPurchaseLogisticsService.insertData(tPwPurchaseLogisticsDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwPurchaseLogisticsDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwPurchaseLogisticsDO tPwPurchaseLogisticsDO){
            log.info("修改单条TPwPurchaseLogisticsDO数据:"+tPwPurchaseLogisticsDO);
            tPwPurchaseLogisticsService.updateData(tPwPurchaseLogisticsDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwPurchaseLogisticsDO数据
         */
        @RequestMapping("/updateData/{logisticsId}")
        public void deleteById(@PathVariable("logisticsId")Integer logisticsId){
            log.info("根据ID删除TPwPurchaseLogisticsDO数据:"+logisticsId);
            tPwPurchaseLogisticsService.deleteById(logisticsId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwPurchaseLogisticsDO一条数据
         */
        @RequestMapping("/getById/{logisticsId}")
        public TPwPurchaseLogisticsDO getById(@PathVariable("logisticsId")Integer logisticsId){
            log.info("根据ID获取TPwPurchaseLogisticsDO一条数据:"+logisticsId);
            TPwPurchaseLogisticsDO tPwPurchaseLogistics = tPwPurchaseLogisticsService.getById(logisticsId);
            return tPwPurchaseLogistics;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwPurchaseLogisticsDO
         */
        @RequestMapping("/getAll")
        public List<TPwPurchaseLogisticsDO> getAll(){
            log.info("获取TPwPurchaseLogisticsDO所有条数据");
            List<TPwPurchaseLogisticsDO> tPwPurchaseLogisticsList = tPwPurchaseLogisticsService.getAll();
            return tPwPurchaseLogisticsList;
        }


}
