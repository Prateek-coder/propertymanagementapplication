package com.groupi.PMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lease")
public class LeaseModel 
{
	@Id
	@Column(name="LeaseId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int LID;
	@Column(name="PropertyOwner")
	private int POwner;
	@Column(name="PropertyCity")
	private String PCity;
	@Column(name="LeaseDuration")
	private int Lduration;
	@Column(name="LeaseAgreament")
	private String LAgreament;
	@Column(name="LeaseDocument")
	private String LDocument;
	public int getLID() {
		return LID;
	}
	public void setLID(int lID) {
		LID = lID;
	}
	public int getPOwner() {
		return POwner;
	}
	public void setPOwner(int pOwner) {
		POwner = pOwner;
	}
	public String getPCity() {
		return PCity;
	}
	public void setPCity(String pCity) {
		PCity = pCity;
	}
	public int getLduration() {
		return Lduration;
	}
	public void setLduration(int lduration) {
		Lduration = lduration;
	}
	public String getLAgreament() {
		return LAgreament;
	}
	public void setLAgreament(String lAgreament) {
		LAgreament = lAgreament;
	}
	public String getLDocument() {
		return LDocument;
	}
	public void setLDocument(String lDocument) {
		LDocument = lDocument;
	}
	
	
	@Override
	public String toString() {
		return "LeaseModel [LID=" + LID + ", POwner=" + POwner + ", PCity=" + PCity + ", Lduration=" + Lduration
				+ ", LAgreament=" + LAgreament + ", LDocument=" + LDocument + "]";
	}
	
	

}
