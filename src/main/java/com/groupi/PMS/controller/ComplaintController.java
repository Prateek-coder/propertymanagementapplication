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

import com.groupi.PMS.dao.ComplaintService;
import com.groupi.PMS.model.ComplaintModel;

@RestController
public class ComplaintController 
{
	@Autowired
	private ComplaintService complaintobj;
	
	@GetMapping("/complaint")
	public List<ComplaintModel> getAllComplaint()
	{
		return complaintobj.getAllComplaint();
	}
	
	@GetMapping("/complaint/{Id}")
	public ComplaintModel getSingleComplaint(@PathVariable int Id)
	{
		return complaintobj.getSingleComplaint(Id);
	}
	
	@PostMapping("/complaint")
	public ComplaintModel saveComplaint(@RequestBody ComplaintModel obj)
	{
		return complaintobj.saveComplaint(obj);
	}
	
	@PutMapping("/complaint/{Id}")
	public ComplaintModel updateComplaint(@RequestBody ComplaintModel obj, @PathVariable int Id)
	{
		obj.setCID(Id);
		return complaintobj.updateComplaint(obj);
	}
	
	@DeleteMapping("/complaint")
	public void deleteComplaint(@RequestParam int Id)
	{
		complaintobj.deleteComplaint(Id);
	}

}
