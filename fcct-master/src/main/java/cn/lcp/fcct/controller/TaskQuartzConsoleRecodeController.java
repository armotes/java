package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TaskQuartzConsoleRecodeDO;
import cn.lcp.fcct.service.TaskQuartzConsoleRecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 控制器
 */
@Slf4j
@RestController
@RequestMapping("/taskQuartzConsoleRecode")
public class TaskQuartzConsoleRecodeController {

        @Autowired
        private TaskQuartzConsoleRecodeService taskQuartzConsoleRecodeService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TaskQuartzConsoleRecodeDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TaskQuartzConsoleRecodeDO taskQuartzConsoleRecodeDO){
            log.info("添加单条TaskQuartzConsoleRecodeDO数据:"+taskQuartzConsoleRecodeDO);
            taskQuartzConsoleRecodeService.insertData(taskQuartzConsoleRecodeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TaskQuartzConsoleRecodeDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TaskQuartzConsoleRecodeDO taskQuartzConsoleRecodeDO){
            log.info("修改单条TaskQuartzConsoleRecodeDO数据:"+taskQuartzConsoleRecodeDO);
            taskQuartzConsoleRecodeService.updateData(taskQuartzConsoleRecodeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TaskQuartzConsoleRecodeDO数据
         */
        @RequestMapping("/updateData/{taskQuartzRecodeId}")
        public void deleteById(@PathVariable("taskQuartzRecodeId")Integer taskQuartzRecodeId){
            log.info("根据ID删除TaskQuartzConsoleRecodeDO数据:"+taskQuartzRecodeId);
            taskQuartzConsoleRecodeService.deleteById(taskQuartzRecodeId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TaskQuartzConsoleRecodeDO一条数据
         */
        @RequestMapping("/getById/{taskQuartzRecodeId}")
        public TaskQuartzConsoleRecodeDO getById(@PathVariable("taskQuartzRecodeId")Integer taskQuartzRecodeId){
            log.info("根据ID获取TaskQuartzConsoleRecodeDO一条数据:"+taskQuartzRecodeId);
            TaskQuartzConsoleRecodeDO taskQuartzConsoleRecode = taskQuartzConsoleRecodeService.getById(taskQuartzRecodeId);
            return taskQuartzConsoleRecode;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TaskQuartzConsoleRecodeDO
         */
        @RequestMapping("/getAll")
        public List<TaskQuartzConsoleRecodeDO> getAll(){
            log.info("获取TaskQuartzConsoleRecodeDO所有条数据");
            List<TaskQuartzConsoleRecodeDO> taskQuartzConsoleRecodeList = taskQuartzConsoleRecodeService.getAll();
            return taskQuartzConsoleRecodeList;
        }


}
