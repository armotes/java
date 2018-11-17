package com.xhh.ro.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.CharsetUtil;


/**
 * 
 * @comment:自定义处理器
 * @author:zhouaqiang
 * @DT:2018年11月17日上午10:20:40
 */
public class SimpleHandler extends SimpleChannelInboundHandler<TextWebSocketFrame>{

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg)throws Exception {
			ByteBuf in = (ByteBuf) msg.content();
	        String context = in.toString(CharsetUtil.UTF_8);
	        System.out.println("SimpleHandler:服务器收到的消息: " +context.toString());
	}
	
	 //通道注册成功
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("SimpleHandler:通道注册成功...");
        super.channelRegistered(ctx);
    }
 
    /**
     * 自定义的Handler被添加,也就是在TestChannelnitializer的initChannel方法中，
     * pipeline.addLast("testHttpServerHandler", new TestHttpServerHandler());
     * 这行代码执行的时候，该方法被触发
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("SimpleHandler:自定义的Handler被添加...");
        super.handlerAdded(ctx);
    }
 
    //通道处于活动状态，即可用状态
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("SimpleHandler:通道处于活动状态，即可用状态...");
        super.channelActive(ctx);
    }
 
    //通道处于不活动状态
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("SimpleHandler:通道处于不活动状态...");
        super.channelInactive(ctx);
    }
 
    //通道取消注册
    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("SimpleHandler:通道取消注册...");
        super.channelUnregistered(ctx);
    }
}
