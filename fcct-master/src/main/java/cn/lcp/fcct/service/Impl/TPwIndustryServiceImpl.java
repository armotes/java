package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwIndustryMapper;
import cn.lcp.fcct.po.TPwIndustryDO;
import cn.lcp.fcct.service.TPwIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业信息表服务实现类
 */
@Slf4j
@Service
public class TPwIndustryServiceImpl implements TPwIndustryService {


        @Autowired
        private TPwIndustryMapper tPwIndustryMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwIndustryDO数据
         */
        @Override
        public void insertData(TPwIndustryDO tPwIndustryDO){
            log.info("添加单条TPwIndustryDO数据:"+tPwIndustryDO);
            tPwIndustryMapper.insertData(tPwIndustryDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwIndustryDO数据
         */
        @Override
        public void updateData(TPwIndustryDO tPwIndustryDO){
            log.info("修改单条TPwIndustryDO数据:"+tPwIndustryDO);
            tPwIndustryMapper.updateData(tPwIndustryDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwIndustryDO数据
         */
        @Override
        public void deleteById(Integer industryId){
            log.info("根据ID删除TPwIndustryDO数据:"+industryId);
            tPwIndustryMapper.deleteById(industryId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwIndustryDO一条数据
         */
        @Override
        public TPwIndustryDO getById(Integer industryId){
            log.info("根据ID获取TPwIndustryDO一条数据:"+industryId);
            TPwIndustryDO tPwIndustry = tPwIndustryMapper.getById(industryId);
            return tPwIndustry;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwIndustryDO
         */
        @Override
        public List<TPwIndustryDO> getAll(){
            log.info("获取TPwIndustryDO所有条数据");
            List<TPwIndustryDO> tPwIndustryList = tPwIndustryMapper.getAll();
            return tPwIndustryList;
        }


}
