package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwCustomInfoMapper;
import cn.lcp.fcct.po.TPwCustomInfoDO;
import cn.lcp.fcct.service.TPwCustomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 客户信息表服务实现类
 */
@Slf4j
@Service
public class TPwCustomInfoServiceImpl implements TPwCustomInfoService {


        @Autowired
        private TPwCustomInfoMapper tPwCustomInfoMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwCustomInfoDO数据
         */
        @Override
        public void insertData(TPwCustomInfoDO tPwCustomInfoDO){
            log.info("添加单条TPwCustomInfoDO数据:"+tPwCustomInfoDO);
            tPwCustomInfoMapper.insertData(tPwCustomInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwCustomInfoDO数据
         */
        @Override
        public void updateData(TPwCustomInfoDO tPwCustomInfoDO){
            log.info("修改单条TPwCustomInfoDO数据:"+tPwCustomInfoDO);
            tPwCustomInfoMapper.updateData(tPwCustomInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwCustomInfoDO数据
         */
        @Override
        public void deleteById(Integer coustomerId){
            log.info("根据ID删除TPwCustomInfoDO数据:"+coustomerId);
            tPwCustomInfoMapper.deleteById(coustomerId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwCustomInfoDO一条数据
         */
        @Override
        public TPwCustomInfoDO getById(Integer coustomerId){
            log.info("根据ID获取TPwCustomInfoDO一条数据:"+coustomerId);
            TPwCustomInfoDO tPwCustomInfo = tPwCustomInfoMapper.getById(coustomerId);
            return tPwCustomInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwCustomInfoDO
         */
        @Override
        public List<TPwCustomInfoDO> getAll(){
            log.info("获取TPwCustomInfoDO所有条数据");
            List<TPwCustomInfoDO> tPwCustomInfoList = tPwCustomInfoMapper.getAll();
            return tPwCustomInfoList;
        }


}
