package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceUseMapper;
import cn.lcp.fcct.po.TPwDeviceUseDO;
import cn.lcp.fcct.service.TPwDeviceUseService;
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
public class TPwDeviceUseServiceImpl implements TPwDeviceUseService {


        @Autowired
        private TPwDeviceUseMapper tPwDeviceUseMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceUseDO数据
         */
        @Override
        public void insertData(TPwDeviceUseDO tPwDeviceUseDO){
            log.info("添加单条TPwDeviceUseDO数据:"+tPwDeviceUseDO);
            tPwDeviceUseMapper.insertData(tPwDeviceUseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceUseDO数据
         */
        @Override
        public void updateData(TPwDeviceUseDO tPwDeviceUseDO){
            log.info("修改单条TPwDeviceUseDO数据:"+tPwDeviceUseDO);
            tPwDeviceUseMapper.updateData(tPwDeviceUseDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceUseDO数据
         */
        @Override
        public void deleteById(Integer deviceUseId){
            log.info("根据ID删除TPwDeviceUseDO数据:"+deviceUseId);
            tPwDeviceUseMapper.deleteById(deviceUseId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceUseDO一条数据
         */
        @Override
        public TPwDeviceUseDO getById(Integer deviceUseId){
            log.info("根据ID获取TPwDeviceUseDO一条数据:"+deviceUseId);
            TPwDeviceUseDO tPwDeviceUse = tPwDeviceUseMapper.getById(deviceUseId);
            return tPwDeviceUse;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceUseDO
         */
        @Override
        public List<TPwDeviceUseDO> getAll(){
            log.info("获取TPwDeviceUseDO所有条数据");
            List<TPwDeviceUseDO> tPwDeviceUseList = tPwDeviceUseMapper.getAll();
            return tPwDeviceUseList;
        }


}
