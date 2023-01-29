package com.BikkadIT.DI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.DI.service.StudentService;
@Controller
public class StudentController {

	
	
	public StudentService StudentService;
	@Autowired
	public void setStudentService(StudentService studentService) {
		System.out.println("Studentcontroller class setter");
		
		StudentService = studentService;
	}

	public void controller() {
		System.out.println("Controller class method ");
		
		StudentService.service();
	}
}
