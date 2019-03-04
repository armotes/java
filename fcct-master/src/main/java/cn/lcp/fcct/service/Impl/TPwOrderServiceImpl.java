package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwOrderMapper;
import cn.lcp.fcct.po.TPwOrderDO;
import cn.lcp.fcct.service.TPwOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次表服务实现类
 */
@Slf4j
@Service
public class TPwOrderServiceImpl implements TPwOrderService {


        @Autowired
        private TPwOrderMapper tPwOrderMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwOrderDO数据
         */
        @Override
        public void insertData(TPwOrderDO tPwOrderDO){
            log.info("添加单条TPwOrderDO数据:"+tPwOrderDO);
            tPwOrderMapper.insertData(tPwOrderDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwOrderDO数据
         */
        @Override
        public void updateData(TPwOrderDO tPwOrderDO){
            log.info("修改单条TPwOrderDO数据:"+tPwOrderDO);
            tPwOrderMapper.updateData(tPwOrderDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwOrderDO数据
         */
        @Override
        public void deleteById(Integer orderId){
            log.info("根据ID删除TPwOrderDO数据:"+orderId);
            tPwOrderMapper.deleteById(orderId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwOrderDO一条数据
         */
        @Override
        public TPwOrderDO getById(Integer orderId){
            log.info("根据ID获取TPwOrderDO一条数据:"+orderId);
            TPwOrderDO tPwOrder = tPwOrderMapper.getById(orderId);
            return tPwOrder;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwOrderDO
         */
        @Override
        public List<TPwOrderDO> getAll(){
            log.info("获取TPwOrderDO所有条数据");
            List<TPwOrderDO> tPwOrderList = tPwOrderMapper.getAll();
            return tPwOrderList;
        }


}
