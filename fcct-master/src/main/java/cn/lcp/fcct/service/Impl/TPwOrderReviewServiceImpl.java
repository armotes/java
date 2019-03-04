package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwOrderReviewMapper;
import cn.lcp.fcct.po.TPwOrderReviewDO;
import cn.lcp.fcct.service.TPwOrderReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单审核记录表服务实现类
 */
@Slf4j
@Service
public class TPwOrderReviewServiceImpl implements TPwOrderReviewService {


        @Autowired
        private TPwOrderReviewMapper tPwOrderReviewMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwOrderReviewDO数据
         */
        @Override
        public void insertData(TPwOrderReviewDO tPwOrderReviewDO){
            log.info("添加单条TPwOrderReviewDO数据:"+tPwOrderReviewDO);
            tPwOrderReviewMapper.insertData(tPwOrderReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwOrderReviewDO数据
         */
        @Override
        public void updateData(TPwOrderReviewDO tPwOrderReviewDO){
            log.info("修改单条TPwOrderReviewDO数据:"+tPwOrderReviewDO);
            tPwOrderReviewMapper.updateData(tPwOrderReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwOrderReviewDO数据
         */
        @Override
        public void deleteById(Integer reviewId){
            log.info("根据ID删除TPwOrderReviewDO数据:"+reviewId);
            tPwOrderReviewMapper.deleteById(reviewId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwOrderReviewDO一条数据
         */
        @Override
        public TPwOrderReviewDO getById(Integer reviewId){
            log.info("根据ID获取TPwOrderReviewDO一条数据:"+reviewId);
            TPwOrderReviewDO tPwOrderReview = tPwOrderReviewMapper.getById(reviewId);
            return tPwOrderReview;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwOrderReviewDO
         */
        @Override
        public List<TPwOrderReviewDO> getAll(){
            log.info("获取TPwOrderReviewDO所有条数据");
            List<TPwOrderReviewDO> tPwOrderReviewList = tPwOrderReviewMapper.getAll();
            return tPwOrderReviewList;
        }


}
