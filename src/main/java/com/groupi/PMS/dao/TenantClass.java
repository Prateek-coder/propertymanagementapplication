package com.groupi.PMS.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupi.PMS.model.TenantModel;
import com.groupi.PMS.repo.TenantRepoInterface;

@Service
public class TenantClass implements TenantService 
{
	@Autowired
	private TenantRepoInterface tenantrepoobj;

	@Override
	public List<TenantModel> getAllTenant() 
	{
		return tenantrepoobj.findAll();
	}

	@Override
	public TenantModel getSingleTenant(int Id) 
	{
		return tenantrepoobj.findById(Id).get();
	}

	@Override
	public TenantModel saveTenant(TenantModel obj1) 
	{
		return tenantrepoobj.save(obj1);
	}

	@Override
	public TenantModel updateTenant(TenantModel obj1) 
	{
		return tenantrepoobj.save(obj1);
	}

	@Override
	public void deleteTenant(int id) 
	{
		tenantrepoobj.deleteById(id);

	}

}
