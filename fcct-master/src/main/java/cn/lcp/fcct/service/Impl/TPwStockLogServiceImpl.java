package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwStockLogMapper;
import cn.lcp.fcct.po.TPwStockLogDO;
import cn.lcp.fcct.service.TPwStockLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 产品出入库记录服务实现类
 */
@Slf4j
@Service
public class TPwStockLogServiceImpl implements TPwStockLogService {


        @Autowired
        private TPwStockLogMapper tPwStockLogMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwStockLogDO数据
         */
        @Override
        public void insertData(TPwStockLogDO tPwStockLogDO){
            log.info("添加单条TPwStockLogDO数据:"+tPwStockLogDO);
            tPwStockLogMapper.insertData(tPwStockLogDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwStockLogDO数据
         */
        @Override
        public void updateData(TPwStockLogDO tPwStockLogDO){
            log.info("修改单条TPwStockLogDO数据:"+tPwStockLogDO);
            tPwStockLogMapper.updateData(tPwStockLogDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwStockLogDO数据
         */
        @Override
        public void deleteById(Integer stockLogId){
            log.info("根据ID删除TPwStockLogDO数据:"+stockLogId);
            tPwStockLogMapper.deleteById(stockLogId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwStockLogDO一条数据
         */
        @Override
        public TPwStockLogDO getById(Integer stockLogId){
            log.info("根据ID获取TPwStockLogDO一条数据:"+stockLogId);
            TPwStockLogDO tPwStockLog = tPwStockLogMapper.getById(stockLogId);
            return tPwStockLog;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwStockLogDO
         */
        @Override
        public List<TPwStockLogDO> getAll(){
            log.info("获取TPwStockLogDO所有条数据");
            List<TPwStockLogDO> tPwStockLogList = tPwStockLogMapper.getAll();
            return tPwStockLogList;
        }


}
