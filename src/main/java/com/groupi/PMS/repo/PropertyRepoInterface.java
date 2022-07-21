package com.groupi.PMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupi.PMS.model.PropertyModel;

public interface PropertyRepoInterface extends JpaRepository<PropertyModel,Integer> 
{

}
