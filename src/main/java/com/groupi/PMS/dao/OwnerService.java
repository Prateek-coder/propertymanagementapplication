package com.groupi.PMS.dao;

import java.util.List;

import com.groupi.PMS.model.OwnerModel;

public interface OwnerService 
{
	    List<OwnerModel> getAllOwner();
		
		OwnerModel getSingleOwner(int Id);
		
		OwnerModel saveOwner(OwnerModel obj1);
		
		OwnerModel updateOwner(OwnerModel obj1);
		
		void deleteOwner(int id);

}
