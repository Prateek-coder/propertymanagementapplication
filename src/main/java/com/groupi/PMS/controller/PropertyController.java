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

import com.groupi.PMS.dao.PropertyService;
import com.groupi.PMS.model.PropertyModel;


@RestController
public class PropertyController 
{
	@Autowired
	private PropertyService propertyobj;
	
	@GetMapping("/property")
	public List<PropertyModel> getAllProperty()
	{
		return propertyobj.getAllProperty();
	}
	
	@GetMapping("/property/{Id}")
	public PropertyModel getSingleProperty(@PathVariable int Id)
	{
		return propertyobj.getSingleProperty(Id);
	}
	
	@PostMapping("/property")
	public PropertyModel saveProperty(@RequestBody PropertyModel obj)
	{
		return propertyobj.saveProperty(obj);
	}
	
	@PutMapping("/property/{Id}")
	public PropertyModel updateProperty(@RequestBody PropertyModel obj, @PathVariable int Id)
	{
		obj.setPID(Id);
		return propertyobj.updateProperty(obj);
	}
	
	@DeleteMapping("/property")
	public void deleteProperty(@RequestParam int Id)
	{
		propertyobj.deleteProperty(Id);
	}

}
