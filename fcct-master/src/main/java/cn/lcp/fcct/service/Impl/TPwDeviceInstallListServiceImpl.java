package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceInstallListMapper;
import cn.lcp.fcct.po.TPwDeviceInstallListDO;
import cn.lcp.fcct.service.TPwDeviceInstallListService;
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
public class TPwDeviceInstallListServiceImpl implements TPwDeviceInstallListService {


        @Autowired
        private TPwDeviceInstallListMapper tPwDeviceInstallListMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceInstallListDO数据
         */
        @Override
        public void insertData(TPwDeviceInstallListDO tPwDeviceInstallListDO){
            log.info("添加单条TPwDeviceInstallListDO数据:"+tPwDeviceInstallListDO);
            tPwDeviceInstallListMapper.insertData(tPwDeviceInstallListDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceInstallListDO数据
         */
        @Override
        public void updateData(TPwDeviceInstallListDO tPwDeviceInstallListDO){
            log.info("修改单条TPwDeviceInstallListDO数据:"+tPwDeviceInstallListDO);
            tPwDeviceInstallListMapper.updateData(tPwDeviceInstallListDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceInstallListDO数据
         */
        @Override
        public void deleteById(Integer listId){
            log.info("根据ID删除TPwDeviceInstallListDO数据:"+listId);
            tPwDeviceInstallListMapper.deleteById(listId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceInstallListDO一条数据
         */
        @Override
        public TPwDeviceInstallListDO getById(Integer listId){
            log.info("根据ID获取TPwDeviceInstallListDO一条数据:"+listId);
            TPwDeviceInstallListDO tPwDeviceInstallList = tPwDeviceInstallListMapper.getById(listId);
            return tPwDeviceInstallList;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceInstallListDO
         */
        @Override
        public List<TPwDeviceInstallListDO> getAll(){
            log.info("获取TPwDeviceInstallListDO所有条数据");
            List<TPwDeviceInstallListDO> tPwDeviceInstallListList = tPwDeviceInstallListMapper.getAll();
            return tPwDeviceInstallListList;
        }


}
