package cn.lcp.fcct.po;

import lombok.Data;
import java.io.Serializable;
/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 编码规则数据实体类
 */
@Data
public class SysCodeRuleDO implements Serializable{

    /**主键*/
    private Integer sysCodeRuleId ;

    /**编码名称*/
    private String sysCodeRuleName ;

    /**核心编码规则*/
    private String sysCodeRuleCore ;

    /**编码类型(适用的业务场景):0系统编码 1设备编号 2报表系统*/
    private Integer sysCodeRuleType ;

    /**编码状态 0未投产 1已投产*/
    private Integer sysCodeRuleStatus ;

    /**编码填充内容(默认为空)*/
    private String sysCodeRuleFill ;

    /**编码长度*/
    private Integer sysCodeRuleLength ;

    /**编码说明*/
    private String sysMemo ;

    /**编码型号:0静态编码 1动态编码*/
    private Integer sysDync ;

    /**序列号(由程序维护自增长)*/
    private Integer sysCodeRuleSeq ;

}
