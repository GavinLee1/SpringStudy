package com.gavin.springStudy.bean;
import javax.annotation.*;

public class PostConstructExample {
	
	private String message;
	public PostConstructExample()
	{
		System.out.println("It is inside the constructor");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void say()
	{
		System.out.println("It is saying...."+this.message);
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("It is going to init");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("It is going to destroy");
	}
}
