package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwRoleFunMapper;
import cn.lcp.fcct.po.TPwRoleFunDO;
import cn.lcp.fcct.service.TPwRoleFunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色和功能【菜单】关联表服务实现类
 */
@Slf4j
@Service
public class TPwRoleFunServiceImpl implements TPwRoleFunService {


        @Autowired
        private TPwRoleFunMapper tPwRoleFunMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwRoleFunDO数据
         */
        @Override
        public void insertData(TPwRoleFunDO tPwRoleFunDO){
            log.info("添加单条TPwRoleFunDO数据:"+tPwRoleFunDO);
            tPwRoleFunMapper.insertData(tPwRoleFunDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwRoleFunDO数据
         */
        @Override
        public void updateData(TPwRoleFunDO tPwRoleFunDO){
            log.info("修改单条TPwRoleFunDO数据:"+tPwRoleFunDO);
            tPwRoleFunMapper.updateData(tPwRoleFunDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwRoleFunDO数据
         */
        @Override
        public void deleteById(Integer tId){
            log.info("根据ID删除TPwRoleFunDO数据:"+tId);
            tPwRoleFunMapper.deleteById(tId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwRoleFunDO一条数据
         */
        @Override
        public TPwRoleFunDO getById(Integer tId){
            log.info("根据ID获取TPwRoleFunDO一条数据:"+tId);
            TPwRoleFunDO tPwRoleFun = tPwRoleFunMapper.getById(tId);
            return tPwRoleFun;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwRoleFunDO
         */
        @Override
        public List<TPwRoleFunDO> getAll(){
            log.info("获取TPwRoleFunDO所有条数据");
            List<TPwRoleFunDO> tPwRoleFunList = tPwRoleFunMapper.getAll();
            return tPwRoleFunList;
        }


}
