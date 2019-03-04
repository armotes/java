package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwPurchaseLogisticsMapper;
import cn.lcp.fcct.po.TPwPurchaseLogisticsDO;
import cn.lcp.fcct.service.TPwPurchaseLogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 采购单物流信息服务实现类
 */
@Slf4j
@Service
public class TPwPurchaseLogisticsServiceImpl implements TPwPurchaseLogisticsService {


        @Autowired
        private TPwPurchaseLogisticsMapper tPwPurchaseLogisticsMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwPurchaseLogisticsDO数据
         */
        @Override
        public void insertData(TPwPurchaseLogisticsDO tPwPurchaseLogisticsDO){
            log.info("添加单条TPwPurchaseLogisticsDO数据:"+tPwPurchaseLogisticsDO);
            tPwPurchaseLogisticsMapper.insertData(tPwPurchaseLogisticsDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwPurchaseLogisticsDO数据
         */
        @Override
        public void updateData(TPwPurchaseLogisticsDO tPwPurchaseLogisticsDO){
            log.info("修改单条TPwPurchaseLogisticsDO数据:"+tPwPurchaseLogisticsDO);
            tPwPurchaseLogisticsMapper.updateData(tPwPurchaseLogisticsDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwPurchaseLogisticsDO数据
         */
        @Override
        public void deleteById(Integer logisticsId){
            log.info("根据ID删除TPwPurchaseLogisticsDO数据:"+logisticsId);
            tPwPurchaseLogisticsMapper.deleteById(logisticsId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwPurchaseLogisticsDO一条数据
         */
        @Override
        public TPwPurchaseLogisticsDO getById(Integer logisticsId){
            log.info("根据ID获取TPwPurchaseLogisticsDO一条数据:"+logisticsId);
            TPwPurchaseLogisticsDO tPwPurchaseLogistics = tPwPurchaseLogisticsMapper.getById(logisticsId);
            return tPwPurchaseLogistics;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwPurchaseLogisticsDO
         */
        @Override
        public List<TPwPurchaseLogisticsDO> getAll(){
            log.info("获取TPwPurchaseLogisticsDO所有条数据");
            List<TPwPurchaseLogisticsDO> tPwPurchaseLogisticsList = tPwPurchaseLogisticsMapper.getAll();
            return tPwPurchaseLogisticsList;
        }


}
