package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwOrderConfigMapper;
import cn.lcp.fcct.po.TPwOrderConfigDO;
import cn.lcp.fcct.service.TPwOrderConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单批次策略表服务实现类
 */
@Slf4j
@Service
public class TPwOrderConfigServiceImpl implements TPwOrderConfigService {


        @Autowired
        private TPwOrderConfigMapper tPwOrderConfigMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwOrderConfigDO数据
         */
        @Override
        public void insertData(TPwOrderConfigDO tPwOrderConfigDO){
            log.info("添加单条TPwOrderConfigDO数据:"+tPwOrderConfigDO);
            tPwOrderConfigMapper.insertData(tPwOrderConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwOrderConfigDO数据
         */
        @Override
        public void updateData(TPwOrderConfigDO tPwOrderConfigDO){
            log.info("修改单条TPwOrderConfigDO数据:"+tPwOrderConfigDO);
            tPwOrderConfigMapper.updateData(tPwOrderConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwOrderConfigDO数据
         */
        @Override
        public void deleteById(Integer orderConfigId){
            log.info("根据ID删除TPwOrderConfigDO数据:"+orderConfigId);
            tPwOrderConfigMapper.deleteById(orderConfigId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwOrderConfigDO一条数据
         */
        @Override
        public TPwOrderConfigDO getById(Integer orderConfigId){
            log.info("根据ID获取TPwOrderConfigDO一条数据:"+orderConfigId);
            TPwOrderConfigDO tPwOrderConfig = tPwOrderConfigMapper.getById(orderConfigId);
            return tPwOrderConfig;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwOrderConfigDO
         */
        @Override
        public List<TPwOrderConfigDO> getAll(){
            log.info("获取TPwOrderConfigDO所有条数据");
            List<TPwOrderConfigDO> tPwOrderConfigList = tPwOrderConfigMapper.getAll();
            return tPwOrderConfigList;
        }


}
