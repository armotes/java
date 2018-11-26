package com.xhh.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xhh.config.kafka.KafkaSender;

//import com.xhh.config.kafka.KafkaSender;

@RestController
@RefreshScope
public class ConfigController {
	
	@Autowired
	private KafkaSender kafkaSender;
	
	@Value("${armote.name}")
    private String name;

    @RequestMapping("/info")
    public String info(){
        return this.name;
    }
    
    
    @RequestMapping(value = "/send/{msg}", method = RequestMethod.GET)
    public String send(@PathVariable("msg") String msg){
    	kafkaSender.sendMessage(msg);
    	return msg;
    }
}
