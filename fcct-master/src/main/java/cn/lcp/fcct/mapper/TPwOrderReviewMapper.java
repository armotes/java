package cn.lcp.fcct.mapper;

import cn.lcp.fcct.po.TPwOrderReviewDO;
import java.util.List;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单审核记录表Mapper接口
 */
public interface TPwOrderReviewMapper {

    /**添加单条数据*/
    public void insertData(TPwOrderReviewDO tPwOrderReviewDO);

    /**修改单条数据*/
    public void updateData(TPwOrderReviewDO tPwOrderReviewDO);

    /**根据ID删除数据*/
    public void deleteById(Integer reviewId);

    /**根据ID获取数据*/
    public TPwOrderReviewDO getById(Integer reviewId);

    /**获取所有数据*/
    public List<TPwOrderReviewDO> getAll();

}
