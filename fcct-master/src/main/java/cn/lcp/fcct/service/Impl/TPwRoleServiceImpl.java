package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwRoleMapper;
import cn.lcp.fcct.po.TPwRoleDO;
import cn.lcp.fcct.service.TPwRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 角色信息服务实现类
 */
@Slf4j
@Service
public class TPwRoleServiceImpl implements TPwRoleService {


        @Autowired
        private TPwRoleMapper tPwRoleMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwRoleDO数据
         */
        @Override
        public void insertData(TPwRoleDO tPwRoleDO){
            log.info("添加单条TPwRoleDO数据:"+tPwRoleDO);
            tPwRoleMapper.insertData(tPwRoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwRoleDO数据
         */
        @Override
        public void updateData(TPwRoleDO tPwRoleDO){
            log.info("修改单条TPwRoleDO数据:"+tPwRoleDO);
            tPwRoleMapper.updateData(tPwRoleDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwRoleDO数据
         */
        @Override
        public void deleteById(Integer roleId){
            log.info("根据ID删除TPwRoleDO数据:"+roleId);
            tPwRoleMapper.deleteById(roleId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwRoleDO一条数据
         */
        @Override
        public TPwRoleDO getById(Integer roleId){
            log.info("根据ID获取TPwRoleDO一条数据:"+roleId);
            TPwRoleDO tPwRole = tPwRoleMapper.getById(roleId);
            return tPwRole;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwRoleDO
         */
        @Override
        public List<TPwRoleDO> getAll(){
            log.info("获取TPwRoleDO所有条数据");
            List<TPwRoleDO> tPwRoleList = tPwRoleMapper.getAll();
            return tPwRoleList;
        }


}
