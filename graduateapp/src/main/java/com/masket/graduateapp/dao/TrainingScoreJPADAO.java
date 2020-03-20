package com.masket.graduateapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.graduateapp.entities.TrainingScore;

@Repository
public interface TrainingScoreJPADAO extends CrudRepository<TrainingScore, Integer> {

}
