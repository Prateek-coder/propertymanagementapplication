package com.groupi.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tenant")
public class TenantModel 
{
	@Id
	@Column(name="TenantId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int TID;
	@Column(name="TenantName")
	private String TName;
	@Column(name="TenantCity")
	private String TCity;
	@Column(name="TenantAddress")
	private String TAddress;
	@Column(name="TenantContactNumer")
	private String TContactNumber;
	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	public String getTCity() {
		return TCity;
	}
	public void setTCity(String tCity) {
		TCity = tCity;
	}
	public String getTAddress() {
		return TAddress;
	}
	public void setTAddress(String tAddress) {
		TAddress = tAddress;
	}
	public String getTContactNumber() {
		return TContactNumber;
	}
	public void setTContactNumber(String tContactNumber) {
		TContactNumber = tContactNumber;
	}
	@Override
	public String toString() {
		return "TenantModel [TID=" + TID + ", TName=" + TName + ", TCity=" + TCity + ", TAddress=" + TAddress
				+ ", TContactNumber=" + TContactNumber + "]";
	}
	
	

}
