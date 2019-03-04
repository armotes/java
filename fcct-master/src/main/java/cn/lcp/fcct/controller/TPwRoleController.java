package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwRoleDO;
import cn.lcp.fcct.service.TPwRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色信息控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwRole")
public class TPwRoleController {

        @Autowired
        private TPwRoleService tPwRoleService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwRoleDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwRoleDO tPwRoleDO){
            log.info("添加单条TPwRoleDO数据:"+tPwRoleDO);
            tPwRoleService.insertData(tPwRoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwRoleDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwRoleDO tPwRoleDO){
            log.info("修改单条TPwRoleDO数据:"+tPwRoleDO);
            tPwRoleService.updateData(tPwRoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwRoleDO数据
         */
        @RequestMapping("/updateData/{roleId}")
        public void deleteById(@PathVariable("roleId")Integer roleId){
            log.info("根据ID删除TPwRoleDO数据:"+roleId);
            tPwRoleService.deleteById(roleId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwRoleDO一条数据
         */
        @RequestMapping("/getById/{roleId}")
        public TPwRoleDO getById(@PathVariable("roleId")Integer roleId){
            log.info("根据ID获取TPwRoleDO一条数据:"+roleId);
            TPwRoleDO tPwRole = tPwRoleService.getById(roleId);
            return tPwRole;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwRoleDO
         */
        @RequestMapping("/getAll")
        public List<TPwRoleDO> getAll(){
            log.info("获取TPwRoleDO所有条数据");
            List<TPwRoleDO> tPwRoleList = tPwRoleService.getAll();
            return tPwRoleList;
        }


}
