package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwProductDO;
import cn.lcp.fcct.service.TPwProductService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 产品控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwProduct")
public class TPwProductController {

        @Autowired
        private TPwProductService tPwProductService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwProductDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwProductDO tPwProductDO){
            log.info("添加单条TPwProductDO数据:"+tPwProductDO);
            tPwProductService.insertData(tPwProductDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwProductDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwProductDO tPwProductDO){
            log.info("修改单条TPwProductDO数据:"+tPwProductDO);
            tPwProductService.updateData(tPwProductDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwProductDO数据
         */
        @RequestMapping("/updateData/{productId}")
        public void deleteById(@PathVariable("productId")Integer productId){
            log.info("根据ID删除TPwProductDO数据:"+productId);
            tPwProductService.deleteById(productId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwProductDO一条数据
         */
        @RequestMapping("/getById/{productId}")
        public TPwProductDO getById(@PathVariable("productId")Integer productId){
            log.info("根据ID获取TPwProductDO一条数据:"+productId);
            TPwProductDO tPwProduct = tPwProductService.getById(productId);
            return tPwProduct;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwProductDO
         */
        @RequestMapping("/getAll")
        public List<TPwProductDO> getAll(){
            log.info("获取TPwProductDO所有条数据");
            List<TPwProductDO> tPwProductList = tPwProductService.getAll();
            return tPwProductList;
        }


}
