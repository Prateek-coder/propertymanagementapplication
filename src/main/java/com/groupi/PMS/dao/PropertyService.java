package com.groupi.PMS.dao;

import java.util.List;

import com.groupi.PMS.model.PropertyModel;


public interface PropertyService 
{
    List<PropertyModel> getAllProperty();
	
	PropertyModel getSingleProperty(int Id);
	
	PropertyModel saveProperty(PropertyModel obj1);
	
	PropertyModel updateProperty(PropertyModel obj1);
	
	void deleteProperty(int id);

}
