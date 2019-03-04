package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwOrderDO;
import cn.lcp.fcct.service.TPwOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwOrder")
public class TPwOrderController {

        @Autowired
        private TPwOrderService tPwOrderService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwOrderDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwOrderDO tPwOrderDO){
            log.info("添加单条TPwOrderDO数据:"+tPwOrderDO);
            tPwOrderService.insertData(tPwOrderDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwOrderDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwOrderDO tPwOrderDO){
            log.info("修改单条TPwOrderDO数据:"+tPwOrderDO);
            tPwOrderService.updateData(tPwOrderDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwOrderDO数据
         */
        @RequestMapping("/updateData/{orderId}")
        public void deleteById(@PathVariable("orderId")Integer orderId){
            log.info("根据ID删除TPwOrderDO数据:"+orderId);
            tPwOrderService.deleteById(orderId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwOrderDO一条数据
         */
        @RequestMapping("/getById/{orderId}")
        public TPwOrderDO getById(@PathVariable("orderId")Integer orderId){
            log.info("根据ID获取TPwOrderDO一条数据:"+orderId);
            TPwOrderDO tPwOrder = tPwOrderService.getById(orderId);
            return tPwOrder;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwOrderDO
         */
        @RequestMapping("/getAll")
        public List<TPwOrderDO> getAll(){
            log.info("获取TPwOrderDO所有条数据");
            List<TPwOrderDO> tPwOrderList = tPwOrderService.getAll();
            return tPwOrderList;
        }


}
