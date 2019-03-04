package com.pw.common.pojo.query.${projectName};

import lombok.Data;
import com.pw.common.pojo.query.BaseQuery;
<#--需引入BaseQuery-->
<#list properties as property>
    <#if property.javaType=="Date">
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
    </#if>
    <#if property.javaType=="BigDecimal">
import java.math.BigDecimal;
    </#if>
</#list>

/**
 * This code is generated by FreeMarker
 * @author luokai
 * ${tableDesc} 查询条件
 */
@Data
public class ${class}Query extends BaseQuery{
<#list properties as property>
    /**
     * ${property.comment}
     */
    <#if property.javaType=="Date">
    @JsonFormat(timezone = "GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    </#if>
    private ${property.javaType} ${property.propertyName};
</#list>

}