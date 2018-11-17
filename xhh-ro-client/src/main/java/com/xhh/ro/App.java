package com.xhh.ro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.xhh.ro.netty.NettyServer;

@SpringBootApplication
@ComponentScan(basePackages="com.xhh")
@EnableDiscoveryClient  //服务发现客户端（消费端）
@EnableFeignClients(basePackages="com.xhh")		//Feign声明式调用接口
public class App implements CommandLineRunner{

	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).web(true).run(args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		try {
			new NettyServer().run();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}