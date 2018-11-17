package com.xhh.ro.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/netty")
public class NettyController {

	@ResponseBody
	@RequestMapping(value= "/getInfo/{id}",method = RequestMethod.GET)
	public String getInfo(@PathVariable("id") String id){
		Channel c = ChannelMap.getChannelByName(id);
		String resutl="";
		if(null !=c){
			ByteBuf content = Unpooled.copiedBuffer("Armote Thanks You", CharsetUtil.UTF_8);
			FullHttpResponse response =
	                new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, content);
			response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");  //内容类型
			c.writeAndFlush(response);
			resutl= "成功发送消息";
		}else{
			resutl= "当前设备已下线";
		}
		return resutl;
		
	}

}
