package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwPurchaseReviewDO;
import cn.lcp.fcct.service.TPwPurchaseReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单审核表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwPurchaseReview")
public class TPwPurchaseReviewController {

        @Autowired
        private TPwPurchaseReviewService tPwPurchaseReviewService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwPurchaseReviewDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwPurchaseReviewDO tPwPurchaseReviewDO){
            log.info("添加单条TPwPurchaseReviewDO数据:"+tPwPurchaseReviewDO);
            tPwPurchaseReviewService.insertData(tPwPurchaseReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwPurchaseReviewDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwPurchaseReviewDO tPwPurchaseReviewDO){
            log.info("修改单条TPwPurchaseReviewDO数据:"+tPwPurchaseReviewDO);
            tPwPurchaseReviewService.updateData(tPwPurchaseReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwPurchaseReviewDO数据
         */
        @RequestMapping("/updateData/{purchaseCheckId}")
        public void deleteById(@PathVariable("purchaseCheckId")Integer purchaseCheckId){
            log.info("根据ID删除TPwPurchaseReviewDO数据:"+purchaseCheckId);
            tPwPurchaseReviewService.deleteById(purchaseCheckId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwPurchaseReviewDO一条数据
         */
        @RequestMapping("/getById/{purchaseCheckId}")
        public TPwPurchaseReviewDO getById(@PathVariable("purchaseCheckId")Integer purchaseCheckId){
            log.info("根据ID获取TPwPurchaseReviewDO一条数据:"+purchaseCheckId);
            TPwPurchaseReviewDO tPwPurchaseReview = tPwPurchaseReviewService.getById(purchaseCheckId);
            return tPwPurchaseReview;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwPurchaseReviewDO
         */
        @RequestMapping("/getAll")
        public List<TPwPurchaseReviewDO> getAll(){
            log.info("获取TPwPurchaseReviewDO所有条数据");
            List<TPwPurchaseReviewDO> tPwPurchaseReviewList = tPwPurchaseReviewService.getAll();
            return tPwPurchaseReviewList;
        }


}
