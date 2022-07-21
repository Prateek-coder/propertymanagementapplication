package com.groupi.PMS.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupi.PMS.model.OwnerModel;
import com.groupi.PMS.repo.OwnerRepoInterface;

@Service 
public class OwnerClass implements OwnerService 
{
	@Autowired
	private OwnerRepoInterface ownerrepoobj;

	@Override
	public List<OwnerModel> getAllOwner() 
	{
		return ownerrepoobj.findAll();
	}

	@Override
	public OwnerModel getSingleOwner(int Id) 
	{
		return ownerrepoobj.findById(Id).get();
	}

	@Override
	public OwnerModel saveOwner(OwnerModel obj1) 
	{
		return ownerrepoobj.save(obj1);
	}

	@Override
	public OwnerModel updateOwner(OwnerModel obj1) 
	{
		return ownerrepoobj.save(obj1);
	}

	@Override
	public void deleteOwner(int id) 
	{
		ownerrepoobj.deleteById(id);

	}

}
