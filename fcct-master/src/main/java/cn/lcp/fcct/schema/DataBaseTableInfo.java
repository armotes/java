/**
 * @Author: zhouaqiang
 * @Date: 2019/2/21 0021 下午 2:36
 * @Desc:
 */
package cn.lcp.fcct.schema;

import lombok.Data;

/**
 * @Author: zhouaqiang
 * @Date: 2019/2/21 0021 下午 2:36
 * @Desc: 模板生成辅助类(表信息)
 */
@Data
public class DataBaseTableInfo {

    /**表名*/
    private String tableName;

    /**表注释*/
    private String tableComment;

}
