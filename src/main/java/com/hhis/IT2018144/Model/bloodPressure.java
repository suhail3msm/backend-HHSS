package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bloodPressure")
public class bloodPressure {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "patientNic")
	private String patientNic;

	@Column(name = "nchackDate")
	private String nchackDate;

	@Column(name = "PressureLevel")
	private String PressureLevel;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "subervName")
	private String subervName;

	public bloodPressure() {
		super();
	}

	public bloodPressure(long id, String patientNic, String nchackDate, String PressureLevel, String hospitalName,
			String subervName) {
		super();
		this.id = id;
		this.patientNic = patientNic;
		this.nchackDate = nchackDate;
		this.PressureLevel = PressureLevel;
		this.hospitalName = hospitalName;
		this.subervName = subervName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPatientNic() {
		return patientNic;
	}

	public void setPatientNic(String patientNic) {
		this.patientNic = patientNic;
	}

	public String getNchackDate() {
		return nchackDate;
	}

	public void setNchackDate(String nchackDate) {
		this.nchackDate = nchackDate;
	}

	public String getPressureLevel() {
		return PressureLevel;
	}

	public void setPressureLevel(String pressureLevel) {
		PressureLevel = pressureLevel;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getSubervName() {
		return subervName;
	}

	public void setSubervName(String subervName) {
		this.subervName = subervName;
	}

}
