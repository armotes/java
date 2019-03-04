package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwStaffInfoMapper;
import cn.lcp.fcct.po.TPwStaffInfoDO;
import cn.lcp.fcct.service.TPwStaffInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:59
 * @Description: 员工信息表服务实现类
 */
@Slf4j
@Service
public class TPwStaffInfoServiceImpl implements TPwStaffInfoService {


        @Autowired
        private TPwStaffInfoMapper tPwStaffInfoMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 添加单条TPwStaffInfoDO数据
         */
        @Override
        public void insertData(TPwStaffInfoDO tPwStaffInfoDO){
            log.info("添加单条TPwStaffInfoDO数据:"+tPwStaffInfoDO);
            tPwStaffInfoMapper.insertData(tPwStaffInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 修改单条TPwStaffInfoDO数据
         */
        @Override
        public void updateData(TPwStaffInfoDO tPwStaffInfoDO){
            log.info("修改单条TPwStaffInfoDO数据:"+tPwStaffInfoDO);
            tPwStaffInfoMapper.updateData(tPwStaffInfoDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID删除TPwStaffInfoDO数据
         */
        @Override
        public void deleteById(Integer staffId){
            log.info("根据ID删除TPwStaffInfoDO数据:"+staffId);
            tPwStaffInfoMapper.deleteById(staffId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 根据ID获取TPwStaffInfoDO一条数据
         */
        @Override
        public TPwStaffInfoDO getById(Integer staffId){
            log.info("根据ID获取TPwStaffInfoDO一条数据:"+staffId);
            TPwStaffInfoDO tPwStaffInfo = tPwStaffInfoMapper.getById(staffId);
            return tPwStaffInfo;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:59
         * @Description: 查询所有数据TPwStaffInfoDO
         */
        @Override
        public List<TPwStaffInfoDO> getAll(){
            log.info("获取TPwStaffInfoDO所有条数据");
            List<TPwStaffInfoDO> tPwStaffInfoList = tPwStaffInfoMapper.getAll();
            return tPwStaffInfoList;
        }


}
