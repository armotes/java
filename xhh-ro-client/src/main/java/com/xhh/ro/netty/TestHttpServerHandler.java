package com.xhh.ro.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;
 
/**
 * 
 * @comment:自定义处理器
 * @author:zhouaqiang
 * @DT:2018年11月17日上午10:20:40
 */
public class TestHttpServerHandler extends SimpleChannelInboundHandler<HttpObject> {
 
	private static String wyid = "";
	
	
	
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
    	//System.out.println(ctx.toString());
    	
    	
    	System.out.println("ctx.name()"+ctx.name());
    	System.out.println("ctx.channel()"+ctx.channel());
    	System.out.println("ctx.channel().remoteAddress()"+ctx.channel().remoteAddress().toString());
    	
    	String varTemp = ctx.channel().remoteAddress().toString();
    	String id = varTemp.substring(1, varTemp.indexOf(":"));
    	ChannelMap.addChannel(id+"", ctx.channel());
    	
        if(msg instanceof HttpRequest){
            //要返回的内容, Channel可以理解为连接，而连接中传输的信息要为ByteBuf
            ByteBuf content = Unpooled.copiedBuffer("Hello World", CharsetUtil.UTF_8);
 
            //构造响应
            FullHttpResponse response =
                    new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, content);
            
            //设置头信息的的MIME类型
            response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");  //内容类型
            //设置要返回的内容长度
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH, content.readableBytes()); //内容长度
            
           /* if(ri.indexOf("0.50")!=-1){
            	
        		Channel c = ChannelMap.getChannelByName(wyid);
        		ByteBuf content1 = Unpooled.copiedBuffer("Armote Thanks You", CharsetUtil.UTF_8);
        		FullHttpResponse response1 =
                        new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, content1);
        		response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");  //内容类型
        		c.writeAndFlush(response1);
        	}*/
            
            //将响应对象返回
            ctx.writeAndFlush(response);
            
            
        }
    }
 
    //通道注册成功
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("TestHttpServerHandler:通道注册成功...");
        super.channelRegistered(ctx);
    }
 
    /**
     * 自定义的Handler被添加,也就是在TestChannelnitializer的initChannel方法中，
     * pipeline.addLast("testHttpServerHandler", new TestHttpServerHandler());
     * 这行代码执行的时候，该方法被触发
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("TestHttpServerHandler:自定义的Handler被添加...");
        super.handlerAdded(ctx);
    }
 
    //通道处于活动状态，即可用状态
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("TestHttpServerHandler:通道处于活动状态，即可用状态...");
        super.channelActive(ctx);
    }
 
    //通道处于不活动状态
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("TestHttpServerHandler:通道处于不活动状态...");
        super.channelInactive(ctx);
    }
 
    //通道取消注册
    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("TestHttpServerHandler:通道取消注册...");
        
        String varTemp = ctx.channel().remoteAddress().toString();
    	String id = varTemp.substring(1, varTemp.indexOf(":"));
    	ChannelMap.removeChannelByName(id);
    	System.out.println("下线["+id+"]设备");
        super.channelUnregistered(ctx);
    }
}
