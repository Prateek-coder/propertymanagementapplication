package com.groupi.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Complaint")
public class ComplaintModel 
{
	@Id
	@Column(name="ComplaintId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CID;
	@Column(name="PropertyId")
	private int PID;
	@Column(name="PropertyName")
	private String PName;
	@Column(name="PropertyCity")
	private String PCity;
	@Column(name="Complaint")
	private String Complaint;
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
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
	public String getComplaint() {
		return Complaint;
	}
	public void setComplaint(String complaint) {
		Complaint = complaint;
	}
	
	@Override
	public String toString() {
		return "ComplaintModel [CID=" + CID + ", PID=" + PID + ", PName=" + PName + ", PCity=" + PCity + ", Complaint="
				+ Complaint + "]";
	}
	

}
