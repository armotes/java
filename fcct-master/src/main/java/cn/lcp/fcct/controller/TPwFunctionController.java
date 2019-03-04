package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwFunctionDO;
import cn.lcp.fcct.service.TPwFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 功能【菜单】信息控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwFunction")
public class TPwFunctionController {

        @Autowired
        private TPwFunctionService tPwFunctionService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwFunctionDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwFunctionDO tPwFunctionDO){
            log.info("添加单条TPwFunctionDO数据:"+tPwFunctionDO);
            tPwFunctionService.insertData(tPwFunctionDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwFunctionDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwFunctionDO tPwFunctionDO){
            log.info("修改单条TPwFunctionDO数据:"+tPwFunctionDO);
            tPwFunctionService.updateData(tPwFunctionDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwFunctionDO数据
         */
        @RequestMapping("/updateData/{funId}")
        public void deleteById(@PathVariable("funId")Integer funId){
            log.info("根据ID删除TPwFunctionDO数据:"+funId);
            tPwFunctionService.deleteById(funId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwFunctionDO一条数据
         */
        @RequestMapping("/getById/{funId}")
        public TPwFunctionDO getById(@PathVariable("funId")Integer funId){
            log.info("根据ID获取TPwFunctionDO一条数据:"+funId);
            TPwFunctionDO tPwFunction = tPwFunctionService.getById(funId);
            return tPwFunction;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwFunctionDO
         */
        @RequestMapping("/getAll")
        public List<TPwFunctionDO> getAll(){
            log.info("获取TPwFunctionDO所有条数据");
            List<TPwFunctionDO> tPwFunctionList = tPwFunctionService.getAll();
            return tPwFunctionList;
        }


}
