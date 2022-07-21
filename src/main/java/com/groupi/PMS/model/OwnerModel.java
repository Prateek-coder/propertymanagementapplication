package com.groupi.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Owner")
public class OwnerModel 
{
	@Id
	@Column(name="OwnerId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int OID;
	@Column(name="OwnerName")
	private String OName;
	@Column(name="OwnerAddress")
	private String OAddress;
	@Column(name="OwnerCity")
	private String OCity;
	@Column(name="OwnerContactNumber")
	private String OContactNumber;
	public int getOID() {
		return OID;
	}
	public void setOID(int oID) {
		OID = oID;
	}
	public String getOName() {
		return OName;
	}
	public void setOName(String oName) {
		OName = oName;
	}
	public String getOAddress() {
		return OAddress;
	}
	public void setOAddress(String oAddress) {
		OAddress = oAddress;
	}
	public String getOCity() {
		return OCity;
	}
	public void setOCity(String oCity) {
		OCity = oCity;
	}
	public String getOContactNumber() {
		return OContactNumber;
	}
	public void setOContactNumber(String oContactNumber) {
		OContactNumber = oContactNumber;
	}
	@Override
	public String toString() {
		return "OwnerModel [OID=" + OID + ", OName=" + OName + ", OAddress=" + OAddress + ", OCity=" + OCity
				+ ", OContactNumber=" + OContactNumber + "]";
	}
	
	
	

}
