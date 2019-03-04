package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwStaffInfoDO;
import cn.lcp.fcct.service.TPwStaffInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 员工信息表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwStaffInfo")
public class TPwStaffInfoController {

        @Autowired
        private TPwStaffInfoService tPwStaffInfoService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwStaffInfoDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwStaffInfoDO tPwStaffInfoDO){
            log.info("添加单条TPwStaffInfoDO数据:"+tPwStaffInfoDO);
            tPwStaffInfoService.insertData(tPwStaffInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwStaffInfoDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwStaffInfoDO tPwStaffInfoDO){
            log.info("修改单条TPwStaffInfoDO数据:"+tPwStaffInfoDO);
            tPwStaffInfoService.updateData(tPwStaffInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwStaffInfoDO数据
         */
        @RequestMapping("/updateData/{staffId}")
        public void deleteById(@PathVariable("staffId")Integer staffId){
            log.info("根据ID删除TPwStaffInfoDO数据:"+staffId);
            tPwStaffInfoService.deleteById(staffId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwStaffInfoDO一条数据
         */
        @RequestMapping("/getById/{staffId}")
        public TPwStaffInfoDO getById(@PathVariable("staffId")Integer staffId){
            log.info("根据ID获取TPwStaffInfoDO一条数据:"+staffId);
            TPwStaffInfoDO tPwStaffInfo = tPwStaffInfoService.getById(staffId);
            return tPwStaffInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwStaffInfoDO
         */
        @RequestMapping("/getAll")
        public List<TPwStaffInfoDO> getAll(){
            log.info("获取TPwStaffInfoDO所有条数据");
            List<TPwStaffInfoDO> tPwStaffInfoList = tPwStaffInfoService.getAll();
            return tPwStaffInfoList;
        }


}
