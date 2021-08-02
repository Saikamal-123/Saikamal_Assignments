package com.jdbc.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
	/*@Bean
	CommandLineRunner runner(Databseconsole repository)
	{
		return args->{
			repository.save(new Employee(1002,"kamal","it","engineer"));
			repository.save(new Employee(1003,"purna","cse","engineer"));
		};
	}*/

}
