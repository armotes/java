package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceInstallRecordDO;
import cn.lcp.fcct.service.TPwDeviceInstallRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwDeviceInstallRecord")
public class TPwDeviceInstallRecordController {

        @Autowired
        private TPwDeviceInstallRecordService tPwDeviceInstallRecordService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceInstallRecordDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceInstallRecordDO tPwDeviceInstallRecordDO){
            log.info("添加单条TPwDeviceInstallRecordDO数据:"+tPwDeviceInstallRecordDO);
            tPwDeviceInstallRecordService.insertData(tPwDeviceInstallRecordDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceInstallRecordDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceInstallRecordDO tPwDeviceInstallRecordDO){
            log.info("修改单条TPwDeviceInstallRecordDO数据:"+tPwDeviceInstallRecordDO);
            tPwDeviceInstallRecordService.updateData(tPwDeviceInstallRecordDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceInstallRecordDO数据
         */
        @RequestMapping("/updateData/{recordId}")
        public void deleteById(@PathVariable("recordId")Integer recordId){
            log.info("根据ID删除TPwDeviceInstallRecordDO数据:"+recordId);
            tPwDeviceInstallRecordService.deleteById(recordId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceInstallRecordDO一条数据
         */
        @RequestMapping("/getById/{recordId}")
        public TPwDeviceInstallRecordDO getById(@PathVariable("recordId")Integer recordId){
            log.info("根据ID获取TPwDeviceInstallRecordDO一条数据:"+recordId);
            TPwDeviceInstallRecordDO tPwDeviceInstallRecord = tPwDeviceInstallRecordService.getById(recordId);
            return tPwDeviceInstallRecord;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceInstallRecordDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceInstallRecordDO> getAll(){
            log.info("获取TPwDeviceInstallRecordDO所有条数据");
            List<TPwDeviceInstallRecordDO> tPwDeviceInstallRecordList = tPwDeviceInstallRecordService.getAll();
            return tPwDeviceInstallRecordList;
        }


}
