package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceLogFileDO;
import cn.lcp.fcct.service.TPwDeviceLogFileService;
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
@RequestMapping("/tPwDeviceLogFile")
public class TPwDeviceLogFileController {

        @Autowired
        private TPwDeviceLogFileService tPwDeviceLogFileService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceLogFileDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceLogFileDO tPwDeviceLogFileDO){
            log.info("添加单条TPwDeviceLogFileDO数据:"+tPwDeviceLogFileDO);
            tPwDeviceLogFileService.insertData(tPwDeviceLogFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceLogFileDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceLogFileDO tPwDeviceLogFileDO){
            log.info("修改单条TPwDeviceLogFileDO数据:"+tPwDeviceLogFileDO);
            tPwDeviceLogFileService.updateData(tPwDeviceLogFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceLogFileDO数据
         */
        @RequestMapping("/updateData/{deviceFileId}")
        public void deleteById(@PathVariable("deviceFileId")Integer deviceFileId){
            log.info("根据ID删除TPwDeviceLogFileDO数据:"+deviceFileId);
            tPwDeviceLogFileService.deleteById(deviceFileId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceLogFileDO一条数据
         */
        @RequestMapping("/getById/{deviceFileId}")
        public TPwDeviceLogFileDO getById(@PathVariable("deviceFileId")Integer deviceFileId){
            log.info("根据ID获取TPwDeviceLogFileDO一条数据:"+deviceFileId);
            TPwDeviceLogFileDO tPwDeviceLogFile = tPwDeviceLogFileService.getById(deviceFileId);
            return tPwDeviceLogFile;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceLogFileDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceLogFileDO> getAll(){
            log.info("获取TPwDeviceLogFileDO所有条数据");
            List<TPwDeviceLogFileDO> tPwDeviceLogFileList = tPwDeviceLogFileService.getAll();
            return tPwDeviceLogFileList;
        }


}
