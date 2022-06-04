package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patientWardTable")
public class patientWardTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "section")
	private String section;

	@Column(name = "bedNumber")
	private Integer bedNumber;

	@Column(name = "admittedDate")
	private String admittedDate;

	@Column(name = "leavedDate")
	private String leavedDate;

	@Column(name = "wardId")
	private long wardId;

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "patientNIC")
	private String patientNIC;

	@Column(name = "description")
	private String description;

	@Column(name = "hospitalName")
	private String hospitalName;

	public patientWardTable() {
		super();
	}

	public patientWardTable(long id, String section, Integer bedNumber, String admittedDate, String leavedDate,
			long wardId, String patientName, String patientNIC, String description, String hospitalName) {
		super();
		this.id = id;
		this.section = section;
		this.bedNumber = bedNumber;
		this.admittedDate = admittedDate;
		this.leavedDate = leavedDate;
		this.wardId = wardId;
		this.patientName = patientName;
		this.patientNIC = patientNIC;
		this.description = description;
		this.hospitalName = hospitalName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Integer getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(Integer bedNumber) {
		this.bedNumber = bedNumber;
	}

	public String getAdmittedDate() {
		return admittedDate;
	}

	public void setAdmittedDate(String admittedDate) {
		this.admittedDate = admittedDate;
	}

	public String getLeavedDate() {
		return leavedDate;
	}

	public void setLeavedDate(String leavedDate) {
		this.leavedDate = leavedDate;
	}

	public long getWardId() {
		return wardId;
	}

	public void setWardId(long wardId) {
		this.wardId = wardId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientNIC() {
		return patientNIC;
	}

	public void setPatientNIC(String patientNIC) {
		this.patientNIC = patientNIC;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
