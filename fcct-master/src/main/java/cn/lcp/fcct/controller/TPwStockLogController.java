package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwStockLogDO;
import cn.lcp.fcct.service.TPwStockLogService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品出入库记录控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwStockLog")
public class TPwStockLogController {

        @Autowired
        private TPwStockLogService tPwStockLogService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwStockLogDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwStockLogDO tPwStockLogDO){
            log.info("添加单条TPwStockLogDO数据:"+tPwStockLogDO);
            tPwStockLogService.insertData(tPwStockLogDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwStockLogDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwStockLogDO tPwStockLogDO){
            log.info("修改单条TPwStockLogDO数据:"+tPwStockLogDO);
            tPwStockLogService.updateData(tPwStockLogDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwStockLogDO数据
         */
        @RequestMapping("/updateData/{stockLogId}")
        public void deleteById(@PathVariable("stockLogId")Integer stockLogId){
            log.info("根据ID删除TPwStockLogDO数据:"+stockLogId);
            tPwStockLogService.deleteById(stockLogId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwStockLogDO一条数据
         */
        @RequestMapping("/getById/{stockLogId}")
        public TPwStockLogDO getById(@PathVariable("stockLogId")Integer stockLogId){
            log.info("根据ID获取TPwStockLogDO一条数据:"+stockLogId);
            TPwStockLogDO tPwStockLog = tPwStockLogService.getById(stockLogId);
            return tPwStockLog;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwStockLogDO
         */
        @RequestMapping("/getAll")
        public List<TPwStockLogDO> getAll(){
            log.info("获取TPwStockLogDO所有条数据");
            List<TPwStockLogDO> tPwStockLogList = tPwStockLogService.getAll();
            return tPwStockLogList;
        }


}
