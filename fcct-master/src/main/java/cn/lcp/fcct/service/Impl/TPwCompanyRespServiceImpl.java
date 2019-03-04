package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwCompanyRespMapper;
import cn.lcp.fcct.po.TPwCompanyRespDO;
import cn.lcp.fcct.service.TPwCompanyRespService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:57
 * @Description: 公司水机责任人服务实现类
 */
@Slf4j
@Service
public class TPwCompanyRespServiceImpl implements TPwCompanyRespService {


        @Autowired
        private TPwCompanyRespMapper tPwCompanyRespMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 添加单条TPwCompanyRespDO数据
         */
        @Override
        public void insertData(TPwCompanyRespDO tPwCompanyRespDO){
            log.info("添加单条TPwCompanyRespDO数据:"+tPwCompanyRespDO);
            tPwCompanyRespMapper.insertData(tPwCompanyRespDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 修改单条TPwCompanyRespDO数据
         */
        @Override
        public void updateData(TPwCompanyRespDO tPwCompanyRespDO){
            log.info("修改单条TPwCompanyRespDO数据:"+tPwCompanyRespDO);
            tPwCompanyRespMapper.updateData(tPwCompanyRespDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID删除TPwCompanyRespDO数据
         */
        @Override
        public void deleteById(Integer respId){
            log.info("根据ID删除TPwCompanyRespDO数据:"+respId);
            tPwCompanyRespMapper.deleteById(respId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 根据ID获取TPwCompanyRespDO一条数据
         */
        @Override
        public TPwCompanyRespDO getById(Integer respId){
            log.info("根据ID获取TPwCompanyRespDO一条数据:"+respId);
            TPwCompanyRespDO tPwCompanyResp = tPwCompanyRespMapper.getById(respId);
            return tPwCompanyResp;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:57
         * @Description: 查询所有数据TPwCompanyRespDO
         */
        @Override
        public List<TPwCompanyRespDO> getAll(){
            log.info("获取TPwCompanyRespDO所有条数据");
            List<TPwCompanyRespDO> tPwCompanyRespList = tPwCompanyRespMapper.getAll();
            return tPwCompanyRespList;
        }


}
