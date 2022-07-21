package com.groupi.PMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupi.PMS.model.LeaseModel;

public interface LeaseRepoInterface extends JpaRepository<LeaseModel, Integer> 
{

}
