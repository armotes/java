package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwStockMapper;
import cn.lcp.fcct.po.TPwStockDO;
import cn.lcp.fcct.service.TPwStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品库存服务实现类
 */
@Slf4j
@Service
public class TPwStockServiceImpl implements TPwStockService {


        @Autowired
        private TPwStockMapper tPwStockMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwStockDO数据
         */
        @Override
        public void insertData(TPwStockDO tPwStockDO){
            log.info("添加单条TPwStockDO数据:"+tPwStockDO);
            tPwStockMapper.insertData(tPwStockDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwStockDO数据
         */
        @Override
        public void updateData(TPwStockDO tPwStockDO){
            log.info("修改单条TPwStockDO数据:"+tPwStockDO);
            tPwStockMapper.updateData(tPwStockDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwStockDO数据
         */
        @Override
        public void deleteById(Integer stockId){
            log.info("根据ID删除TPwStockDO数据:"+stockId);
            tPwStockMapper.deleteById(stockId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwStockDO一条数据
         */
        @Override
        public TPwStockDO getById(Integer stockId){
            log.info("根据ID获取TPwStockDO一条数据:"+stockId);
            TPwStockDO tPwStock = tPwStockMapper.getById(stockId);
            return tPwStock;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwStockDO
         */
        @Override
        public List<TPwStockDO> getAll(){
            log.info("获取TPwStockDO所有条数据");
            List<TPwStockDO> tPwStockList = tPwStockMapper.getAll();
            return tPwStockList;
        }


}
