package com.mastek.graduateapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.graduateapp.entities.CareerPath;

@Repository
public interface CareerPathJPADAO extends CrudRepository<CareerPath, Integer>{

}
