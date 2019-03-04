package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwCustomInfoDO;
import cn.lcp.fcct.service.TPwCustomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户信息表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwCustomInfo")
public class TPwCustomInfoController {

        @Autowired
        private TPwCustomInfoService tPwCustomInfoService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwCustomInfoDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwCustomInfoDO tPwCustomInfoDO){
            log.info("添加单条TPwCustomInfoDO数据:"+tPwCustomInfoDO);
            tPwCustomInfoService.insertData(tPwCustomInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwCustomInfoDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwCustomInfoDO tPwCustomInfoDO){
            log.info("修改单条TPwCustomInfoDO数据:"+tPwCustomInfoDO);
            tPwCustomInfoService.updateData(tPwCustomInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwCustomInfoDO数据
         */
        @RequestMapping("/updateData/{coustomerId}")
        public void deleteById(@PathVariable("coustomerId")Integer coustomerId){
            log.info("根据ID删除TPwCustomInfoDO数据:"+coustomerId);
            tPwCustomInfoService.deleteById(coustomerId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwCustomInfoDO一条数据
         */
        @RequestMapping("/getById/{coustomerId}")
        public TPwCustomInfoDO getById(@PathVariable("coustomerId")Integer coustomerId){
            log.info("根据ID获取TPwCustomInfoDO一条数据:"+coustomerId);
            TPwCustomInfoDO tPwCustomInfo = tPwCustomInfoService.getById(coustomerId);
            return tPwCustomInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwCustomInfoDO
         */
        @RequestMapping("/getAll")
        public List<TPwCustomInfoDO> getAll(){
            log.info("获取TPwCustomInfoDO所有条数据");
            List<TPwCustomInfoDO> tPwCustomInfoList = tPwCustomInfoService.getAll();
            return tPwCustomInfoList;
        }


}
