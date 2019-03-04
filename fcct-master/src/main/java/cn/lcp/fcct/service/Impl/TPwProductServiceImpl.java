package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.TPwProductMapper;
import cn.lcp.fcct.po.TPwProductDO;
import cn.lcp.fcct.service.TPwProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品服务实现类
 */
@Slf4j
@Service
public class TPwProductServiceImpl implements TPwProductService {


        @Autowired
        private TPwProductMapper tPwProductMapper;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwProductDO数据
         */
        @Override
        public void insertData(TPwProductDO tPwProductDO){
            log.info("添加单条TPwProductDO数据:"+tPwProductDO);
            tPwProductMapper.insertData(tPwProductDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwProductDO数据
         */
        @Override
        public void updateData(TPwProductDO tPwProductDO){
            log.info("修改单条TPwProductDO数据:"+tPwProductDO);
            tPwProductMapper.updateData(tPwProductDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwProductDO数据
         */
        @Override
        public void deleteById(Integer productId){
            log.info("根据ID删除TPwProductDO数据:"+productId);
            tPwProductMapper.deleteById(productId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwProductDO一条数据
         */
        @Override
        public TPwProductDO getById(Integer productId){
            log.info("根据ID获取TPwProductDO一条数据:"+productId);
            TPwProductDO tPwProduct = tPwProductMapper.getById(productId);
            return tPwProduct;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwProductDO
         */
        @Override
        public List<TPwProductDO> getAll(){
            log.info("获取TPwProductDO所有条数据");
            List<TPwProductDO> tPwProductList = tPwProductMapper.getAll();
            return tPwProductList;
        }


}
