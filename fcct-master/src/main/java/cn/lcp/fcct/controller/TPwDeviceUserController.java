package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceUserDO;
import cn.lcp.fcct.service.TPwDeviceUserService;
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
@RequestMapping("/tPwDeviceUser")
public class TPwDeviceUserController {

        @Autowired
        private TPwDeviceUserService tPwDeviceUserService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceUserDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceUserDO tPwDeviceUserDO){
            log.info("添加单条TPwDeviceUserDO数据:"+tPwDeviceUserDO);
            tPwDeviceUserService.insertData(tPwDeviceUserDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceUserDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceUserDO tPwDeviceUserDO){
            log.info("修改单条TPwDeviceUserDO数据:"+tPwDeviceUserDO);
            tPwDeviceUserService.updateData(tPwDeviceUserDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceUserDO数据
         */
        @RequestMapping("/updateData/{deviceUserId}")
        public void deleteById(@PathVariable("deviceUserId")Integer deviceUserId){
            log.info("根据ID删除TPwDeviceUserDO数据:"+deviceUserId);
            tPwDeviceUserService.deleteById(deviceUserId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceUserDO一条数据
         */
        @RequestMapping("/getById/{deviceUserId}")
        public TPwDeviceUserDO getById(@PathVariable("deviceUserId")Integer deviceUserId){
            log.info("根据ID获取TPwDeviceUserDO一条数据:"+deviceUserId);
            TPwDeviceUserDO tPwDeviceUser = tPwDeviceUserService.getById(deviceUserId);
            return tPwDeviceUser;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceUserDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceUserDO> getAll(){
            log.info("获取TPwDeviceUserDO所有条数据");
            List<TPwDeviceUserDO> tPwDeviceUserList = tPwDeviceUserService.getAll();
            return tPwDeviceUserList;
        }


}
