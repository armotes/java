package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwPurchaseMapper;
import cn.lcp.fcct.po.TPwPurchaseDO;
import cn.lcp.fcct.service.TPwPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品采购单服务实现类
 */
@Slf4j
@Service
public class TPwPurchaseServiceImpl implements TPwPurchaseService {


        @Autowired
        private TPwPurchaseMapper tPwPurchaseMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwPurchaseDO数据
         */
        @Override
        public void insertData(TPwPurchaseDO tPwPurchaseDO){
            log.info("添加单条TPwPurchaseDO数据:"+tPwPurchaseDO);
            tPwPurchaseMapper.insertData(tPwPurchaseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwPurchaseDO数据
         */
        @Override
        public void updateData(TPwPurchaseDO tPwPurchaseDO){
            log.info("修改单条TPwPurchaseDO数据:"+tPwPurchaseDO);
            tPwPurchaseMapper.updateData(tPwPurchaseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwPurchaseDO数据
         */
        @Override
        public void deleteById(Integer purchaseId){
            log.info("根据ID删除TPwPurchaseDO数据:"+purchaseId);
            tPwPurchaseMapper.deleteById(purchaseId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwPurchaseDO一条数据
         */
        @Override
        public TPwPurchaseDO getById(Integer purchaseId){
            log.info("根据ID获取TPwPurchaseDO一条数据:"+purchaseId);
            TPwPurchaseDO tPwPurchase = tPwPurchaseMapper.getById(purchaseId);
            return tPwPurchase;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwPurchaseDO
         */
        @Override
        public List<TPwPurchaseDO> getAll(){
            log.info("获取TPwPurchaseDO所有条数据");
            List<TPwPurchaseDO> tPwPurchaseList = tPwPurchaseMapper.getAll();
            return tPwPurchaseList;
        }


}
