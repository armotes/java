package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwIndustryDO;
import cn.lcp.fcct.service.TPwIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业信息表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwIndustry")
public class TPwIndustryController {

        @Autowired
        private TPwIndustryService tPwIndustryService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwIndustryDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwIndustryDO tPwIndustryDO){
            log.info("添加单条TPwIndustryDO数据:"+tPwIndustryDO);
            tPwIndustryService.insertData(tPwIndustryDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwIndustryDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwIndustryDO tPwIndustryDO){
            log.info("修改单条TPwIndustryDO数据:"+tPwIndustryDO);
            tPwIndustryService.updateData(tPwIndustryDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwIndustryDO数据
         */
        @RequestMapping("/updateData/{industryId}")
        public void deleteById(@PathVariable("industryId")Integer industryId){
            log.info("根据ID删除TPwIndustryDO数据:"+industryId);
            tPwIndustryService.deleteById(industryId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwIndustryDO一条数据
         */
        @RequestMapping("/getById/{industryId}")
        public TPwIndustryDO getById(@PathVariable("industryId")Integer industryId){
            log.info("根据ID获取TPwIndustryDO一条数据:"+industryId);
            TPwIndustryDO tPwIndustry = tPwIndustryService.getById(industryId);
            return tPwIndustry;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwIndustryDO
         */
        @RequestMapping("/getAll")
        public List<TPwIndustryDO> getAll(){
            log.info("获取TPwIndustryDO所有条数据");
            List<TPwIndustryDO> tPwIndustryList = tPwIndustryService.getAll();
            return tPwIndustryList;
        }


}
