package cn.lcp.fcct.controller;

import cn.lcp.fcct.po.${poEntityDO};
import cn.lcp.fcct.service.${poEntity}Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: ${author}
 * @DATE: ${creatTime}
 * @Description: ${tableComment}控制器
 */
@Slf4j
@RestController
@RequestMapping("/${poEntityLower}")
public class ${poEntity}Controller {

        @Autowired
        private ${poEntity}Service ${poEntityLower}Service;

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 添加单条${poEntityDO}数据
         */
        @RequestMapping("/insertData")
        public void insertData(@RequestBody ${poEntityDO} ${poEntityLowerDO}){
            log.info("添加单条${poEntityDO}数据:"+${poEntityLowerDO});
            ${poEntityLower}Service.insertData(${poEntityLowerDO});
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 修改单条${poEntityDO}数据
         */
        @RequestMapping("/updateData")
        public void updateData(@RequestBody ${poEntityDO} ${poEntityLowerDO}){
            log.info("修改单条${poEntityDO}数据:"+${poEntityLowerDO});
            ${poEntityLower}Service.updateData(${poEntityLowerDO});
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 根据ID删除${poEntityDO}数据
         */
        @RequestMapping("/updateData/{${poIDName}}")
        public void deleteById(@PathVariable("${poIDName}")${poIDType} ${poIDName}){
            log.info("根据ID删除${poEntityDO}数据:"+${poIDName});
            ${poEntityLower}Service.deleteById(${poIDName});
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 根据ID获取${poEntityDO}一条数据
         */
        @RequestMapping("/getById/{${poIDName}}")
        public ${poEntityDO} getById(@PathVariable("${poIDName}")${poIDType} ${poIDName}){
            log.info("根据ID获取${poEntityDO}一条数据:"+${poIDName});
            ${poEntityDO} ${poEntityLower} = ${poEntityLower}Service.getById(${poIDName});
            return ${poEntityLower};
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 查询所有数据${poEntityDO}
         */
        @RequestMapping("/getAll")
        public List<${poEntityDO}> getAll(){
            log.info("获取${poEntityDO}所有条数据");
            List<${poEntityDO}> ${poEntityLower}List = ${poEntityLower}Service.getAll();
            return ${poEntityLower}List;
        }


}
