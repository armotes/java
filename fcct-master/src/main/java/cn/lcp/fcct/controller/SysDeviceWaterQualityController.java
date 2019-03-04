package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.SysDeviceWaterQualityDO;
import cn.lcp.fcct.service.SysDeviceWaterQualityService;
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
@RequestMapping("/sysDeviceWaterQuality")
public class SysDeviceWaterQualityController {

        @Autowired
        private SysDeviceWaterQualityService sysDeviceWaterQualityService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条SysDeviceWaterQualityDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody SysDeviceWaterQualityDO sysDeviceWaterQualityDO){
            log.info("添加单条SysDeviceWaterQualityDO数据:"+sysDeviceWaterQualityDO);
            sysDeviceWaterQualityService.insertData(sysDeviceWaterQualityDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条SysDeviceWaterQualityDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody SysDeviceWaterQualityDO sysDeviceWaterQualityDO){
            log.info("修改单条SysDeviceWaterQualityDO数据:"+sysDeviceWaterQualityDO);
            sysDeviceWaterQualityService.updateData(sysDeviceWaterQualityDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除SysDeviceWaterQualityDO数据
         */
        @RequestMapping("/updateData/{deviceWaterQualityId}")
        public void deleteById(@PathVariable("deviceWaterQualityId")Integer deviceWaterQualityId){
            log.info("根据ID删除SysDeviceWaterQualityDO数据:"+deviceWaterQualityId);
            sysDeviceWaterQualityService.deleteById(deviceWaterQualityId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取SysDeviceWaterQualityDO一条数据
         */
        @RequestMapping("/getById/{deviceWaterQualityId}")
        public SysDeviceWaterQualityDO getById(@PathVariable("deviceWaterQualityId")Integer deviceWaterQualityId){
            log.info("根据ID获取SysDeviceWaterQualityDO一条数据:"+deviceWaterQualityId);
            SysDeviceWaterQualityDO sysDeviceWaterQuality = sysDeviceWaterQualityService.getById(deviceWaterQualityId);
            return sysDeviceWaterQuality;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据SysDeviceWaterQualityDO
         */
        @RequestMapping("/getAll")
        public List<SysDeviceWaterQualityDO> getAll(){
            log.info("获取SysDeviceWaterQualityDO所有条数据");
            List<SysDeviceWaterQualityDO> sysDeviceWaterQualityList = sysDeviceWaterQualityService.getAll();
            return sysDeviceWaterQualityList;
        }


}
