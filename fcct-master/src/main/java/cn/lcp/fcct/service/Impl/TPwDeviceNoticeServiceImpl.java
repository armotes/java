package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwDeviceNoticeMapper;
import cn.lcp.fcct.po.TPwDeviceNoticeDO;
import cn.lcp.fcct.service.TPwDeviceNoticeService;
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
public class TPwDeviceNoticeServiceImpl implements TPwDeviceNoticeService {


        @Autowired
        private TPwDeviceNoticeMapper tPwDeviceNoticeMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwDeviceNoticeDO数据
         */
        @Override
        public void insertData(TPwDeviceNoticeDO tPwDeviceNoticeDO){
            log.info("添加单条TPwDeviceNoticeDO数据:"+tPwDeviceNoticeDO);
            tPwDeviceNoticeMapper.insertData(tPwDeviceNoticeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwDeviceNoticeDO数据
         */
        @Override
        public void updateData(TPwDeviceNoticeDO tPwDeviceNoticeDO){
            log.info("修改单条TPwDeviceNoticeDO数据:"+tPwDeviceNoticeDO);
            tPwDeviceNoticeMapper.updateData(tPwDeviceNoticeDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwDeviceNoticeDO数据
         */
        @Override
        public void deleteById(Integer noticeId){
            log.info("根据ID删除TPwDeviceNoticeDO数据:"+noticeId);
            tPwDeviceNoticeMapper.deleteById(noticeId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwDeviceNoticeDO一条数据
         */
        @Override
        public TPwDeviceNoticeDO getById(Integer noticeId){
            log.info("根据ID获取TPwDeviceNoticeDO一条数据:"+noticeId);
            TPwDeviceNoticeDO tPwDeviceNotice = tPwDeviceNoticeMapper.getById(noticeId);
            return tPwDeviceNotice;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwDeviceNoticeDO
         */
        @Override
        public List<TPwDeviceNoticeDO> getAll(){
            log.info("获取TPwDeviceNoticeDO所有条数据");
            List<TPwDeviceNoticeDO> tPwDeviceNoticeList = tPwDeviceNoticeMapper.getAll();
            return tPwDeviceNoticeList;
        }


}
