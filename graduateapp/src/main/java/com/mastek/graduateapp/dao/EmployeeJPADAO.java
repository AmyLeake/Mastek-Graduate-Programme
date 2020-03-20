package com.mastek.graduateapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.graduateapp.entities.Employee;

@Repository
public interface EmployeeJPADAO extends CrudRepository<Employee, Integer> {

}
