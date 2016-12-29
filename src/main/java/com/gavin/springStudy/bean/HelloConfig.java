package com.gavin.springStudy.bean;
import org.springframework.context.annotation.*;

@Configuration
public class HelloConfig {
	
	@Bean
	public Hello getHello()
	{
		return new Hello();
	}
}
