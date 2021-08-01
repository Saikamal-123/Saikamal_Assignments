package com.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/map/configmap.xml");
		QuestionMap quest=(QuestionMap) context.getBean("qmap");
		System.out.println(quest);


	}

}
