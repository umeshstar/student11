package com.BikkadIT.DI.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.DI.dao.StudentDao;
@Service
public class StudentService {
	
	
	public StudentDao StudentDao;
	@Autowired
	public void setStudentDao(StudentDao studentDao) {
		System.out.println("Student Service class");
		StudentDao = studentDao;
	}
	public void service() {
		System.out.println("Service class method  ");
		StudentDao.dao();
	} 

}
