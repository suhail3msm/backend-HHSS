package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patientMadicineTable")
public class patientMadicineTable {

	@Id
	@GeneratedValue
	@Column(name = "token")
	private long token;

	@Column(name = "status")
	private String status;

	@Column(name = "disease")
	private String disease;

	@Column(name = "numberOfDay")
	private String numberOfDay;

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "patientNic")
	private String patientNic;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "medicineName")
	private String[] medicineName;

	@Column(name = "medicineDec")
	private String[] medicineDec;

	@Column(name = "age")
	private String age;

	@Column(name = "doctorEmail")
	private String doctorEmail;

	@Column(name = "descrDate")
	private String descrDate;

	@Column(name = "descrYear")
	private String descrYear;

	@Column(name = "descrMonth")
	private String descrMonth;

	@Column(name = "descrTime")
	private String descrTime;

	public patientMadicineTable() {

	}

	public patientMadicineTable(long token, String status, String numberOfDay, String patientName, String patientNic,
			String hospitalName, String[] medicineName, String[] medicineDec, String age, String doctorEmail,
			String descrDate, String descrYear, String descrMonth, String descrTime, String disease) {
		super();
		this.token = token;
		this.status = status;
		this.numberOfDay = numberOfDay;
		this.patientName = patientName;
		this.patientNic = patientNic;
		this.hospitalName = hospitalName;
		this.medicineName = medicineName;
		this.medicineDec = medicineDec;
		this.age = age;
		this.doctorEmail = doctorEmail;
		this.descrDate = descrDate;
		this.descrYear = descrYear;
		this.descrMonth = descrMonth;
		this.descrTime = descrTime;
		this.disease = disease;
	}

	public long getToken() {
		return token;
	}

	public void setToken(long token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(String numberOfDay) {
		this.numberOfDay = numberOfDay;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientNic() {
		return patientNic;
	}

	public void setPatientNic(String patientNic) {
		this.patientNic = patientNic;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String[] getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String[] medicineName) {
		this.medicineName = medicineName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public String[] getMedicineDec() {
		return medicineDec;
	}

	public void setMedicineDec(String[] medicineDec) {
		this.medicineDec = medicineDec;
	}

	public String getDescrDate() {
		return descrDate;
	}

	public void setDescrDate(String descrDate) {
		this.descrDate = descrDate;
	}

	public String getDescrYear() {
		return descrYear;
	}

	public void setDescrYear(String descrYear) {
		this.descrYear = descrYear;
	}

	public String getDescrMonth() {
		return descrMonth;
	}

	public void setDescrMonth(String descrMonth) {
		this.descrMonth = descrMonth;
	}

	public String getDescrTime() {
		return descrTime;
	}

	public void setDescrTime(String descrTime) {
		this.descrTime = descrTime;
	}

}
