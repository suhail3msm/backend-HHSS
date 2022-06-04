package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bloodSuger")
public class bloodSuger {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "patientNic")
	private String patientNic;

	@Column(name = "nchackDate")
	private String nchackDate;

	@Column(name = "sugerLevel")
	private String sugerLevel;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "subervName")
	private String subervName;

	public bloodSuger() {
		super();
	}

	public bloodSuger(long id, String patientNic, String nchackDate, String sugerLevel, String hospitalName,
			String subervName) {
		super();
		this.id = id;
		this.patientNic = patientNic;
		this.nchackDate = nchackDate;
		this.sugerLevel = sugerLevel;
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

	public String getSugerLevel() {
		return sugerLevel;
	}

	public void setSugerLevel(String sugerLevel) {
		this.sugerLevel = sugerLevel;
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
