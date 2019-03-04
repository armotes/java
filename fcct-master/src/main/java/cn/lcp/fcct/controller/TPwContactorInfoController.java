package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwContactorInfoDO;
import cn.lcp.fcct.service.TPwContactorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户联系人信息表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwContactorInfo")
public class TPwContactorInfoController {

        @Autowired
        private TPwContactorInfoService tPwContactorInfoService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwContactorInfoDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwContactorInfoDO tPwContactorInfoDO){
            log.info("添加单条TPwContactorInfoDO数据:"+tPwContactorInfoDO);
            tPwContactorInfoService.insertData(tPwContactorInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwContactorInfoDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwContactorInfoDO tPwContactorInfoDO){
            log.info("修改单条TPwContactorInfoDO数据:"+tPwContactorInfoDO);
            tPwContactorInfoService.updateData(tPwContactorInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwContactorInfoDO数据
         */
        @RequestMapping("/updateData/{contactId}")
        public void deleteById(@PathVariable("contactId")Integer contactId){
            log.info("根据ID删除TPwContactorInfoDO数据:"+contactId);
            tPwContactorInfoService.deleteById(contactId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwContactorInfoDO一条数据
         */
        @RequestMapping("/getById/{contactId}")
        public TPwContactorInfoDO getById(@PathVariable("contactId")Integer contactId){
            log.info("根据ID获取TPwContactorInfoDO一条数据:"+contactId);
            TPwContactorInfoDO tPwContactorInfo = tPwContactorInfoService.getById(contactId);
            return tPwContactorInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwContactorInfoDO
         */
        @RequestMapping("/getAll")
        public List<TPwContactorInfoDO> getAll(){
            log.info("获取TPwContactorInfoDO所有条数据");
            List<TPwContactorInfoDO> tPwContactorInfoList = tPwContactorInfoService.getAll();
            return tPwContactorInfoList;
        }


}
