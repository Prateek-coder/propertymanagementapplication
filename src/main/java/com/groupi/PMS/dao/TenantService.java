package com.groupi.PMS.dao;

import java.util.List;

import com.groupi.PMS.model.TenantModel;


public interface TenantService 
{
    List<TenantModel> getAllTenant();
	
	TenantModel getSingleTenant(int Id);
	
	TenantModel saveTenant(TenantModel obj1);
	
	TenantModel updateTenant(TenantModel obj1);
	
	void deleteTenant(int id);

}
