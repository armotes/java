package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwContractFileDO;
import cn.lcp.fcct.service.TPwContractFileService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单合同文件表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwContractFile")
public class TPwContractFileController {

        @Autowired
        private TPwContractFileService tPwContractFileService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwContractFileDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwContractFileDO tPwContractFileDO){
            log.info("添加单条TPwContractFileDO数据:"+tPwContractFileDO);
            tPwContractFileService.insertData(tPwContractFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwContractFileDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwContractFileDO tPwContractFileDO){
            log.info("修改单条TPwContractFileDO数据:"+tPwContractFileDO);
            tPwContractFileService.updateData(tPwContractFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwContractFileDO数据
         */
        @RequestMapping("/updateData/{fileId}")
        public void deleteById(@PathVariable("fileId")Integer fileId){
            log.info("根据ID删除TPwContractFileDO数据:"+fileId);
            tPwContractFileService.deleteById(fileId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwContractFileDO一条数据
         */
        @RequestMapping("/getById/{fileId}")
        public TPwContractFileDO getById(@PathVariable("fileId")Integer fileId){
            log.info("根据ID获取TPwContractFileDO一条数据:"+fileId);
            TPwContractFileDO tPwContractFile = tPwContractFileService.getById(fileId);
            return tPwContractFile;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwContractFileDO
         */
        @RequestMapping("/getAll")
        public List<TPwContractFileDO> getAll(){
            log.info("获取TPwContractFileDO所有条数据");
            List<TPwContractFileDO> tPwContractFileList = tPwContractFileService.getAll();
            return tPwContractFileList;
        }


}
