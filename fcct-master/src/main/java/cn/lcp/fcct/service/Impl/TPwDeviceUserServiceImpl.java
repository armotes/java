package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceUserMapper;
import cn.lcp.fcct.po.TPwDeviceUserDO;
import cn.lcp.fcct.service.TPwDeviceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 服务实现类
 */
@Slf4j
@Service
public class TPwDeviceUserServiceImpl implements TPwDeviceUserService {


        @Autowired
        private TPwDeviceUserMapper tPwDeviceUserMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceUserDO数据
         */
        @Override
        public void insertData(TPwDeviceUserDO tPwDeviceUserDO){
            log.info("添加单条TPwDeviceUserDO数据:"+tPwDeviceUserDO);
            tPwDeviceUserMapper.insertData(tPwDeviceUserDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceUserDO数据
         */
        @Override
        public void updateData(TPwDeviceUserDO tPwDeviceUserDO){
            log.info("修改单条TPwDeviceUserDO数据:"+tPwDeviceUserDO);
            tPwDeviceUserMapper.updateData(tPwDeviceUserDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceUserDO数据
         */
        @Override
        public void deleteById(Integer deviceUserId){
            log.info("根据ID删除TPwDeviceUserDO数据:"+deviceUserId);
            tPwDeviceUserMapper.deleteById(deviceUserId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceUserDO一条数据
         */
        @Override
        public TPwDeviceUserDO getById(Integer deviceUserId){
            log.info("根据ID获取TPwDeviceUserDO一条数据:"+deviceUserId);
            TPwDeviceUserDO tPwDeviceUser = tPwDeviceUserMapper.getById(deviceUserId);
            return tPwDeviceUser;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceUserDO
         */
        @Override
        public List<TPwDeviceUserDO> getAll(){
            log.info("获取TPwDeviceUserDO所有条数据");
            List<TPwDeviceUserDO> tPwDeviceUserList = tPwDeviceUserMapper.getAll();
            return tPwDeviceUserList;
        }


}
