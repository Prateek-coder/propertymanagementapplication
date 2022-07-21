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

import com.groupi.PMS.dao.LeaseService;
import com.groupi.PMS.model.LeaseModel;

@RestController
public class LeaseController 
{
	@Autowired
	private LeaseService leaseobj;
	
	@GetMapping("/lease")
	public List<LeaseModel> getAllLease()
	{
		return leaseobj.getAllLease();
	}
	
	@GetMapping("/lease/{Id}")
	public LeaseModel getSingleLease(@PathVariable int Id)
	{
		return leaseobj.getSingleLease(Id);
	}
	
	@PostMapping("/lease")
	public LeaseModel saveLease(@RequestBody LeaseModel obj)
	{
		return leaseobj.saveLease(obj);
	}
	
	@PutMapping("/lease/{Id}")
	public LeaseModel updateLease(@RequestBody LeaseModel obj, @PathVariable int Id)
	{
		obj.setLID(Id);
		return leaseobj.updateLease(obj);
	}
	
	@DeleteMapping("/lease")
	public void deleteLease(@RequestParam int Id)
	{
		leaseobj.deleteLease(Id);
	}

}
