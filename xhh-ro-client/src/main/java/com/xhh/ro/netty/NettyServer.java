package com.xhh.ro.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
 
/**
 * 
 * @comment:Netty的启动服务程序
 * @author:zhouaqiang
 * @DT:2018年11月17日上午10:17:54
 */
public class NettyServer {
	
	public void run() throws Exception {
    	
        /**
         * bossGroup, 父类的事件循环组只0是负责连接，获取到连接后交给 workergroup子的事件循环组，
         * 参数的获取，业务的处理等工作均是由workergroup这个子事件循环组来完成，一个事件循环组一样
         * 可以完成所有的工作，但是Netty推荐的方式是使用两个事件循环组。
         */
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);  //创建父事件循环组
        EventLoopGroup workerGroup = new NioEventLoopGroup(); //创建子类的事件循环组
 
        try{
            //创建启动服务器的对象
            ServerBootstrap serverBootstrap = new ServerBootstrap();
 
            /**
             * group方法接收两个参数， 第一个为父时间循环组，第二个参数为子事件循环组
             */
            serverBootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)  //bossGroup的通道，只是负责连接
                    .childHandler(new TestChannelnitializer()) //workerGroup的处理器，
                    //当服务器请求处理线程全满时，用于临时存放已完成三次握手的请求的队列的最大长度,初始化服务端可连接队列
            		.option(ChannelOption.SO_BACKLOG, 128)
            		//是否启用心跳保活机制
            		.childOption(ChannelOption.SO_KEEPALIVE, true);
            ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();  //绑定端口
            channelFuture.channel().closeFuture().sync();
 
        }finally{
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
