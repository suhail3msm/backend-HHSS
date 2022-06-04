package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospitalTable")
public class hospitalTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "hos_name")
	private String hos_name;

	@Column(name = "specialtyHospitals")
	private String specialtyHospitals;

	@Column(name = "address")
	private String address;

	@Column(name = "phoneNo")
	private String phoneNo;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "district")
	private String district;

	@Column(name = "city")
	private String city;

	@Column(name = "hospitalRagisterNo", unique = true)
	private String hospitalRagisterNo;

	public hospitalTable() {
		super();
	}

	public hospitalTable(long id, String hos_name, String specialtyHospitals, String address, String phoneNo,
			String email, String district, String city, String hospitalRagisterNo) {
		super();
		this.id = id;
		this.hos_name = hos_name;
		this.specialtyHospitals = specialtyHospitals;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.district = district;
		this.city = city;
		this.hospitalRagisterNo = hospitalRagisterNo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHos_name() {
		return hos_name;
	}

	public void setHos_name(String hos_name) {
		this.hos_name = hos_name;
	}

	public String getSpecialtyHospitals() {
		return specialtyHospitals;
	}

	public void setSpecialtyHospitals(String specialtyHospitals) {
		this.specialtyHospitals = specialtyHospitals;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHospitalRagisterNo() {
		return hospitalRagisterNo;
	}

	public void setHospitalRagisterNo(String hospitalRagisterNo) {
		this.hospitalRagisterNo = hospitalRagisterNo;
	}

}
