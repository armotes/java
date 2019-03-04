package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwContactorInfoMapper;
import cn.lcp.fcct.po.TPwContactorInfoDO;
import cn.lcp.fcct.service.TPwContactorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户联系人信息表服务实现类
 */
@Slf4j
@Service
public class TPwContactorInfoServiceImpl implements TPwContactorInfoService {


        @Autowired
        private TPwContactorInfoMapper tPwContactorInfoMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwContactorInfoDO数据
         */
        @Override
        public void insertData(TPwContactorInfoDO tPwContactorInfoDO){
            log.info("添加单条TPwContactorInfoDO数据:"+tPwContactorInfoDO);
            tPwContactorInfoMapper.insertData(tPwContactorInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwContactorInfoDO数据
         */
        @Override
        public void updateData(TPwContactorInfoDO tPwContactorInfoDO){
            log.info("修改单条TPwContactorInfoDO数据:"+tPwContactorInfoDO);
            tPwContactorInfoMapper.updateData(tPwContactorInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwContactorInfoDO数据
         */
        @Override
        public void deleteById(Integer contactId){
            log.info("根据ID删除TPwContactorInfoDO数据:"+contactId);
            tPwContactorInfoMapper.deleteById(contactId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwContactorInfoDO一条数据
         */
        @Override
        public TPwContactorInfoDO getById(Integer contactId){
            log.info("根据ID获取TPwContactorInfoDO一条数据:"+contactId);
            TPwContactorInfoDO tPwContactorInfo = tPwContactorInfoMapper.getById(contactId);
            return tPwContactorInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwContactorInfoDO
         */
        @Override
        public List<TPwContactorInfoDO> getAll(){
            log.info("获取TPwContactorInfoDO所有条数据");
            List<TPwContactorInfoDO> tPwContactorInfoList = tPwContactorInfoMapper.getAll();
            return tPwContactorInfoList;
        }


}
