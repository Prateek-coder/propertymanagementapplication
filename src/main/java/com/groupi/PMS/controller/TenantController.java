package com.groupi.PMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.groupi.PMS.dao.TenantService;
import com.groupi.PMS.model.TenantModel;

@RestController
public class TenantController 
{
	@Autowired
	private TenantService tenantobj;
	
	@GetMapping("/tenant")
	public List<TenantModel> getAllTenant()
	{
		return tenantobj.getAllTenant();
	}
	
	@GetMapping("/tenant/{Id}")
	public TenantModel getSingleTenant(@PathVariable int Id)
	{
		return tenantobj.getSingleTenant(Id);
	}
	
	@PostMapping("/tenant")
	public TenantModel saveTenant(@RequestBody TenantModel obj)
	{
		return tenantobj.saveTenant(obj);
	}
	
	@PutMapping("/tenant/{Id}")
	public TenantModel updateTenant(@RequestBody TenantModel obj, @PathVariable int Id)
	{
		obj.setTID(Id);
		return tenantobj.updateTenant(obj);
	}
	
	@DeleteMapping("/tenant")
	public void deleteTenant(@RequestParam int Id)
	{
		tenantobj.deleteTenant(Id);
	}

}
