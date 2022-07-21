package com.groupi.PMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupi.PMS.model.TenantModel;

public interface TenantRepoInterface extends JpaRepository<TenantModel, Integer> 
{

}
