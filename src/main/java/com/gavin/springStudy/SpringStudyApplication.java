package com.gavin.springStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.springStudy.bean.Message;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringStudyApplication.class, args);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Message msg = (Message) context.getBean("message");
		msg.getMessage();
		context.registerShutdownHook();
	}
}
