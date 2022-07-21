package com.groupi.PMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupi.PMS.model.OwnerModel;

public interface OwnerRepoInterface extends JpaRepository<OwnerModel, Integer> 
{

}
