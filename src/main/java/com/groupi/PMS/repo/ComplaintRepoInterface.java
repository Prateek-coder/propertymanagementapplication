package com.groupi.PMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupi.PMS.model.ComplaintModel;

public interface ComplaintRepoInterface extends JpaRepository<ComplaintModel, Integer> 
{

}
