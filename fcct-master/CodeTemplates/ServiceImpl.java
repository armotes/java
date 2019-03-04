package cn.lcp.fcct.service.Impl;

import cn.lcp.fcct.mapper.${poEntity}Mapper;
import cn.lcp.fcct.po.${poEntityDO};
import cn.lcp.fcct.service.${poEntity}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: ${author}
 * @DATE: ${creatTime}
 * @Description: ${tableComment}服务实现类
 */
@Slf4j
@Service
public class ${poEntity}ServiceImpl implements ${poEntity}Service {


        @Autowired
        private ${poEntity}Mapper ${poEntityLower}Mapper;

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 添加单条${poEntityDO}数据
         */
        @Override
        public void insertData(${poEntityDO} ${poEntityLowerDO}){
            log.info("添加单条${poEntityDO}数据:"+${poEntityLowerDO});
            ${poEntityLower}Mapper.insertData(${poEntityLowerDO});
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 修改单条${poEntityDO}数据
         */
        @Override
        public void updateData(${poEntityDO} ${poEntityLowerDO}){
            log.info("修改单条${poEntityDO}数据:"+${poEntityLowerDO});
            ${poEntityLower}Mapper.updateData(${poEntityLowerDO});
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 根据ID删除${poEntityDO}数据
         */
        @Override
        public void deleteById(${poIDType} ${poIDName}){
            log.info("根据ID删除${poEntityDO}数据:"+${poIDName});
            ${poEntityLower}Mapper.deleteById(${poIDName});
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 根据ID获取${poEntityDO}一条数据
         */
        @Override
        public ${poEntityDO} getById(${poIDType} ${poIDName}){
            log.info("根据ID获取${poEntityDO}一条数据:"+${poIDName});
            ${poEntityDO} ${poEntityLower} = ${poEntityLower}Mapper.getById(${poIDName});
            return ${poEntityLower};
        }

        /**
         * @Auther: ${author}
         * @DATE: ${creatTime}
         * @Description: 查询所有数据${poEntityDO}
         */
        @Override
        public List<${poEntityDO}> getAll(){
            log.info("获取${poEntityDO}所有条数据");
            List<${poEntityDO}> ${poEntityLower}List = ${poEntityLower}Mapper.getAll();
            return ${poEntityLower}List;
        }


}
