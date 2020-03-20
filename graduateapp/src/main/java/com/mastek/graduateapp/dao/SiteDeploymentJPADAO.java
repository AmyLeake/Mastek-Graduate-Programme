package com.mastek.graduateapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.graduateapp.entities.SiteDeployment;

@Repository
public interface SiteDeploymentJPADAO extends CrudRepository<SiteDeployment, Integer>{

}
