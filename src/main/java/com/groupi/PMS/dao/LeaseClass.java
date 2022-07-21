package com.groupi.PMS.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupi.PMS.model.LeaseModel;
import com.groupi.PMS.repo.LeaseRepoInterface;

@Service
public class LeaseClass implements LeaseService 
{
	@Autowired
	private LeaseRepoInterface leaserepoobj;

	@Override
	public List<LeaseModel> getAllLease() 
	{
		return leaserepoobj.findAll();
	}

	@Override
	public LeaseModel getSingleLease(int Id) 
	{
		return leaserepoobj.findById(Id).get();
	}

	@Override
	public LeaseModel saveLease(LeaseModel obj1) 
	{
		return leaserepoobj.save(obj1);
	}

	@Override
	public LeaseModel updateLease(LeaseModel obj1) 
	{
		return leaserepoobj.save(obj1);
	}

	@Override
	public void deleteLease(int id) 
	{
		leaserepoobj.deleteById(id);

	}

}
