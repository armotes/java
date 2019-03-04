package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwPurchaseReviewMapper;
import cn.lcp.fcct.po.TPwPurchaseReviewDO;
import cn.lcp.fcct.service.TPwPurchaseReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单审核表服务实现类
 */
@Slf4j
@Service
public class TPwPurchaseReviewServiceImpl implements TPwPurchaseReviewService {


        @Autowired
        private TPwPurchaseReviewMapper tPwPurchaseReviewMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwPurchaseReviewDO数据
         */
        @Override
        public void insertData(TPwPurchaseReviewDO tPwPurchaseReviewDO){
            log.info("添加单条TPwPurchaseReviewDO数据:"+tPwPurchaseReviewDO);
            tPwPurchaseReviewMapper.insertData(tPwPurchaseReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwPurchaseReviewDO数据
         */
        @Override
        public void updateData(TPwPurchaseReviewDO tPwPurchaseReviewDO){
            log.info("修改单条TPwPurchaseReviewDO数据:"+tPwPurchaseReviewDO);
            tPwPurchaseReviewMapper.updateData(tPwPurchaseReviewDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwPurchaseReviewDO数据
         */
        @Override
        public void deleteById(Integer purchaseCheckId){
            log.info("根据ID删除TPwPurchaseReviewDO数据:"+purchaseCheckId);
            tPwPurchaseReviewMapper.deleteById(purchaseCheckId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwPurchaseReviewDO一条数据
         */
        @Override
        public TPwPurchaseReviewDO getById(Integer purchaseCheckId){
            log.info("根据ID获取TPwPurchaseReviewDO一条数据:"+purchaseCheckId);
            TPwPurchaseReviewDO tPwPurchaseReview = tPwPurchaseReviewMapper.getById(purchaseCheckId);
            return tPwPurchaseReview;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwPurchaseReviewDO
         */
        @Override
        public List<TPwPurchaseReviewDO> getAll(){
            log.info("获取TPwPurchaseReviewDO所有条数据");
            List<TPwPurchaseReviewDO> tPwPurchaseReviewList = tPwPurchaseReviewMapper.getAll();
            return tPwPurchaseReviewList;
        }


}
