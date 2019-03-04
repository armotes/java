package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TaskQuartzConsoleRecodeMapper;
import cn.lcp.fcct.po.TaskQuartzConsoleRecodeDO;
import cn.lcp.fcct.service.TaskQuartzConsoleRecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 服务实现类
 */
@Slf4j
@Service
public class TaskQuartzConsoleRecodeServiceImpl implements TaskQuartzConsoleRecodeService {


        @Autowired
        private TaskQuartzConsoleRecodeMapper taskQuartzConsoleRecodeMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TaskQuartzConsoleRecodeDO数据
         */
        @Override
        public void insertData(TaskQuartzConsoleRecodeDO taskQuartzConsoleRecodeDO){
            log.info("添加单条TaskQuartzConsoleRecodeDO数据:"+taskQuartzConsoleRecodeDO);
            taskQuartzConsoleRecodeMapper.insertData(taskQuartzConsoleRecodeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TaskQuartzConsoleRecodeDO数据
         */
        @Override
        public void updateData(TaskQuartzConsoleRecodeDO taskQuartzConsoleRecodeDO){
            log.info("修改单条TaskQuartzConsoleRecodeDO数据:"+taskQuartzConsoleRecodeDO);
            taskQuartzConsoleRecodeMapper.updateData(taskQuartzConsoleRecodeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TaskQuartzConsoleRecodeDO数据
         */
        @Override
        public void deleteById(Integer taskQuartzRecodeId){
            log.info("根据ID删除TaskQuartzConsoleRecodeDO数据:"+taskQuartzRecodeId);
            taskQuartzConsoleRecodeMapper.deleteById(taskQuartzRecodeId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TaskQuartzConsoleRecodeDO一条数据
         */
        @Override
        public TaskQuartzConsoleRecodeDO getById(Integer taskQuartzRecodeId){
            log.info("根据ID获取TaskQuartzConsoleRecodeDO一条数据:"+taskQuartzRecodeId);
            TaskQuartzConsoleRecodeDO taskQuartzConsoleRecode = taskQuartzConsoleRecodeMapper.getById(taskQuartzRecodeId);
            return taskQuartzConsoleRecode;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TaskQuartzConsoleRecodeDO
         */
        @Override
        public List<TaskQuartzConsoleRecodeDO> getAll(){
            log.info("获取TaskQuartzConsoleRecodeDO所有条数据");
            List<TaskQuartzConsoleRecodeDO> taskQuartzConsoleRecodeList = taskQuartzConsoleRecodeMapper.getAll();
            return taskQuartzConsoleRecodeList;
        }


}
