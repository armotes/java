package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwRoleFunDO;
import cn.lcp.fcct.service.TPwRoleFunService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色和功能【菜单】关联表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwRoleFun")
public class TPwRoleFunController {

        @Autowired
        private TPwRoleFunService tPwRoleFunService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwRoleFunDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwRoleFunDO tPwRoleFunDO){
            log.info("添加单条TPwRoleFunDO数据:"+tPwRoleFunDO);
            tPwRoleFunService.insertData(tPwRoleFunDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwRoleFunDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwRoleFunDO tPwRoleFunDO){
            log.info("修改单条TPwRoleFunDO数据:"+tPwRoleFunDO);
            tPwRoleFunService.updateData(tPwRoleFunDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwRoleFunDO数据
         */
        @RequestMapping("/updateData/{tId}")
        public void deleteById(@PathVariable("tId")Integer tId){
            log.info("根据ID删除TPwRoleFunDO数据:"+tId);
            tPwRoleFunService.deleteById(tId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwRoleFunDO一条数据
         */
        @RequestMapping("/getById/{tId}")
        public TPwRoleFunDO getById(@PathVariable("tId")Integer tId){
            log.info("根据ID获取TPwRoleFunDO一条数据:"+tId);
            TPwRoleFunDO tPwRoleFun = tPwRoleFunService.getById(tId);
            return tPwRoleFun;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwRoleFunDO
         */
        @RequestMapping("/getAll")
        public List<TPwRoleFunDO> getAll(){
            log.info("获取TPwRoleFunDO所有条数据");
            List<TPwRoleFunDO> tPwRoleFunList = tPwRoleFunService.getAll();
            return tPwRoleFunList;
        }


}
