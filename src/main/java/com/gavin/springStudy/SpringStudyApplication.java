package com.gavin.springStudy;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.springStudy.JDBCTemplate.StudentJDBCTemplate;
import com.gavin.springStudy.aop.Student;
import com.gavin.springStudy.bean.AutowireExample;
import com.gavin.springStudy.bean.Hello;
import com.gavin.springStudy.bean.HelloConfig;
import com.gavin.springStudy.bean.JavaCollection;
import com.gavin.springStudy.bean.Message;
import com.gavin.springStudy.bean.MessageChild;
import com.gavin.springStudy.bean.MessageParent;
import com.gavin.springStudy.bean.PostConstructExample;
import com.gavin.springStudy.bean.SpellChecker;
import com.gavin.springStudy.bean.TextEditor;
import com.gavin.springStudy.listener.MessageConfig;
import com.gavin.springStudy.bean.TextEditorConfig;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringStudyApplication.class, args);
		
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
//		Message msg = (Message) context.getBean("message");
//		msg.getMessage();
//		context.registerShutdownHook();
//		
//		MessageChild mcd = (MessageChild)context.getBean("messageChild");
//		mcd.getMessage1();
//		mcd.getMessage2();
//		mcd.getMessage3();
//		
//		MessageParent mpt = (MessageParent)context.getBean("messageParent");
//		mpt.getMessage1();
//		mpt.getMessage2();
		
//		TextEditor te = (TextEditor) context.getBean("textEditor");
//		te.checkSpell();
		
//		JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
//		jc.getAddressList();
//		jc.getAddressSet();
//		jc.getAddressMap();
//		jc.getAddressProp();
		
//		AutowireExample autowire = (AutowireExample)context.getBean("autowireExample");
//		autowire.getAuto();
		
//		PostConstructExample postc = (PostConstructExample)context.getBean("postConstructExample");
//		postc.say();
//		context.registerShutdownHook();
		
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);
//		Hello helloWorld = ctx.getBean(Hello.class);
//		helloWorld.getMessage();
		
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
//		SpellChecker spellChecker = ctx.getBean(SpellChecker.class);
//		spellChecker.checkSpelling();
		
//		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(MessageConfig.class);
//		Message msg = ctx.getBean(Message.class);
//		ctx.start();
//		msg.setMessage("Hello Again");
//		msg.getMessage();
//		ctx.stop();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		Student stu = (Student)context.getBean("student");
//		stu.getName();
//		stu.getAge();
//		stu.printThrowException();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansJDBC.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		System.out.println("------Records Creation--------");
		studentJDBCTemplate.create("Zara", 11);
		studentJDBCTemplate.create("Nuha", 2);
		studentJDBCTemplate.create("Ayan", 15);
		System.out.println("------Listing Multiple Records--------");
		
		List<Student> students = studentJDBCTemplate.listStudents();
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(" , Name : " + record.getName());
			System.out.println(" , Age : " + record.getAge());
		}
		
		System.out.println("----Updating Record with ID = 2 -----");
		studentJDBCTemplate.update(2, 20);
		System.out.println("----Listing Record with ID = 2 -----");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print(" , Name : " + student.getName());
		System.out.println(" , Age : " + student.getAge());
	}
}
