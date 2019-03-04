package cn.lcp.fcct.service;

import cn.lcp.fcct.po.TPwDeviceNoticeDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 服务接口
 */
public interface TPwDeviceNoticeService {

    /**添加单条数据*/
    public void insertData(TPwDeviceNoticeDO tPwDeviceNoticeDO);

    /**修改单条数据*/
    public void updateData(TPwDeviceNoticeDO tPwDeviceNoticeDO);

    /**根据ID删除数据*/
    public void deleteById(Integer noticeId);

    /**根据ID获取数据*/
    public TPwDeviceNoticeDO getById(Integer noticeId);

    /**获取所有数据*/
    public List<TPwDeviceNoticeDO> getAll();
}
