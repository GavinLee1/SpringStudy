package com.gavin.springStudy.bean;
import org.springframework.beans.factory.annotation.Autowired;

public class AutowireExample {
	@Autowired
	private AutoExample auto;

	public AutowireExample(AutoExample autoExample)
	{
		this.auto = autoExample;
	}
	
	public void getAuto() {
		auto.sayHello();
	}

	public void setAuto(AutoExample auto) {
		this.auto = auto;
	}
	
	
}
