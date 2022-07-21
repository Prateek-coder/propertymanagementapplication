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

import com.groupi.PMS.dao.OwnerService;
import com.groupi.PMS.model.OwnerModel;

@RestController
public class OwnerController 
{
	@Autowired
	private OwnerService ownerobj;
	
	@GetMapping("/owner")
	public List<OwnerModel> getAllOwner()
	{
		return ownerobj.getAllOwner();
	}
	
	@GetMapping("/owner/{Id}")
	public OwnerModel getSingleOwner(@PathVariable int Id)
	{
		return ownerobj.getSingleOwner(Id);
	}
	
	@PostMapping("/owner")
	public OwnerModel saveOwner(@RequestBody OwnerModel obj)
	{
		return ownerobj.saveOwner(obj);
	}
	
	@PutMapping("/owner/{Id}")
	public OwnerModel updateOwner(@RequestBody OwnerModel obj, @PathVariable int Id)
	{
		obj.setOID(Id);
		return ownerobj.updateOwner(obj);
	}
	
	@DeleteMapping("/owner")
	public void deleteOwner(@RequestParam int Id)
	{
		ownerobj.deleteOwner(Id);
	}

}
