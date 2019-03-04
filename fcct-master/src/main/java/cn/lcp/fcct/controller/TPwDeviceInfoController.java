package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceInfoDO;
import cn.lcp.fcct.service.TPwDeviceInfoService;
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
@RequestMapping("/tPwDeviceInfo")
public class TPwDeviceInfoController {

        @Autowired
        private TPwDeviceInfoService tPwDeviceInfoService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceInfoDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceInfoDO tPwDeviceInfoDO){
            log.info("添加单条TPwDeviceInfoDO数据:"+tPwDeviceInfoDO);
            tPwDeviceInfoService.insertData(tPwDeviceInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceInfoDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceInfoDO tPwDeviceInfoDO){
            log.info("修改单条TPwDeviceInfoDO数据:"+tPwDeviceInfoDO);
            tPwDeviceInfoService.updateData(tPwDeviceInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceInfoDO数据
         */
        @RequestMapping("/updateData/{deviceId}")
        public void deleteById(@PathVariable("deviceId")Integer deviceId){
            log.info("根据ID删除TPwDeviceInfoDO数据:"+deviceId);
            tPwDeviceInfoService.deleteById(deviceId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceInfoDO一条数据
         */
        @RequestMapping("/getById/{deviceId}")
        public TPwDeviceInfoDO getById(@PathVariable("deviceId")Integer deviceId){
            log.info("根据ID获取TPwDeviceInfoDO一条数据:"+deviceId);
            TPwDeviceInfoDO tPwDeviceInfo = tPwDeviceInfoService.getById(deviceId);
            return tPwDeviceInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceInfoDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceInfoDO> getAll(){
            log.info("获取TPwDeviceInfoDO所有条数据");
            List<TPwDeviceInfoDO> tPwDeviceInfoList = tPwDeviceInfoService.getAll();
            return tPwDeviceInfoList;
        }


}
