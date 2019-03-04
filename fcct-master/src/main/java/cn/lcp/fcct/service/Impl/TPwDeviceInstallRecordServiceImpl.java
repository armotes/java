package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceInstallRecordMapper;
import cn.lcp.fcct.po.TPwDeviceInstallRecordDO;
import cn.lcp.fcct.service.TPwDeviceInstallRecordService;
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
public class TPwDeviceInstallRecordServiceImpl implements TPwDeviceInstallRecordService {


        @Autowired
        private TPwDeviceInstallRecordMapper tPwDeviceInstallRecordMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceInstallRecordDO数据
         */
        @Override
        public void insertData(TPwDeviceInstallRecordDO tPwDeviceInstallRecordDO){
            log.info("添加单条TPwDeviceInstallRecordDO数据:"+tPwDeviceInstallRecordDO);
            tPwDeviceInstallRecordMapper.insertData(tPwDeviceInstallRecordDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceInstallRecordDO数据
         */
        @Override
        public void updateData(TPwDeviceInstallRecordDO tPwDeviceInstallRecordDO){
            log.info("修改单条TPwDeviceInstallRecordDO数据:"+tPwDeviceInstallRecordDO);
            tPwDeviceInstallRecordMapper.updateData(tPwDeviceInstallRecordDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceInstallRecordDO数据
         */
        @Override
        public void deleteById(Integer recordId){
            log.info("根据ID删除TPwDeviceInstallRecordDO数据:"+recordId);
            tPwDeviceInstallRecordMapper.deleteById(recordId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceInstallRecordDO一条数据
         */
        @Override
        public TPwDeviceInstallRecordDO getById(Integer recordId){
            log.info("根据ID获取TPwDeviceInstallRecordDO一条数据:"+recordId);
            TPwDeviceInstallRecordDO tPwDeviceInstallRecord = tPwDeviceInstallRecordMapper.getById(recordId);
            return tPwDeviceInstallRecord;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceInstallRecordDO
         */
        @Override
        public List<TPwDeviceInstallRecordDO> getAll(){
            log.info("获取TPwDeviceInstallRecordDO所有条数据");
            List<TPwDeviceInstallRecordDO> tPwDeviceInstallRecordList = tPwDeviceInstallRecordMapper.getAll();
            return tPwDeviceInstallRecordList;
        }


}
