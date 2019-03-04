<#if  pack == "">
package com.pw.org.controller;

import com.pw.common.pojo.dto.${projectName}.${class}DTO;
import com.pw.org.service.I${class}Service;
import com.pw.common.pojo.query.${projectName}.${class}Query;
<#else >
package com.pw.org.controller.${pack};

import com.pw.common.pojo.dto.${projectName}.TPwCompanyDTO;
import com.pw.org.service.${pack}.I${class}Service;
import com.pw.common.pojo.query.${projectName}.${class}Query;
</#if>

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import com.pw.common.pojo.dto.PageDTO;

/**
 * This code is generated by FreeMarker
 * @author luokai
 *
 */
@RestController
@RequestMapping("/${projectName}/${class?uncap_first}")
public class ${class}Controller {
	@Autowired
	private I${class}Service ${class?uncap_first}Service;

    @PostMapping("/getList")
    public  List<${class}DTO> getList(@RequestBody ${class}Query query){
        List<${class}DTO> list = ${class?uncap_first}Service.getList(query);
        return list;
    }

    @PostMapping("/getPageList")
    public PageDTO<${class}DTO> getPageList(@RequestBody ${class}Query query){
        Page<${class}DTO> pageData = ${class?uncap_first}Service.getPageList(query) ;
        return new PageDTO(pageData.getContent(),pageData.getTotalElements());
    }

    @PostMapping("/insertData")
    public void insertData(@RequestBody ${class}DTO ${class?uncap_first}){
                ${class?uncap_first}Service.insertData(${class?uncap_first});
    }

    @GetMapping("/deleteById/{<#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>}")
    public void deleteById( @PathVariable("<#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>")
                        <#list properties as property><#if  property.isKey == 1>${property.javaType} ${property.propertyName}</#if></#list> ){
            ${class?uncap_first}Service.deleteById(<#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>);
    }

    @GetMapping("/getById/{<#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>}")
    public ${class}DTO getById(@PathVariable("<#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>")
                        <#list properties as property><#if  property.isKey == 1>${property.javaType} ${property.propertyName}</#if></#list>
                    ){
        ${class}DTO  ${class?uncap_first} = ${class?uncap_first}Service.getById(<#list properties as property><#if  property.isKey == 1>${property.propertyName}</#if></#list>);
         return ${class?uncap_first};
    }

    @PostMapping("/updateData")
    public void updateData(@RequestBody ${class}DTO ${class?uncap_first}){
        ${class?uncap_first}Service.updateData(${class?uncap_first});
    }

}