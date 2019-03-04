package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TaskQuartzConsoleDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 任务调度控制平台服务接口
 */
public interface TaskQuartzConsoleService {

    /**添加单条数据*/
    public void insertData(TaskQuartzConsoleDO taskQuartzConsoleDO);

    /**修改单条数据*/
    public void updateData(TaskQuartzConsoleDO taskQuartzConsoleDO);

    /**根据ID删除数据*/
    public void deleteById(Integer taskQuartzId);

    /**根据ID获取数据*/
    public TaskQuartzConsoleDO getById(Integer taskQuartzId);

    /**获取所有数据*/
    public List<TaskQuartzConsoleDO> getAll();
}
