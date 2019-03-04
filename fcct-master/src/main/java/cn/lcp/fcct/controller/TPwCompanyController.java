package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwCompanyDO;
import cn.lcp.fcct.service.TPwCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司信息表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwCompany")
public class TPwCompanyController {

        @Autowired
        private TPwCompanyService tPwCompanyService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwCompanyDO tPwCompanyDO){
            log.info("添加单条TPwCompanyDO数据:"+tPwCompanyDO);
            tPwCompanyService.insertData(tPwCompanyDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwCompanyDO tPwCompanyDO){
            log.info("修改单条TPwCompanyDO数据:"+tPwCompanyDO);
            tPwCompanyService.updateData(tPwCompanyDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyDO数据
         */
        @RequestMapping("/updateData/{comId}")
        public void deleteById(@PathVariable("comId")Integer comId){
            log.info("根据ID删除TPwCompanyDO数据:"+comId);
            tPwCompanyService.deleteById(comId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyDO一条数据
         */
        @RequestMapping("/getById/{comId}")
        public TPwCompanyDO getById(@PathVariable("comId")Integer comId){
            log.info("根据ID获取TPwCompanyDO一条数据:"+comId);
            TPwCompanyDO tPwCompany = tPwCompanyService.getById(comId);
            return tPwCompany;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyDO
         */
        @RequestMapping("/getAll")
        public List<TPwCompanyDO> getAll(){
            log.info("获取TPwCompanyDO所有条数据");
            List<TPwCompanyDO> tPwCompanyList = tPwCompanyService.getAll();
            return tPwCompanyList;
        }


}
