package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "allergiesTable")
public class allergiesTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "allergiesType")
	private String allergiesType;

	@Column(name = "allergen")
	private String allergen;

	@Column(name = "reaction")
	private String reaction;

	@Column(name = "insertDate")
	private String insertDate;

	@Column(name = "patientNic")
	private String patientNic;

	@Column(name = "patientName")
	private String patientName;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "subervName")
	private String subervName;

	public allergiesTable() {
		super();
	}

	public allergiesTable(long id, String allergiesType, String allergen, String reaction, String insertDate,
			String patientNic, String patientName, String hospitalName, String subervName) {
		super();
		this.id = id;
		this.allergiesType = allergiesType;
		this.allergen = allergen;
		this.reaction = reaction;
		this.insertDate = insertDate;
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

	public String getAllergiesType() {
		return allergiesType;
	}

	public void setAllergiesType(String allergiesType) {
		this.allergiesType = allergiesType;
	}

	public String getAllergen() {
		return allergen;
	}

	public void setAllergen(String allergen) {
		this.allergen = allergen;
	}

	public String getReaction() {
		return reaction;
	}

	public void setReaction(String reaction) {
		this.reaction = reaction;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
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
