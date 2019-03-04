package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwStockDO;
import cn.lcp.fcct.service.TPwStockService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品库存控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwStock")
public class TPwStockController {

        @Autowired
        private TPwStockService tPwStockService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwStockDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwStockDO tPwStockDO){
            log.info("添加单条TPwStockDO数据:"+tPwStockDO);
            tPwStockService.insertData(tPwStockDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwStockDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwStockDO tPwStockDO){
            log.info("修改单条TPwStockDO数据:"+tPwStockDO);
            tPwStockService.updateData(tPwStockDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwStockDO数据
         */
        @RequestMapping("/updateData/{stockId}")
        public void deleteById(@PathVariable("stockId")Integer stockId){
            log.info("根据ID删除TPwStockDO数据:"+stockId);
            tPwStockService.deleteById(stockId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwStockDO一条数据
         */
        @RequestMapping("/getById/{stockId}")
        public TPwStockDO getById(@PathVariable("stockId")Integer stockId){
            log.info("根据ID获取TPwStockDO一条数据:"+stockId);
            TPwStockDO tPwStock = tPwStockService.getById(stockId);
            return tPwStock;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwStockDO
         */
        @RequestMapping("/getAll")
        public List<TPwStockDO> getAll(){
            log.info("获取TPwStockDO所有条数据");
            List<TPwStockDO> tPwStockList = tPwStockService.getAll();
            return tPwStockList;
        }


}
