package com.groupi.PMS.dao;

import java.util.List;

import com.groupi.PMS.model.ComplaintModel;

public interface ComplaintService 
{
	    List<ComplaintModel> getAllComplaint();
		
		ComplaintModel getSingleComplaint(int Id);
		
		ComplaintModel saveComplaint(ComplaintModel obj1);
		
		ComplaintModel updateComplaint(ComplaintModel obj1);
		
		void deleteComplaint(int id);

}
