package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceInfoMapper;
import cn.lcp.fcct.po.TPwDeviceInfoDO;
import cn.lcp.fcct.service.TPwDeviceInfoService;
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
public class TPwDeviceInfoServiceImpl implements TPwDeviceInfoService {


        @Autowired
        private TPwDeviceInfoMapper tPwDeviceInfoMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceInfoDO数据
         */
        @Override
        public void insertData(TPwDeviceInfoDO tPwDeviceInfoDO){
            log.info("添加单条TPwDeviceInfoDO数据:"+tPwDeviceInfoDO);
            tPwDeviceInfoMapper.insertData(tPwDeviceInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceInfoDO数据
         */
        @Override
        public void updateData(TPwDeviceInfoDO tPwDeviceInfoDO){
            log.info("修改单条TPwDeviceInfoDO数据:"+tPwDeviceInfoDO);
            tPwDeviceInfoMapper.updateData(tPwDeviceInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceInfoDO数据
         */
        @Override
        public void deleteById(Integer deviceId){
            log.info("根据ID删除TPwDeviceInfoDO数据:"+deviceId);
            tPwDeviceInfoMapper.deleteById(deviceId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceInfoDO一条数据
         */
        @Override
        public TPwDeviceInfoDO getById(Integer deviceId){
            log.info("根据ID获取TPwDeviceInfoDO一条数据:"+deviceId);
            TPwDeviceInfoDO tPwDeviceInfo = tPwDeviceInfoMapper.getById(deviceId);
            return tPwDeviceInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceInfoDO
         */
        @Override
        public List<TPwDeviceInfoDO> getAll(){
            log.info("获取TPwDeviceInfoDO所有条数据");
            List<TPwDeviceInfoDO> tPwDeviceInfoList = tPwDeviceInfoMapper.getAll();
            return tPwDeviceInfoList;
        }


}
