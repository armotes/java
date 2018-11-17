package com.xhh.ro.netty;

import io.netty.channel.Channel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 
 * @comment:持久化channel,服务器与客户端握手后,服务器即可主动与客户端发送消息
 * @author:zhouaqiang
 * @DT:2018年11月17日下午2:53:14
 */
public class ChannelMap {

	//初始化通道容器
	private static Map<String, Channel> map = null;
	
	//通道数量
	public static int channelNum=0;
	
	public static Map<String, Channel> getMap() {
		return map;
	}
 
	public static void setMap(Map<String, Channel> map) {
		ChannelMap.map = map;
	}
	
	/**
	 * 
	 * @comment:根据name获取Channel,如果没有返回null
	 * @author:zhouaqiang
	 * @DT:2018年11月17日下午3:01:33
	 */
	public static Channel getChannelByName(String name){
        if(map==null||map.isEmpty()){
            return null;
        }
        return map.get(name);
    }
	
	/**
	 * 
	 * @comment:添加一个通道进行持久化存储,同时更新当前通道数量
	 * @author:zhouaqiang
	 * @DT:2018年11月17日下午2:59:22
	 */
    public static void addChannel(String name,Channel channel){
        if(map==null){
        	map=new ConcurrentHashMap<>();
        }
        map.put(name,channel);
        channelNum++;
    }
    
    /**
     * 
     * @comment:根据name删除Channel:0代表正常删除key 1没有这个key
     * @author:zhouaqiang
     * @DT:2018年11月17日下午3:00:22
     */
    public static int removeChannelByName(String name){
        if(map.containsKey(name)){
        	map.remove(name);
            return 0;
        }else{
            return 1;
        }
    }

}
