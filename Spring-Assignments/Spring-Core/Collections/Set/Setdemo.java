package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/set/configset.xml");
		QuestionSet quest=(QuestionSet) context.getBean("qset");
		System.out.println(quest);


	}

}
