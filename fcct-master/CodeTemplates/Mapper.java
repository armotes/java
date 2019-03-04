package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.${poEntityDO};
import java.util.List;

/**
 * @Auther: armote
 * @DATE: ${creatTime}
 * @Description: ${tableComment}Mapper接口
 */
public interface ${poEntity}Mapper {

    /**添加单条数据*/
    public void insertData(${poEntityDO} ${poEntityLowerDO});

    /**修改单条数据*/
    public void updateData(${poEntityDO} ${poEntityLowerDO});

    /**根据ID删除数据*/
    public void deleteById(${poIDType} ${poIDName});

    /**根据ID获取数据*/
    public ${poEntityDO} getById(${poIDType} ${poIDName});

    /**获取所有数据*/
    public List<${poEntityDO}> getAll();

}
