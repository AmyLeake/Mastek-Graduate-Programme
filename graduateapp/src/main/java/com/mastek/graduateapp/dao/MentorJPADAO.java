package com.mastek.graduateapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.graduateapp.entities.Mentor;

@Repository
public interface MentorJPADAO extends CrudRepository<Mentor, Integer> {

}