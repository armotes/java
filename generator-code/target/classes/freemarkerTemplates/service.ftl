<#if  pack == "">
package com.pw.org.service;

import com.pw.common.pojo.dto.${projectName}.${class}DTO;
import com.pw.common.pojo.query.${projectName}.${class}Query;
<#else >
package com.pw.org.service.${pack};

import com.pw.common.pojo.dto.${projectName}.${class}DTO;
import com.pw.common.pojo.query.${projectName}.${class}Query;
</#if>

import java.util.List;
import org.springframework.data.domain.Page;
/**
 * This code is generated by FreeMarker
 * @author luokai
 *
 */
public interface I${class}Service{
    /**
     * 新增${tableDesc}
     */
     int insertData(${class}DTO ${class?uncap_first});
     /**
      * 删除${tableDesc}
      * @param <#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>
      * @return int
      */
     int deleteById(<#list properties as property><#if  property.isKey == 1>${property.javaType} ${property.propertyName}</#if></#list>);
     /**
      * 修改${tableDesc}
      * @param ${class?uncap_first}
      * @return int
      */
     int updateData(${class}DTO ${class?uncap_first});
    /**
      * 查询${tableDesc}列表
      * @param query
      * @return Page<${class}DTO>
      */
     Page<${class}DTO> getPageList(${class}Query query);
    /**
      * 查询${tableDesc}列表
      * @param query
      * @return List<${class}DTO>
      */
     List<${class}DTO> getList(${class}Query query);
    /**
      * 通过id查询${tableDesc}
      * @param <#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>
      * @return ${class}DTO
      */
     ${class}DTO getById(<#list properties as property><#if  property.isKey == 1>${property.javaType} ${property.propertyName}</#if></#list>);

}