package com.groupi.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Property")
public class PropertyModel 
{
	@Id
	@Column(name="PropertyId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int PID;
	@Column(name="PropertyName")
	private String PName;
	@Column(name="PropertyCity")
	private String PCity;
	@Column(name="PropertyAddress")
	private String PAddress;
	@Column(name="PropertyType")
	private String PType;
	@Column(name="PropertyOwner")
	private int POwner;
	@Column(name="PropertyCost")
	private int PCost;
	@Column(name="PropertyDocuments")
	private String PDocuments;
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPCity() {
		return PCity;
	}
	public void setPCity(String pCity) {
		PCity = pCity;
	}
	public String getPAddress() {
		return PAddress;
	}
	public void setPAddress(String pAddress) {
		PAddress = pAddress;
	}
	public String getPType() {
		return PType;
	}
	public void setPType(String pType) {
		PType = pType;
	}
	public int getPOwner() {
		return POwner;
	}
	public void setPOwner(int pOwner) {
		POwner = pOwner;
	}
	public int getPCost() {
		return PCost;
	}
	public void setPCost(int pCost) {
		PCost = pCost;
	}
	public String getPDocuments() {
		return PDocuments;
	}
	public void setPDocuments(String pDocuments) {
		PDocuments = pDocuments;
	}
	@Override
	public String toString() {
		return "PropertyModel [PID=" + PID + ", PName=" + PName + ", PCity=" + PCity + ", PAddress=" + PAddress
				+ ", PType=" + PType + ", POwner=" + POwner + ", PCost=" + PCost + ", PDocuments=" + PDocuments + "]";
	}
	
	
	
	

}
