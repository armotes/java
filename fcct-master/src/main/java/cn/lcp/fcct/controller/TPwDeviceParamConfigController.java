package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceParamConfigDO;
import cn.lcp.fcct.service.TPwDeviceParamConfigService;
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
@RequestMapping("/tPwDeviceParamConfig")
public class TPwDeviceParamConfigController {

        @Autowired
        private TPwDeviceParamConfigService tPwDeviceParamConfigService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceParamConfigDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceParamConfigDO tPwDeviceParamConfigDO){
            log.info("添加单条TPwDeviceParamConfigDO数据:"+tPwDeviceParamConfigDO);
            tPwDeviceParamConfigService.insertData(tPwDeviceParamConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceParamConfigDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceParamConfigDO tPwDeviceParamConfigDO){
            log.info("修改单条TPwDeviceParamConfigDO数据:"+tPwDeviceParamConfigDO);
            tPwDeviceParamConfigService.updateData(tPwDeviceParamConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceParamConfigDO数据
         */
        @RequestMapping("/updateData/{cfgId}")
        public void deleteById(@PathVariable("cfgId")Integer cfgId){
            log.info("根据ID删除TPwDeviceParamConfigDO数据:"+cfgId);
            tPwDeviceParamConfigService.deleteById(cfgId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceParamConfigDO一条数据
         */
        @RequestMapping("/getById/{cfgId}")
        public TPwDeviceParamConfigDO getById(@PathVariable("cfgId")Integer cfgId){
            log.info("根据ID获取TPwDeviceParamConfigDO一条数据:"+cfgId);
            TPwDeviceParamConfigDO tPwDeviceParamConfig = tPwDeviceParamConfigService.getById(cfgId);
            return tPwDeviceParamConfig;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceParamConfigDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceParamConfigDO> getAll(){
            log.info("获取TPwDeviceParamConfigDO所有条数据");
            List<TPwDeviceParamConfigDO> tPwDeviceParamConfigList = tPwDeviceParamConfigService.getAll();
            return tPwDeviceParamConfigList;
        }


}
