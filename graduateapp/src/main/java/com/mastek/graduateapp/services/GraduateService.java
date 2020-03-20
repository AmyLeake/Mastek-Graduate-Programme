package com.mastek.graduateapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.mastek.graduateapp.dao.EmployeeJPADAO;


@Component
public class GraduateService {
	
@Autowired
EmployeeJPADAO empDAO;

	public void exampleMethod() {
		System.out.println("Test Method");
		
	}

}
