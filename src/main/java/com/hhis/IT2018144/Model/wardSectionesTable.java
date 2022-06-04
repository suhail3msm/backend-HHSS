package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wardSectionesTable")
public class wardSectionesTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "section")
	private String section;

	@Column(name = "bedNumber")
	private Integer bedNumber;

	@Column(name = "status")
	private String status;

	@Column(name = "admittedDate")
	private String admittedDate;

	@Column(name = "wardId")
	private long wardId;

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "patientNIC")
	private String patientNIC;

	@Column(name = "hospitalId")
	private long hospitalId;

	@Column(name = "hospitalName")
	private String hospitalName;

	public wardSectionesTable() {
		super();
	}

	public wardSectionesTable(long id, String section, Integer bedNumber, String status, String admittedDate,
			long wardId, String patientName, String patientNIC, long hospitalId, String hospitalName) {
		super();
		this.id = id;
		this.section = section;
		this.bedNumber = bedNumber;
		this.status = status;
		this.admittedDate = admittedDate;
		this.wardId = wardId;
		this.patientName = patientName;
		this.patientNIC = patientNIC;
		this.hospitalId = hospitalId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAdmittedDate() {
		return admittedDate;
	}

	public void setAdmittedDate(String admittedDate) {
		this.admittedDate = admittedDate;
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

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
