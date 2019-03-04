package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwCompanyIntroducerDO;
import cn.lcp.fcct.service.TPwCompanyIntroducerService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司引荐人控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwCompanyIntroducer")
public class TPwCompanyIntroducerController {

        @Autowired
        private TPwCompanyIntroducerService tPwCompanyIntroducerService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyIntroducerDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwCompanyIntroducerDO tPwCompanyIntroducerDO){
            log.info("添加单条TPwCompanyIntroducerDO数据:"+tPwCompanyIntroducerDO);
            tPwCompanyIntroducerService.insertData(tPwCompanyIntroducerDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyIntroducerDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwCompanyIntroducerDO tPwCompanyIntroducerDO){
            log.info("修改单条TPwCompanyIntroducerDO数据:"+tPwCompanyIntroducerDO);
            tPwCompanyIntroducerService.updateData(tPwCompanyIntroducerDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyIntroducerDO数据
         */
        @RequestMapping("/updateData/{introId}")
        public void deleteById(@PathVariable("introId")Integer introId){
            log.info("根据ID删除TPwCompanyIntroducerDO数据:"+introId);
            tPwCompanyIntroducerService.deleteById(introId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyIntroducerDO一条数据
         */
        @RequestMapping("/getById/{introId}")
        public TPwCompanyIntroducerDO getById(@PathVariable("introId")Integer introId){
            log.info("根据ID获取TPwCompanyIntroducerDO一条数据:"+introId);
            TPwCompanyIntroducerDO tPwCompanyIntroducer = tPwCompanyIntroducerService.getById(introId);
            return tPwCompanyIntroducer;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyIntroducerDO
         */
        @RequestMapping("/getAll")
        public List<TPwCompanyIntroducerDO> getAll(){
            log.info("获取TPwCompanyIntroducerDO所有条数据");
            List<TPwCompanyIntroducerDO> tPwCompanyIntroducerList = tPwCompanyIntroducerService.getAll();
            return tPwCompanyIntroducerList;
        }


}
