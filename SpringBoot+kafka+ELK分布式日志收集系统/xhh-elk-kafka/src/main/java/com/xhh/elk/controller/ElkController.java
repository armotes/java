/**
 * @Author: zhouaqiang
 * @Date: 2019/1/4 0004 下午 5:26
 * @Desc:
 */
package com.xhh.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouaqiang
 * @Date: 2019/1/4 0004 下午 5:26
 * @Desc:
 */

@RestController
@Slf4j
public class ElkController {

    /**
     *
     * @comment:kafka普通消息试调接口
     * @author:zhouaqiang
     * @DT:2018年11月26日下午12:01:17
     */
    @RequestMapping(value = "/send/{msg}", method = RequestMethod.GET)
    public String send(@PathVariable("msg") String msg){
       log.info("接收到页面的参数信息:"+msg);
        return msg;
    }

}
