package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TaskQuartzConsoleDO;
import cn.lcp.fcct.service.TaskQuartzConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 任务调度控制平台控制器
 */
@Slf4j
@RestController
@RequestMapping("/taskQuartzConsole")
public class TaskQuartzConsoleController {

        @Autowired
        private TaskQuartzConsoleService taskQuartzConsoleService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TaskQuartzConsoleDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TaskQuartzConsoleDO taskQuartzConsoleDO){
            log.info("添加单条TaskQuartzConsoleDO数据:"+taskQuartzConsoleDO);
            taskQuartzConsoleService.insertData(taskQuartzConsoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TaskQuartzConsoleDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TaskQuartzConsoleDO taskQuartzConsoleDO){
            log.info("修改单条TaskQuartzConsoleDO数据:"+taskQuartzConsoleDO);
            taskQuartzConsoleService.updateData(taskQuartzConsoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TaskQuartzConsoleDO数据
         */
        @RequestMapping("/updateData/{taskQuartzId}")
        public void deleteById(@PathVariable("taskQuartzId")Integer taskQuartzId){
            log.info("根据ID删除TaskQuartzConsoleDO数据:"+taskQuartzId);
            taskQuartzConsoleService.deleteById(taskQuartzId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TaskQuartzConsoleDO一条数据
         */
        @RequestMapping("/getById/{taskQuartzId}")
        public TaskQuartzConsoleDO getById(@PathVariable("taskQuartzId")Integer taskQuartzId){
            log.info("根据ID获取TaskQuartzConsoleDO一条数据:"+taskQuartzId);
            TaskQuartzConsoleDO taskQuartzConsole = taskQuartzConsoleService.getById(taskQuartzId);
            return taskQuartzConsole;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TaskQuartzConsoleDO
         */
        @RequestMapping("/getAll")
        public List<TaskQuartzConsoleDO> getAll(){
            log.info("获取TaskQuartzConsoleDO所有条数据");
            List<TaskQuartzConsoleDO> taskQuartzConsoleList = taskQuartzConsoleService.getAll();
            return taskQuartzConsoleList;
        }


}
