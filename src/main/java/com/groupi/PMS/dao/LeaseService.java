package com.groupi.PMS.dao;

import java.util.List;

import com.groupi.PMS.model.LeaseModel;

public interface LeaseService 
{
	    List<LeaseModel> getAllLease();
		
		LeaseModel getSingleLease(int Id);
		
		LeaseModel saveLease(LeaseModel obj1);
		
		LeaseModel updateLease(LeaseModel obj1);
		
		void deleteLease(int id);

}
