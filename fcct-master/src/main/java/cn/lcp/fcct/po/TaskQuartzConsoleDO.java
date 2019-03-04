package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 任务调度控制平台数据实体类
 */
@Data
public class TaskQuartzConsoleDO implements Serializable{

    /**主键*/
    private Integer taskQuartzId ;

    /**批量任务名称*/
    private String taskBatchName ;

    /**批量任务编号*/
    private String taskBatchNumber ;

    /**任务批次号*/
    private String taskBatchSeq ;

    /**粒度(0:即时计算 1:日 2:周 3:月 4:季 5:半年 6:年)*/
    private Integer taskGranularity ;

    /**任务状态(0:未开始 1:进行中 2:异常 3:重置 9:正常结束)*/
    private Integer taskStatus ;

    /**任务组(0:后台任务 1:报表任务)*/
    private Integer taskGroup ;

    /**任务组等级*/
    private Integer taskGroupLevel ;

    /**工作序号*/
    private Integer taskJobNo ;

    /**人工调度(0:关闭服务 1:开启服务)*/
    private Integer taskArtificialDispatch ;

    /**crontab定时器(秒,分,时,日,月,周,年)*/
    private String taskCrontab ;

}
