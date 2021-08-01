package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/beanlifecycle/config.xml");
		Car s=(Car) context.getBean("c1");
		
		System.out.println(s);
		
		
		//registering shut down hook
		context.registerShutdownHook();  //this will first run destroy method
		
		First e=(First)context.getBean("e1");
		System.out.println(e);
		
	}

}
