package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceLogFileMapper;
import cn.lcp.fcct.po.TPwDeviceLogFileDO;
import cn.lcp.fcct.service.TPwDeviceLogFileService;
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
public class TPwDeviceLogFileServiceImpl implements TPwDeviceLogFileService {


        @Autowired
        private TPwDeviceLogFileMapper tPwDeviceLogFileMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceLogFileDO数据
         */
        @Override
        public void insertData(TPwDeviceLogFileDO tPwDeviceLogFileDO){
            log.info("添加单条TPwDeviceLogFileDO数据:"+tPwDeviceLogFileDO);
            tPwDeviceLogFileMapper.insertData(tPwDeviceLogFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceLogFileDO数据
         */
        @Override
        public void updateData(TPwDeviceLogFileDO tPwDeviceLogFileDO){
            log.info("修改单条TPwDeviceLogFileDO数据:"+tPwDeviceLogFileDO);
            tPwDeviceLogFileMapper.updateData(tPwDeviceLogFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceLogFileDO数据
         */
        @Override
        public void deleteById(Integer deviceFileId){
            log.info("根据ID删除TPwDeviceLogFileDO数据:"+deviceFileId);
            tPwDeviceLogFileMapper.deleteById(deviceFileId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceLogFileDO一条数据
         */
        @Override
        public TPwDeviceLogFileDO getById(Integer deviceFileId){
            log.info("根据ID获取TPwDeviceLogFileDO一条数据:"+deviceFileId);
            TPwDeviceLogFileDO tPwDeviceLogFile = tPwDeviceLogFileMapper.getById(deviceFileId);
            return tPwDeviceLogFile;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceLogFileDO
         */
        @Override
        public List<TPwDeviceLogFileDO> getAll(){
            log.info("获取TPwDeviceLogFileDO所有条数据");
            List<TPwDeviceLogFileDO> tPwDeviceLogFileList = tPwDeviceLogFileMapper.getAll();
            return tPwDeviceLogFileList;
        }


}
