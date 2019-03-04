package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwCompanyIntroducerMapper;
import cn.lcp.fcct.po.TPwCompanyIntroducerDO;
import cn.lcp.fcct.service.TPwCompanyIntroducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司引荐人服务实现类
 */
@Slf4j
@Service
public class TPwCompanyIntroducerServiceImpl implements TPwCompanyIntroducerService {


        @Autowired
        private TPwCompanyIntroducerMapper tPwCompanyIntroducerMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyIntroducerDO数据
         */
        @Override
        public void insertData(TPwCompanyIntroducerDO tPwCompanyIntroducerDO){
            log.info("添加单条TPwCompanyIntroducerDO数据:"+tPwCompanyIntroducerDO);
            tPwCompanyIntroducerMapper.insertData(tPwCompanyIntroducerDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyIntroducerDO数据
         */
        @Override
        public void updateData(TPwCompanyIntroducerDO tPwCompanyIntroducerDO){
            log.info("修改单条TPwCompanyIntroducerDO数据:"+tPwCompanyIntroducerDO);
            tPwCompanyIntroducerMapper.updateData(tPwCompanyIntroducerDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyIntroducerDO数据
         */
        @Override
        public void deleteById(Integer introId){
            log.info("根据ID删除TPwCompanyIntroducerDO数据:"+introId);
            tPwCompanyIntroducerMapper.deleteById(introId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyIntroducerDO一条数据
         */
        @Override
        public TPwCompanyIntroducerDO getById(Integer introId){
            log.info("根据ID获取TPwCompanyIntroducerDO一条数据:"+introId);
            TPwCompanyIntroducerDO tPwCompanyIntroducer = tPwCompanyIntroducerMapper.getById(introId);
            return tPwCompanyIntroducer;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyIntroducerDO
         */
        @Override
        public List<TPwCompanyIntroducerDO> getAll(){
            log.info("获取TPwCompanyIntroducerDO所有条数据");
            List<TPwCompanyIntroducerDO> tPwCompanyIntroducerList = tPwCompanyIntroducerMapper.getAll();
            return tPwCompanyIntroducerList;
        }


}
