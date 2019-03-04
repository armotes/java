package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwCompanyTypeDO;
import cn.lcp.fcct.service.TPwCompanyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司类型控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwCompanyType")
public class TPwCompanyTypeController {

        @Autowired
        private TPwCompanyTypeService tPwCompanyTypeService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyTypeDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwCompanyTypeDO tPwCompanyTypeDO){
            log.info("添加单条TPwCompanyTypeDO数据:"+tPwCompanyTypeDO);
            tPwCompanyTypeService.insertData(tPwCompanyTypeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyTypeDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwCompanyTypeDO tPwCompanyTypeDO){
            log.info("修改单条TPwCompanyTypeDO数据:"+tPwCompanyTypeDO);
            tPwCompanyTypeService.updateData(tPwCompanyTypeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyTypeDO数据
         */
        @RequestMapping("/updateData/{typeId}")
        public void deleteById(@PathVariable("typeId")Integer typeId){
            log.info("根据ID删除TPwCompanyTypeDO数据:"+typeId);
            tPwCompanyTypeService.deleteById(typeId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyTypeDO一条数据
         */
        @RequestMapping("/getById/{typeId}")
        public TPwCompanyTypeDO getById(@PathVariable("typeId")Integer typeId){
            log.info("根据ID获取TPwCompanyTypeDO一条数据:"+typeId);
            TPwCompanyTypeDO tPwCompanyType = tPwCompanyTypeService.getById(typeId);
            return tPwCompanyType;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyTypeDO
         */
        @RequestMapping("/getAll")
        public List<TPwCompanyTypeDO> getAll(){
            log.info("获取TPwCompanyTypeDO所有条数据");
            List<TPwCompanyTypeDO> tPwCompanyTypeList = tPwCompanyTypeService.getAll();
            return tPwCompanyTypeList;
        }


}
