package com.mastek.graduateapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.graduateapp.entities.EssentialTraining;

@Repository
public interface EssentialTrainingJPADAO extends CrudRepository<EssentialTraining, Integer> {

}
