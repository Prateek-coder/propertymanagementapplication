package com.groupi.PMS.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupi.PMS.model.PropertyModel;
import com.groupi.PMS.repo.PropertyRepoInterface;

@Service
public class PropertyClass implements PropertyService 
{
	@Autowired
	private PropertyRepoInterface propertyrepoobj;

	@Override
	public List<PropertyModel> getAllProperty() 
	{
		return propertyrepoobj.findAll();
	}

	@Override
	public PropertyModel getSingleProperty(int Id) 
	{
		return propertyrepoobj.findById(Id).get();
	}

	@Override
	public PropertyModel saveProperty(PropertyModel obj1) 
	{
		return propertyrepoobj.save(obj1);
	}

	@Override
	public PropertyModel updateProperty(PropertyModel obj1) 
	{
		return propertyrepoobj.save(obj1);
	}

	@Override
	public void deleteProperty(int id) 
	{
		propertyrepoobj.deleteById(id);

	}

}
