package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwPurchaseDO;
import cn.lcp.fcct.service.TPwPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品采购单控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwPurchase")
public class TPwPurchaseController {

        @Autowired
        private TPwPurchaseService tPwPurchaseService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwPurchaseDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwPurchaseDO tPwPurchaseDO){
            log.info("添加单条TPwPurchaseDO数据:"+tPwPurchaseDO);
            tPwPurchaseService.insertData(tPwPurchaseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwPurchaseDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwPurchaseDO tPwPurchaseDO){
            log.info("修改单条TPwPurchaseDO数据:"+tPwPurchaseDO);
            tPwPurchaseService.updateData(tPwPurchaseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwPurchaseDO数据
         */
        @RequestMapping("/updateData/{purchaseId}")
        public void deleteById(@PathVariable("purchaseId")Integer purchaseId){
            log.info("根据ID删除TPwPurchaseDO数据:"+purchaseId);
            tPwPurchaseService.deleteById(purchaseId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwPurchaseDO一条数据
         */
        @RequestMapping("/getById/{purchaseId}")
        public TPwPurchaseDO getById(@PathVariable("purchaseId")Integer purchaseId){
            log.info("根据ID获取TPwPurchaseDO一条数据:"+purchaseId);
            TPwPurchaseDO tPwPurchase = tPwPurchaseService.getById(purchaseId);
            return tPwPurchase;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwPurchaseDO
         */
        @RequestMapping("/getAll")
        public List<TPwPurchaseDO> getAll(){
            log.info("获取TPwPurchaseDO所有条数据");
            List<TPwPurchaseDO> tPwPurchaseList = tPwPurchaseService.getAll();
            return tPwPurchaseList;
        }


}
