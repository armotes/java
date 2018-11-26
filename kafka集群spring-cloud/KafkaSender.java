package com.xhh.config.kafka;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xhh.common.kafka.KafkaMessage;

@Component
@Slf4j
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    public void sendMessage(String msg){
    	log.info("第"+msg+"次调用");
    	Random r = new Random();
        //KafkaMessage message = new KafkaMessage(r.nextInt(),UUID.randomUUID().toString(),new Date());
        KafkaMessage message = new KafkaMessage(r.nextInt(),msg,new Date());
        log.info("========发送消息  "+msg+" >>>>{}<<<<<==========",gson.toJson(message));
        for(int i=0;i<=10000;i++){
        	kafkaTemplate.send("armote",gson.toJson(message));
        }
        
    }
}
