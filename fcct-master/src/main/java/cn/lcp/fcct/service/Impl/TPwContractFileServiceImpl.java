package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwContractFileMapper;
import cn.lcp.fcct.po.TPwContractFileDO;
import cn.lcp.fcct.service.TPwContractFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 订单合同文件表服务实现类
 */
@Slf4j
@Service
public class TPwContractFileServiceImpl implements TPwContractFileService {


        @Autowired
        private TPwContractFileMapper tPwContractFileMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwContractFileDO数据
         */
        @Override
        public void insertData(TPwContractFileDO tPwContractFileDO){
            log.info("添加单条TPwContractFileDO数据:"+tPwContractFileDO);
            tPwContractFileMapper.insertData(tPwContractFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwContractFileDO数据
         */
        @Override
        public void updateData(TPwContractFileDO tPwContractFileDO){
            log.info("修改单条TPwContractFileDO数据:"+tPwContractFileDO);
            tPwContractFileMapper.updateData(tPwContractFileDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwContractFileDO数据
         */
        @Override
        public void deleteById(Integer fileId){
            log.info("根据ID删除TPwContractFileDO数据:"+fileId);
            tPwContractFileMapper.deleteById(fileId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwContractFileDO一条数据
         */
        @Override
        public TPwContractFileDO getById(Integer fileId){
            log.info("根据ID获取TPwContractFileDO一条数据:"+fileId);
            TPwContractFileDO tPwContractFile = tPwContractFileMapper.getById(fileId);
            return tPwContractFile;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwContractFileDO
         */
        @Override
        public List<TPwContractFileDO> getAll(){
            log.info("获取TPwContractFileDO所有条数据");
            List<TPwContractFileDO> tPwContractFileList = tPwContractFileMapper.getAll();
            return tPwContractFileList;
        }


}
