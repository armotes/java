package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TaskQuartzConsoleMapper;
import cn.lcp.fcct.po.TaskQuartzConsoleDO;
import cn.lcp.fcct.service.TaskQuartzConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 任务调度控制平台服务实现类
 */
@Slf4j
@Service
public class TaskQuartzConsoleServiceImpl implements TaskQuartzConsoleService {


        @Autowired
        private TaskQuartzConsoleMapper taskQuartzConsoleMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TaskQuartzConsoleDO数据
         */
        @Override
        public void insertData(TaskQuartzConsoleDO taskQuartzConsoleDO){
            log.info("添加单条TaskQuartzConsoleDO数据:"+taskQuartzConsoleDO);
            taskQuartzConsoleMapper.insertData(taskQuartzConsoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TaskQuartzConsoleDO数据
         */
        @Override
        public void updateData(TaskQuartzConsoleDO taskQuartzConsoleDO){
            log.info("修改单条TaskQuartzConsoleDO数据:"+taskQuartzConsoleDO);
            taskQuartzConsoleMapper.updateData(taskQuartzConsoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TaskQuartzConsoleDO数据
         */
        @Override
        public void deleteById(Integer taskQuartzId){
            log.info("根据ID删除TaskQuartzConsoleDO数据:"+taskQuartzId);
            taskQuartzConsoleMapper.deleteById(taskQuartzId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TaskQuartzConsoleDO一条数据
         */
        @Override
        public TaskQuartzConsoleDO getById(Integer taskQuartzId){
            log.info("根据ID获取TaskQuartzConsoleDO一条数据:"+taskQuartzId);
            TaskQuartzConsoleDO taskQuartzConsole = taskQuartzConsoleMapper.getById(taskQuartzId);
            return taskQuartzConsole;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TaskQuartzConsoleDO
         */
        @Override
        public List<TaskQuartzConsoleDO> getAll(){
            log.info("获取TaskQuartzConsoleDO所有条数据");
            List<TaskQuartzConsoleDO> taskQuartzConsoleList = taskQuartzConsoleMapper.getAll();
            return taskQuartzConsoleList;
        }


}
