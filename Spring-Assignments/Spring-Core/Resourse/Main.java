package com.spring.core.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		 
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/core/springcore/resource-annotation.xml");
 
        Employee emp = ac.getBean("myemployee", Employee.class);
        System.out.println(emp.toString());
    }

}
