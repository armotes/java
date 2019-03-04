package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.TPwIndustryAreaDO;
import cn.lcp.fcct.service.TPwIndustryAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: armote
 * @DATE: 2019-02-28 17:41:58
 * @Description: 行业区域信息表控制器
 */
@Slf4j
@RestController
@RequestMapping("/tPwIndustryArea")
public class TPwIndustryAreaController {

        @Autowired
        private TPwIndustryAreaService tPwIndustryAreaService;

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 添加单条TPwIndustryAreaDO数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody TPwIndustryAreaDO tPwIndustryAreaDO){
            log.info("添加单条TPwIndustryAreaDO数据:"+tPwIndustryAreaDO);
            tPwIndustryAreaService.insertData(tPwIndustryAreaDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 修改单条TPwIndustryAreaDO数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody TPwIndustryAreaDO tPwIndustryAreaDO){
            log.info("修改单条TPwIndustryAreaDO数据:"+tPwIndustryAreaDO);
            tPwIndustryAreaService.updateData(tPwIndustryAreaDO);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID删除TPwIndustryAreaDO数据
         */
        @RequestMapping("/updateData/{areaId}")
        public void deleteById(@PathVariable("areaId")Integer areaId){
            log.info("根据ID删除TPwIndustryAreaDO数据:"+areaId);
            tPwIndustryAreaService.deleteById(areaId);
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 根据ID获取TPwIndustryAreaDO一条数据
         */
        @RequestMapping("/getById/{areaId}")
        public TPwIndustryAreaDO getById(@PathVariable("areaId")Integer areaId){
            log.info("根据ID获取TPwIndustryAreaDO一条数据:"+areaId);
            TPwIndustryAreaDO tPwIndustryArea = tPwIndustryAreaService.getById(areaId);
            return tPwIndustryArea;
        }

        /**
         * @Auther: armote
         * @DATE: 2019-02-28 17:41:58
         * @Description: 查询所有数据TPwIndustryAreaDO
         */
        @RequestMapping("/getAll")
        public List<TPwIndustryAreaDO> getAll(){
            log.info("获取TPwIndustryAreaDO所有条数据");
            List<TPwIndustryAreaDO> tPwIndustryAreaList = tPwIndustryAreaService.getAll();
            return tPwIndustryAreaList;
        }


}
