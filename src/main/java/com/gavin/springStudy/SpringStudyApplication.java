package com.gavin.springStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.springStudy.bean.Message;
import com.gavin.springStudy.bean.MessageChild;
import com.gavin.springStudy.bean.MessageParent;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringStudyApplication.class, args);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Message msg = (Message) context.getBean("message");
		msg.getMessage();
		context.registerShutdownHook();
		
		MessageChild mcd = (MessageChild)context.getBean("messageChild");
		mcd.getMessage1();
		mcd.getMessage2();
		mcd.getMessage3();
		
		MessageParent mpt = (MessageParent)context.getBean("messageParent");
		mpt.getMessage1();
		mpt.getMessage2();
		
	}
}
