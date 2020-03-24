package com.mastek.graduateapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.graduateapp.dao.EmployeeJPADAO;
import com.mastek.graduateapp.services.BusinessLogicService;

@SpringBootTest
public class BusinessLogicTests {
	
	@Autowired
	BusinessLogicService bServ;
	
	@Autowired
	EmployeeJPADAO empDAO;

	//@Test
	void hasEmployeePassedEssentialTraining() {
		int empId = 1; //should be present in db
		bServ.hasEmployeePassedEssentialTraining(empId);
	}
}
