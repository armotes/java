package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwFunctionMapper;
import cn.lcp.fcct.po.TPwFunctionDO;
import cn.lcp.fcct.service.TPwFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 功能【菜单】信息服务实现类
 */
@Slf4j
@Service
public class TPwFunctionServiceImpl implements TPwFunctionService {


        @Autowired
        private TPwFunctionMapper tPwFunctionMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwFunctionDO数据
         */
        @Override
        public void insertData(TPwFunctionDO tPwFunctionDO){
            log.info("添加单条TPwFunctionDO数据:"+tPwFunctionDO);
            tPwFunctionMapper.insertData(tPwFunctionDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwFunctionDO数据
         */
        @Override
        public void updateData(TPwFunctionDO tPwFunctionDO){
            log.info("修改单条TPwFunctionDO数据:"+tPwFunctionDO);
            tPwFunctionMapper.updateData(tPwFunctionDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwFunctionDO数据
         */
        @Override
        public void deleteById(Integer funId){
            log.info("根据ID删除TPwFunctionDO数据:"+funId);
            tPwFunctionMapper.deleteById(funId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwFunctionDO一条数据
         */
        @Override
        public TPwFunctionDO getById(Integer funId){
            log.info("根据ID获取TPwFunctionDO一条数据:"+funId);
            TPwFunctionDO tPwFunction = tPwFunctionMapper.getById(funId);
            return tPwFunction;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwFunctionDO
         */
        @Override
        public List<TPwFunctionDO> getAll(){
            log.info("获取TPwFunctionDO所有条数据");
            List<TPwFunctionDO> tPwFunctionList = tPwFunctionMapper.getAll();
            return tPwFunctionList;
        }


}
