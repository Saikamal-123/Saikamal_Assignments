package com.thirdcore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringcoreApplication {

	public static void main(String[] args) {
   
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		BankAccountRepositoryImpl BankAccountRepositoryImpl = context.getBean("BankAccountRepositoryImpl",BankAccountRepositoryImpl.class);
	
		
		System.out.println(  BankAccountRepositoryImpl.getBalance(1));
		
		
		
		
		
	}

}