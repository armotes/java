package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceUseDO;
import cn.lcp.fcct.service.TPwDeviceUseService;
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
@RequestMapping("/tPwDeviceUse")
public class TPwDeviceUseController {

        @Autowired
        private TPwDeviceUseService tPwDeviceUseService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceUseDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceUseDO tPwDeviceUseDO){
            log.info("添加单条TPwDeviceUseDO数据:"+tPwDeviceUseDO);
            tPwDeviceUseService.insertData(tPwDeviceUseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceUseDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceUseDO tPwDeviceUseDO){
            log.info("修改单条TPwDeviceUseDO数据:"+tPwDeviceUseDO);
            tPwDeviceUseService.updateData(tPwDeviceUseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceUseDO数据
         */
        @RequestMapping("/updateData/{deviceUseId}")
        public void deleteById(@PathVariable("deviceUseId")Integer deviceUseId){
            log.info("根据ID删除TPwDeviceUseDO数据:"+deviceUseId);
            tPwDeviceUseService.deleteById(deviceUseId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceUseDO一条数据
         */
        @RequestMapping("/getById/{deviceUseId}")
        public TPwDeviceUseDO getById(@PathVariable("deviceUseId")Integer deviceUseId){
            log.info("根据ID获取TPwDeviceUseDO一条数据:"+deviceUseId);
            TPwDeviceUseDO tPwDeviceUse = tPwDeviceUseService.getById(deviceUseId);
            return tPwDeviceUse;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceUseDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceUseDO> getAll(){
            log.info("获取TPwDeviceUseDO所有条数据");
            List<TPwDeviceUseDO> tPwDeviceUseList = tPwDeviceUseService.getAll();
            return tPwDeviceUseList;
        }


}
