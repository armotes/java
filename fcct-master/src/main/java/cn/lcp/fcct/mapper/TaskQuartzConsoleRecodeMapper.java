package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TaskQuartzConsoleRecodeDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: Mapper接口
 */
public interface TaskQuartzConsoleRecodeMapper {

    /**添加单条数据*/
    public void insertData(TaskQuartzConsoleRecodeDO taskQuartzConsoleRecodeDO);

    /**修改单条数据*/
    public void updateData(TaskQuartzConsoleRecodeDO taskQuartzConsoleRecodeDO);

    /**根据ID删除数据*/
    public void deleteById(Integer taskQuartzRecodeId);

    /**根据ID获取数据*/
    public TaskQuartzConsoleRecodeDO getById(Integer taskQuartzRecodeId);

    /**获取所有数据*/
    public List<TaskQuartzConsoleRecodeDO> getAll();

}
