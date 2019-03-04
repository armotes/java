package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwDeviceNoticeDO;
import cn.lcp.fcct.service.TPwDeviceNoticeService;
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
@RequestMapping("/tPwDeviceNotice")
public class TPwDeviceNoticeController {

        @Autowired
        private TPwDeviceNoticeService tPwDeviceNoticeService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceNoticeDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwDeviceNoticeDO tPwDeviceNoticeDO){
            log.info("添加单条TPwDeviceNoticeDO数据:"+tPwDeviceNoticeDO);
            tPwDeviceNoticeService.insertData(tPwDeviceNoticeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceNoticeDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwDeviceNoticeDO tPwDeviceNoticeDO){
            log.info("修改单条TPwDeviceNoticeDO数据:"+tPwDeviceNoticeDO);
            tPwDeviceNoticeService.updateData(tPwDeviceNoticeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceNoticeDO数据
         */
        @RequestMapping("/updateData/{noticeId}")
        public void deleteById(@PathVariable("noticeId")Integer noticeId){
            log.info("根据ID删除TPwDeviceNoticeDO数据:"+noticeId);
            tPwDeviceNoticeService.deleteById(noticeId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceNoticeDO一条数据
         */
        @RequestMapping("/getById/{noticeId}")
        public TPwDeviceNoticeDO getById(@PathVariable("noticeId")Integer noticeId){
            log.info("根据ID获取TPwDeviceNoticeDO一条数据:"+noticeId);
            TPwDeviceNoticeDO tPwDeviceNotice = tPwDeviceNoticeService.getById(noticeId);
            return tPwDeviceNotice;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceNoticeDO
         */
        @RequestMapping("/getAll")
        public List<TPwDeviceNoticeDO> getAll(){
            log.info("获取TPwDeviceNoticeDO所有条数据");
            List<TPwDeviceNoticeDO> tPwDeviceNoticeList = tPwDeviceNoticeService.getAll();
            return tPwDeviceNoticeList;
        }


}
