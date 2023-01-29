package com.BikkadIT.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.DI.controller.StudentController;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DiApplication.class, args);
		 StudentController studentController = run.getBean(StudentController.class);
		
		 studentController.controller();
		
	}

}
