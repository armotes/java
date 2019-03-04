package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.SysDeviceWaterRealtimeDO;
import cn.lcp.fcct.service.SysDeviceWaterRealtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 控制器
 */
@Slf4j
@RestController
@RequestMapping("/sysDeviceWaterRealtime")
public class SysDeviceWaterRealtimeController {

        @Autowired
        private SysDeviceWaterRealtimeService sysDeviceWaterRealtimeService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条SysDeviceWaterRealtimeDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody SysDeviceWaterRealtimeDO sysDeviceWaterRealtimeDO){
            log.info("添加单条SysDeviceWaterRealtimeDO数据:"+sysDeviceWaterRealtimeDO);
            sysDeviceWaterRealtimeService.insertData(sysDeviceWaterRealtimeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条SysDeviceWaterRealtimeDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody SysDeviceWaterRealtimeDO sysDeviceWaterRealtimeDO){
            log.info("修改单条SysDeviceWaterRealtimeDO数据:"+sysDeviceWaterRealtimeDO);
            sysDeviceWaterRealtimeService.updateData(sysDeviceWaterRealtimeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除SysDeviceWaterRealtimeDO数据
         */
        @RequestMapping("/updateData/{deviceId}")
        public void deleteById(@PathVariable("deviceId")Integer deviceId){
            log.info("根据ID删除SysDeviceWaterRealtimeDO数据:"+deviceId);
            sysDeviceWaterRealtimeService.deleteById(deviceId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取SysDeviceWaterRealtimeDO一条数据
         */
        @RequestMapping("/getById/{deviceId}")
        public SysDeviceWaterRealtimeDO getById(@PathVariable("deviceId")Integer deviceId){
            log.info("根据ID获取SysDeviceWaterRealtimeDO一条数据:"+deviceId);
            SysDeviceWaterRealtimeDO sysDeviceWaterRealtime = sysDeviceWaterRealtimeService.getById(deviceId);
            return sysDeviceWaterRealtime;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据SysDeviceWaterRealtimeDO
         */
        @RequestMapping("/getAll")
        public List<SysDeviceWaterRealtimeDO> getAll(){
            log.info("获取SysDeviceWaterRealtimeDO所有条数据");
            List<SysDeviceWaterRealtimeDO> sysDeviceWaterRealtimeList = sysDeviceWaterRealtimeService.getAll();
            return sysDeviceWaterRealtimeList;
        }


}
