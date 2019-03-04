package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwOrderReviewDO;
import cn.lcp.fcct.service.TPwOrderReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单审核记录表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwOrderReview")
public class TPwOrderReviewController {

        @Autowired
        private TPwOrderReviewService tPwOrderReviewService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwOrderReviewDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwOrderReviewDO tPwOrderReviewDO){
            log.info("添加单条TPwOrderReviewDO数据:"+tPwOrderReviewDO);
            tPwOrderReviewService.insertData(tPwOrderReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwOrderReviewDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwOrderReviewDO tPwOrderReviewDO){
            log.info("修改单条TPwOrderReviewDO数据:"+tPwOrderReviewDO);
            tPwOrderReviewService.updateData(tPwOrderReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwOrderReviewDO数据
         */
        @RequestMapping("/updateData/{reviewId}")
        public void deleteById(@PathVariable("reviewId")Integer reviewId){
            log.info("根据ID删除TPwOrderReviewDO数据:"+reviewId);
            tPwOrderReviewService.deleteById(reviewId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwOrderReviewDO一条数据
         */
        @RequestMapping("/getById/{reviewId}")
        public TPwOrderReviewDO getById(@PathVariable("reviewId")Integer reviewId){
            log.info("根据ID获取TPwOrderReviewDO一条数据:"+reviewId);
            TPwOrderReviewDO tPwOrderReview = tPwOrderReviewService.getById(reviewId);
            return tPwOrderReview;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwOrderReviewDO
         */
        @RequestMapping("/getAll")
        public List<TPwOrderReviewDO> getAll(){
            log.info("获取TPwOrderReviewDO所有条数据");
            List<TPwOrderReviewDO> tPwOrderReviewList = tPwOrderReviewService.getAll();
            return tPwOrderReviewList;
        }


}
