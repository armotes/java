package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwCompanyTypeMapper;
import cn.lcp.fcct.po.TPwCompanyTypeDO;
import cn.lcp.fcct.service.TPwCompanyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司类型服务实现类
 */
@Slf4j
@Service
public class TPwCompanyTypeServiceImpl implements TPwCompanyTypeService {


        @Autowired
        private TPwCompanyTypeMapper tPwCompanyTypeMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyTypeDO数据
         */
        @Override
        public void insertData(TPwCompanyTypeDO tPwCompanyTypeDO){
            log.info("添加单条TPwCompanyTypeDO数据:"+tPwCompanyTypeDO);
            tPwCompanyTypeMapper.insertData(tPwCompanyTypeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyTypeDO数据
         */
        @Override
        public void updateData(TPwCompanyTypeDO tPwCompanyTypeDO){
            log.info("修改单条TPwCompanyTypeDO数据:"+tPwCompanyTypeDO);
            tPwCompanyTypeMapper.updateData(tPwCompanyTypeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyTypeDO数据
         */
        @Override
        public void deleteById(Integer typeId){
            log.info("根据ID删除TPwCompanyTypeDO数据:"+typeId);
            tPwCompanyTypeMapper.deleteById(typeId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyTypeDO一条数据
         */
        @Override
        public TPwCompanyTypeDO getById(Integer typeId){
            log.info("根据ID获取TPwCompanyTypeDO一条数据:"+typeId);
            TPwCompanyTypeDO tPwCompanyType = tPwCompanyTypeMapper.getById(typeId);
            return tPwCompanyType;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyTypeDO
         */
        @Override
        public List<TPwCompanyTypeDO> getAll(){
            log.info("获取TPwCompanyTypeDO所有条数据");
            List<TPwCompanyTypeDO> tPwCompanyTypeList = tPwCompanyTypeMapper.getAll();
            return tPwCompanyTypeList;
        }


}
