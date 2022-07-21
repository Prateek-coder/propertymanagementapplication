package com.groupi.PMS.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupi.PMS.model.ComplaintModel;
import com.groupi.PMS.repo.ComplaintRepoInterface;

@Service
public class ComplaintClass implements ComplaintService 
{
	@Autowired
	private ComplaintRepoInterface complaintrepoobj;

	@Override
	public List<ComplaintModel> getAllComplaint() 
	{
		return complaintrepoobj.findAll();
	}

	@Override
	public ComplaintModel getSingleComplaint(int Id) 
	{
		return complaintrepoobj.findById(Id).get();
	}

	@Override
	public ComplaintModel saveComplaint(ComplaintModel obj1) 
	{
		return complaintrepoobj.save(obj1);
	}

	@Override
	public ComplaintModel updateComplaint(ComplaintModel obj1) 
	{
		return complaintrepoobj.save(obj1);
	}

	@Override
	public void deleteComplaint(int id) 
	{
		complaintrepoobj.deleteById(id);

	}

}
