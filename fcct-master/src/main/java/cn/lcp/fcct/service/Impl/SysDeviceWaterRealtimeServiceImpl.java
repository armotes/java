package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.SysDeviceWaterRealtimeMapper;
import cn.lcp.fcct.po.SysDeviceWaterRealtimeDO;
import cn.lcp.fcct.service.SysDeviceWaterRealtimeService;
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
public class SysDeviceWaterRealtimeServiceImpl implements SysDeviceWaterRealtimeService {


        @Autowired
        private SysDeviceWaterRealtimeMapper sysDeviceWaterRealtimeMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条SysDeviceWaterRealtimeDO数据
         */
        @Override
        public void insertData(SysDeviceWaterRealtimeDO sysDeviceWaterRealtimeDO){
            log.info("添加单条SysDeviceWaterRealtimeDO数据:"+sysDeviceWaterRealtimeDO);
            sysDeviceWaterRealtimeMapper.insertData(sysDeviceWaterRealtimeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条SysDeviceWaterRealtimeDO数据
         */
        @Override
        public void updateData(SysDeviceWaterRealtimeDO sysDeviceWaterRealtimeDO){
            log.info("修改单条SysDeviceWaterRealtimeDO数据:"+sysDeviceWaterRealtimeDO);
            sysDeviceWaterRealtimeMapper.updateData(sysDeviceWaterRealtimeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除SysDeviceWaterRealtimeDO数据
         */
        @Override
        public void deleteById(Integer deviceId){
            log.info("根据ID删除SysDeviceWaterRealtimeDO数据:"+deviceId);
            sysDeviceWaterRealtimeMapper.deleteById(deviceId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取SysDeviceWaterRealtimeDO一条数据
         */
        @Override
        public SysDeviceWaterRealtimeDO getById(Integer deviceId){
            log.info("根据ID获取SysDeviceWaterRealtimeDO一条数据:"+deviceId);
            SysDeviceWaterRealtimeDO sysDeviceWaterRealtime = sysDeviceWaterRealtimeMapper.getById(deviceId);
            return sysDeviceWaterRealtime;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据SysDeviceWaterRealtimeDO
         */
        @Override
        public List<SysDeviceWaterRealtimeDO> getAll(){
            log.info("获取SysDeviceWaterRealtimeDO所有条数据");
            List<SysDeviceWaterRealtimeDO> sysDeviceWaterRealtimeList = sysDeviceWaterRealtimeMapper.getAll();
            return sysDeviceWaterRealtimeList;
        }


}
