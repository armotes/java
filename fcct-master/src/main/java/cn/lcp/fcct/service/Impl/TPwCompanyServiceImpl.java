package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwCompanyMapper;
import cn.lcp.fcct.po.TPwCompanyDO;
import cn.lcp.fcct.service.TPwCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司信息表服务实现类
 */
@Slf4j
@Service
public class TPwCompanyServiceImpl implements TPwCompanyService {


        @Autowired
        private TPwCompanyMapper tPwCompanyMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyDO数据
         */
        @Override
        public void insertData(TPwCompanyDO tPwCompanyDO){
            log.info("添加单条TPwCompanyDO数据:"+tPwCompanyDO);
            tPwCompanyMapper.insertData(tPwCompanyDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyDO数据
         */
        @Override
        public void updateData(TPwCompanyDO tPwCompanyDO){
            log.info("修改单条TPwCompanyDO数据:"+tPwCompanyDO);
            tPwCompanyMapper.updateData(tPwCompanyDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyDO数据
         */
        @Override
        public void deleteById(Integer comId){
            log.info("根据ID删除TPwCompanyDO数据:"+comId);
            tPwCompanyMapper.deleteById(comId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyDO一条数据
         */
        @Override
        public TPwCompanyDO getById(Integer comId){
            log.info("根据ID获取TPwCompanyDO一条数据:"+comId);
            TPwCompanyDO tPwCompany = tPwCompanyMapper.getById(comId);
            return tPwCompany;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyDO
         */
        @Override
        public List<TPwCompanyDO> getAll(){
            log.info("获取TPwCompanyDO所有条数据");
            List<TPwCompanyDO> tPwCompanyList = tPwCompanyMapper.getAll();
            return tPwCompanyList;
        }


}
