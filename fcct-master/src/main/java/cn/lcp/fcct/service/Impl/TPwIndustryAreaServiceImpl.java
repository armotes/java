package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwIndustryAreaMapper;
import cn.lcp.fcct.po.TPwIndustryAreaDO;
import cn.lcp.fcct.service.TPwIndustryAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业区域信息表服务实现类
 */
@Slf4j
@Service
public class TPwIndustryAreaServiceImpl implements TPwIndustryAreaService {


        @Autowired
        private TPwIndustryAreaMapper tPwIndustryAreaMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwIndustryAreaDO数据
         */
        @Override
        public void insertData(TPwIndustryAreaDO tPwIndustryAreaDO){
            log.info("添加单条TPwIndustryAreaDO数据:"+tPwIndustryAreaDO);
            tPwIndustryAreaMapper.insertData(tPwIndustryAreaDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwIndustryAreaDO数据
         */
        @Override
        public void updateData(TPwIndustryAreaDO tPwIndustryAreaDO){
            log.info("修改单条TPwIndustryAreaDO数据:"+tPwIndustryAreaDO);
            tPwIndustryAreaMapper.updateData(tPwIndustryAreaDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwIndustryAreaDO数据
         */
        @Override
        public void deleteById(Integer areaId){
            log.info("根据ID删除TPwIndustryAreaDO数据:"+areaId);
            tPwIndustryAreaMapper.deleteById(areaId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwIndustryAreaDO一条数据
         */
        @Override
        public TPwIndustryAreaDO getById(Integer areaId){
            log.info("根据ID获取TPwIndustryAreaDO一条数据:"+areaId);
            TPwIndustryAreaDO tPwIndustryArea = tPwIndustryAreaMapper.getById(areaId);
            return tPwIndustryArea;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwIndustryAreaDO
         */
        @Override
        public List<TPwIndustryAreaDO> getAll(){
            log.info("获取TPwIndustryAreaDO所有条数据");
            List<TPwIndustryAreaDO> tPwIndustryAreaList = tPwIndustryAreaMapper.getAll();
            return tPwIndustryAreaList;
        }


}
