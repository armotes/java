package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwCompanyRespDO;
import cn.lcp.fcct.service.TPwCompanyRespService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司水机责任人控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwCompanyResp")
public class TPwCompanyRespController {

        @Autowired
        private TPwCompanyRespService tPwCompanyRespService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyRespDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwCompanyRespDO tPwCompanyRespDO){
            log.info("添加单条TPwCompanyRespDO数据:"+tPwCompanyRespDO);
            tPwCompanyRespService.insertData(tPwCompanyRespDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyRespDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwCompanyRespDO tPwCompanyRespDO){
            log.info("修改单条TPwCompanyRespDO数据:"+tPwCompanyRespDO);
            tPwCompanyRespService.updateData(tPwCompanyRespDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyRespDO数据
         */
        @RequestMapping("/updateData/{respId}")
        public void deleteById(@PathVariable("respId")Integer respId){
            log.info("根据ID删除TPwCompanyRespDO数据:"+respId);
            tPwCompanyRespService.deleteById(respId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyRespDO一条数据
         */
        @RequestMapping("/getById/{respId}")
        public TPwCompanyRespDO getById(@PathVariable("respId")Integer respId){
            log.info("根据ID获取TPwCompanyRespDO一条数据:"+respId);
            TPwCompanyRespDO tPwCompanyResp = tPwCompanyRespService.getById(respId);
            return tPwCompanyResp;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyRespDO
         */
        @RequestMapping("/getAll")
        public List<TPwCompanyRespDO> getAll(){
            log.info("获取TPwCompanyRespDO所有条数据");
            List<TPwCompanyRespDO> tPwCompanyRespList = tPwCompanyRespService.getAll();
            return tPwCompanyRespList;
        }


}
