package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDepartmentDO;
import cn.lcp.fcct.service.TPwDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 部门类型控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwDepartment")
public class TPwDepartmentController {

        @Autowired
        private TPwDepartmentService tPwDepartmentService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDepartmentDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDepartmentDO tPwDepartmentDO){
            log.info("添加单条TPwDepartmentDO数据:"+tPwDepartmentDO);
            tPwDepartmentService.insertData(tPwDepartmentDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDepartmentDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDepartmentDO tPwDepartmentDO){
            log.info("修改单条TPwDepartmentDO数据:"+tPwDepartmentDO);
            tPwDepartmentService.updateData(tPwDepartmentDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDepartmentDO数据
         */
        @RequestMapping("/updateData/{deptId}")
        public void deleteById(@PathVariable("deptId")Integer deptId){
            log.info("根据ID删除TPwDepartmentDO数据:"+deptId);
            tPwDepartmentService.deleteById(deptId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDepartmentDO一条数据
         */
        @RequestMapping("/getById/{deptId}")
        public TPwDepartmentDO getById(@PathVariable("deptId")Integer deptId){
            log.info("根据ID获取TPwDepartmentDO一条数据:"+deptId);
            TPwDepartmentDO tPwDepartment = tPwDepartmentService.getById(deptId);
            return tPwDepartment;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDepartmentDO
         */
        @RequestMapping("/getAll")
        public List<TPwDepartmentDO> getAll(){
            log.info("获取TPwDepartmentDO所有条数据");
            List<TPwDepartmentDO> tPwDepartmentList = tPwDepartmentService.getAll();
            return tPwDepartmentList;
        }


}
