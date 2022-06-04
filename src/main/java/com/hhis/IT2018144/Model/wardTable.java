package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wardTable")
public class wardTable {

	@Id
	@Column(name = "id", unique = true)
	private long id;

	@Column(name = "wardName", unique = true)
	private String wardName;

	@Column(name = "numberOfPatient")
	private long numberOfPatient;

	@Column(name = "numberOfDeath")
	private long numberOfDeath;

	@Column(name = "hospitalId")
	private long hospitalId;

	@Column(name = "hospitalName")
	private String hospitalName;

	public wardTable() {
		super();
	}

	public wardTable(long id, String wardName, long numberOfPatient, long numberOfDeath, long hospitalId,
			String hospitalName) {
		super();
		this.id = id;
		this.wardName = wardName;
		this.numberOfPatient = numberOfPatient;
		this.numberOfDeath = numberOfDeath;
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public long getNumberOfPatient() {
		return numberOfPatient;
	}

	public void setNumberOfPatient(long numberOfPatient) {
		this.numberOfPatient = numberOfPatient;
	}

	public long getNumberOfDeath() {
		return numberOfDeath;
	}

	public void setNumberOfDeath(long numberOfDeath) {
		this.numberOfDeath = numberOfDeath;
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String username) {
		this.hospitalName = username;
	}

}