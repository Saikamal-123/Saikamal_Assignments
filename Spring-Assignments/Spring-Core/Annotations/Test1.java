package com.annotation.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/annotation/inject/config.xml");
		Employee1 emp=(Employee1) context.getBean("emp");
		System.out.println(emp);
	}

}
