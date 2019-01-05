/**
 * @Author: zhouaqiang
 * @Date: 2019/1/4 0004 下午 3:09
 * @Desc:
 */
package com.xhh.elk;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: zhouaqiang
 * @Date: 2019/1/4 0004 下午 3:09
 * @Desc:
 */
@SpringBootApplication
@ComponentScan(basePackages="com.xhh")
@EnableDiscoveryClient  //服务发现客户端（消费端）
@EnableFeignClients(basePackages="com.xhh")		//Feign声明式调用接口
public class App {
    public static void main(String[] args) {
        new SpringApplicationBuilder(App.class).web(true).run(args);
    }
}
