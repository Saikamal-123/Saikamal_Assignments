package com.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class First {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public First() {
		super();
		// TODO Auto-generated constructor stub
	}

	public First(String subject) {
		super();
		this.subject = subject;
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println("starting method..");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending method..");
	}
	

}
