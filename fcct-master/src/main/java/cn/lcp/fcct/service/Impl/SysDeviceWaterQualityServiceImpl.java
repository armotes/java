package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.SysDeviceWaterQualityMapper;
import cn.lcp.fcct.po.SysDeviceWaterQualityDO;
import cn.lcp.fcct.service.SysDeviceWaterQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 服务实现类
 */
@Slf4j
@Service
public class SysDeviceWaterQualityServiceImpl implements SysDeviceWaterQualityService {


        @Autowired
        private SysDeviceWaterQualityMapper sysDeviceWaterQualityMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条SysDeviceWaterQualityDO数据
         */
        @Override
        public void insertData(SysDeviceWaterQualityDO sysDeviceWaterQualityDO){
            log.info("添加单条SysDeviceWaterQualityDO数据:"+sysDeviceWaterQualityDO);
            sysDeviceWaterQualityMapper.insertData(sysDeviceWaterQualityDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条SysDeviceWaterQualityDO数据
         */
        @Override
        public void updateData(SysDeviceWaterQualityDO sysDeviceWaterQualityDO){
            log.info("修改单条SysDeviceWaterQualityDO数据:"+sysDeviceWaterQualityDO);
            sysDeviceWaterQualityMapper.updateData(sysDeviceWaterQualityDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除SysDeviceWaterQualityDO数据
         */
        @Override
        public void deleteById(Integer deviceWaterQualityId){
            log.info("根据ID删除SysDeviceWaterQualityDO数据:"+deviceWaterQualityId);
            sysDeviceWaterQualityMapper.deleteById(deviceWaterQualityId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取SysDeviceWaterQualityDO一条数据
         */
        @Override
        public SysDeviceWaterQualityDO getById(Integer deviceWaterQualityId){
            log.info("根据ID获取SysDeviceWaterQualityDO一条数据:"+deviceWaterQualityId);
            SysDeviceWaterQualityDO sysDeviceWaterQuality = sysDeviceWaterQualityMapper.getById(deviceWaterQualityId);
            return sysDeviceWaterQuality;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据SysDeviceWaterQualityDO
         */
        @Override
        public List<SysDeviceWaterQualityDO> getAll(){
            log.info("获取SysDeviceWaterQualityDO所有条数据");
            List<SysDeviceWaterQualityDO> sysDeviceWaterQualityList = sysDeviceWaterQualityMapper.getAll();
            return sysDeviceWaterQualityList;
        }


}
