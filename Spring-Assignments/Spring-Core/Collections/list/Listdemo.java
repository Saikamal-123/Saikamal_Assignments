package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/collections/configcoll.xml");
		QuestionList quest=(QuestionList) context.getBean("qlist");
		System.out.println(quest);

	}

}
