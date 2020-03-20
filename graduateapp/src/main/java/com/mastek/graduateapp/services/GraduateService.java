package com.mastek.graduateapp.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //marking the class as bean to be created
@Scope("singleton") //singleton:one object used across test cases, prototype: one object per request
public class GraduateService {
	

	public void exampleMethod() {
		System.out.println("Test Method");
		
	}

}
