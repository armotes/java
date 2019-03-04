package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceInstallListDO;
import cn.lcp.fcct.service.TPwDeviceInstallListService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwDeviceInstallList")
public class TPwDeviceInstallListController {

        @Autowired
        private TPwDeviceInstallListService tPwDeviceInstallListService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceInstallListDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceInstallListDO tPwDeviceInstallListDO){
            log.info("添加单条TPwDeviceInstallListDO数据:"+tPwDeviceInstallListDO);
            tPwDeviceInstallListService.insertData(tPwDeviceInstallListDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceInstallListDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceInstallListDO tPwDeviceInstallListDO){
            log.info("修改单条TPwDeviceInstallListDO数据:"+tPwDeviceInstallListDO);
            tPwDeviceInstallListService.updateData(tPwDeviceInstallListDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceInstallListDO数据
         */
        @RequestMapping("/updateData/{listId}")
        public void deleteById(@PathVariable("listId")Integer listId){
            log.info("根据ID删除TPwDeviceInstallListDO数据:"+listId);
            tPwDeviceInstallListService.deleteById(listId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceInstallListDO一条数据
         */
        @RequestMapping("/getById/{listId}")
        public TPwDeviceInstallListDO getById(@PathVariable("listId")Integer listId){
            log.info("根据ID获取TPwDeviceInstallListDO一条数据:"+listId);
            TPwDeviceInstallListDO tPwDeviceInstallList = tPwDeviceInstallListService.getById(listId);
            return tPwDeviceInstallList;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceInstallListDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceInstallListDO> getAll(){
            log.info("获取TPwDeviceInstallListDO所有条数据");
            List<TPwDeviceInstallListDO> tPwDeviceInstallListList = tPwDeviceInstallListService.getAll();
            return tPwDeviceInstallListList;
        }


}
