package com.gavin.springStudy.listener;
import org.springframework.context.annotation.*;

import com.gavin.springStudy.bean.Message;

@Configuration
public class MessageConfig {
	
	@Bean
	public Message getMessage()
	{
		return new Message();
	}
	
	@Bean
	public MessageStartHandler getMessageStartHandler()
	{
		return new MessageStartHandler();
	}
	
	@Bean
	public MessageStopHandler getMessageStopHandler()
	{
		return new MessageStopHandler();
	}
}
