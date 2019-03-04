package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDepartmentMapper;
import cn.lcp.fcct.po.TPwDepartmentDO;
import cn.lcp.fcct.service.TPwDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 部门类型服务实现类
 */
@Slf4j
@Service
public class TPwDepartmentServiceImpl implements TPwDepartmentService {


        @Autowired
        private TPwDepartmentMapper tPwDepartmentMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDepartmentDO数据
         */
        @Override
        public void insertData(TPwDepartmentDO tPwDepartmentDO){
            log.info("添加单条TPwDepartmentDO数据:"+tPwDepartmentDO);
            tPwDepartmentMapper.insertData(tPwDepartmentDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDepartmentDO数据
         */
        @Override
        public void updateData(TPwDepartmentDO tPwDepartmentDO){
            log.info("修改单条TPwDepartmentDO数据:"+tPwDepartmentDO);
            tPwDepartmentMapper.updateData(tPwDepartmentDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDepartmentDO数据
         */
        @Override
        public void deleteById(Integer deptId){
            log.info("根据ID删除TPwDepartmentDO数据:"+deptId);
            tPwDepartmentMapper.deleteById(deptId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDepartmentDO一条数据
         */
        @Override
        public TPwDepartmentDO getById(Integer deptId){
            log.info("根据ID获取TPwDepartmentDO一条数据:"+deptId);
            TPwDepartmentDO tPwDepartment = tPwDepartmentMapper.getById(deptId);
            return tPwDepartment;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDepartmentDO
         */
        @Override
        public List<TPwDepartmentDO> getAll(){
            log.info("获取TPwDepartmentDO所有条数据");
            List<TPwDepartmentDO> tPwDepartmentList = tPwDepartmentMapper.getAll();
            return tPwDepartmentList;
        }


}
