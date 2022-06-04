package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adviceTable")
public class adviceTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "adviceDes")
	private String adviceDes;

	@Column(name = "injury")
	private String injury;

	@Column(name = "adviceDate")
	private String adviceDate;

	@Column(name = "patientNic")
	private String patientNic;

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "subervName")
	private String subervName;

	public adviceTable() {
		super();
	}

	public adviceTable(long id, String adviceDes, String injury, String adviceDate, String patientNic,
			String patientName, String hospitalName, String subervName) {
		super();
		this.id = id;
		this.adviceDes = adviceDes;
		this.injury = injury;
		this.adviceDate = adviceDate;
		this.patientNic = patientNic;
		this.patientName = patientName;
		this.hospitalName = hospitalName;
		this.subervName = subervName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdviceDes() {
		return adviceDes;
	}

	public void setAdviceDes(String adviceDes) {
		this.adviceDes = adviceDes;
	}

	public String getInjury() {
		return injury;
	}

	public void setInjury(String injury) {
		this.injury = injury;
	}

	public String gettAdviceDate() {
		return adviceDate;
	}

	public void setAdviceDate(String adviceDate) {
		this.adviceDate = adviceDate;
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

	public String getSubervName() {
		return subervName;
	}

	public void setSubervName(String subervName) {
		this.subervName = subervName;
	}

}
