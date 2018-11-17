package com.xhh.ro.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;
 
/**
 * @comment:通道的初始化程序主要是为workerGroup添加各种Handler.
 * </br>
 * 初始化一个通道，主要用于设置各种Handler
 * @author:zhouaqiang
 * @DT:2018年11月17日上午10:19:44
 */
public class TestChannelnitializer extends ChannelInitializer<SocketChannel> {
 
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        /**
         * Handler就相当于Servlet中的过滤器, 请求和响应都会走Handler
         * HttpServerCodec: http的编解码器，用于Http请求和相应
         */
        pipeline.addLast("httpServerCodec", new HttpServerCodec());
        //pipeline.addLast("simpleHandler",new SimpleHandler());
        pipeline.addLast("testHttpServerHandler", new TestHttpServerHandler());
    }
}
