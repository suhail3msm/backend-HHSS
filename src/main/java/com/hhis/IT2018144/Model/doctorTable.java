package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctorTable")
public class doctorTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "address")
	private String address;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "phoneNo")
	private String phoneNo;

	@Column(name = "NIC")
	private String NIC;

	@Column(name = "DOB")
	private String DOB;

	@Column(name = "joindDate")
	private String joindDate;

	@Column(name = "hospitalId")
	private long hospitalId;

	@Column(name = "jobExpiance")
	private long jobExpiance;

	@Column(name = "doctorSpecialty")
	private String doctorSpecialty;

	@Column(name = "username")
	private String username;

	public doctorTable() {
		super();
	}

	public doctorTable(long id, String name, String gender, String address, String email, String phoneNo, String nIC,
			String dOB, String joindDate, long hospitalId, long jobExpiance, String doctorSpecialty, String username) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;
		NIC = nIC;
		DOB = dOB;
		this.joindDate = joindDate;
		this.hospitalId = hospitalId;
		this.jobExpiance = jobExpiance;
		this.doctorSpecialty = doctorSpecialty;
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getJoindDate() {
		return joindDate;
	}

	public void setJoindDate(String joindDate) {
		this.joindDate = joindDate;
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public long getJobExpiance() {
		return jobExpiance;
	}

	public void setJobExpiance(long jobExpiance) {
		this.jobExpiance = jobExpiance;
	}

	public String getDoctorSpecialty() {
		return doctorSpecialty;
	}

	public void setDoctorSpecialty(String doctorSpecialty) {
		this.doctorSpecialty = doctorSpecialty;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
