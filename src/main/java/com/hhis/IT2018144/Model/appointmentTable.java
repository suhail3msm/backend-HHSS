package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointmentTable")
public class appointmentTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "phoneNum")
	private String phoneNum;

	@Column(name = "injury")
	private String injury;

	@Column(name = "appointmentDate")
	private String appointmentDate;

	@Column(name = "appointmentTime")
	private String appointmentTime;

	@Column(name = "status")
	private String status;

	@Column(name = "patientNic")
	private String patientNic;

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "doctorName")
	private String doctorName;

	@Column(name = "doctorEmail")
	private String doctorEmail;

	public appointmentTable() {
		super();
	}

	public appointmentTable(long id, String phoneNum, String injury, String appointmentDate, String appointmentTime,
			String status, String patientNic, String patientName, String hospitalName, String doctorName,
			String doctorEmail) {
		super();
		this.id = id;
		this.phoneNum = phoneNum;
		this.injury = injury;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
		this.patientNic = patientNic;
		this.patientName = patientName;
		this.hospitalName = hospitalName;
		this.doctorName = doctorName;
		this.doctorEmail = doctorEmail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getInjury() {
		return injury;
	}

	public void setInjury(String injury) {
		this.injury = injury;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPatientNic() {
		return patientNic;
	}

	public void setPatientNic(String patientNic) {
		this.patientNic = patientNic;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

}
