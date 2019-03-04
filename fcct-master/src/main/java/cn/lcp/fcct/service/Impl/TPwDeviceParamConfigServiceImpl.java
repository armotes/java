package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceParamConfigMapper;
import cn.lcp.fcct.po.TPwDeviceParamConfigDO;
import cn.lcp.fcct.service.TPwDeviceParamConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 服务实现类
 */
@Slf4j
@Service
public class TPwDeviceParamConfigServiceImpl implements TPwDeviceParamConfigService {


        @Autowired
        private TPwDeviceParamConfigMapper tPwDeviceParamConfigMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceParamConfigDO数据
         */
        @Override
        public void insertData(TPwDeviceParamConfigDO tPwDeviceParamConfigDO){
            log.info("添加单条TPwDeviceParamConfigDO数据:"+tPwDeviceParamConfigDO);
            tPwDeviceParamConfigMapper.insertData(tPwDeviceParamConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceParamConfigDO数据
         */
        @Override
        public void updateData(TPwDeviceParamConfigDO tPwDeviceParamConfigDO){
            log.info("修改单条TPwDeviceParamConfigDO数据:"+tPwDeviceParamConfigDO);
            tPwDeviceParamConfigMapper.updateData(tPwDeviceParamConfigDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceParamConfigDO数据
         */
        @Override
        public void deleteById(Integer cfgId){
            log.info("根据ID删除TPwDeviceParamConfigDO数据:"+cfgId);
            tPwDeviceParamConfigMapper.deleteById(cfgId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceParamConfigDO一条数据
         */
        @Override
        public TPwDeviceParamConfigDO getById(Integer cfgId){
            log.info("根据ID获取TPwDeviceParamConfigDO一条数据:"+cfgId);
            TPwDeviceParamConfigDO tPwDeviceParamConfig = tPwDeviceParamConfigMapper.getById(cfgId);
            return tPwDeviceParamConfig;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceParamConfigDO
         */
        @Override
        public List<TPwDeviceParamConfigDO> getAll(){
            log.info("获取TPwDeviceParamConfigDO所有条数据");
            List<TPwDeviceParamConfigDO> tPwDeviceParamConfigList = tPwDeviceParamConfigMapper.getAll();
            return tPwDeviceParamConfigList;
        }


}
