package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicineTable")
public class medicineTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "medicineName")
	private String medicineName;

	@Column(name = "medicineQnt")
	private String medicineQnt;

	@Column(name = "medicineTabs")
	private String medicineTabs;

	@Column(name = "hospitalName")
	private String hospitalName;

	@Column(name = "uploadDate")
	private String uploadDate;

	public medicineTable() {

	}

	public medicineTable(long id, String medicineName, String medicineQnt, String medicineTabs, String hospitalName,
			String uploadDate) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.medicineQnt = medicineQnt;
		this.medicineTabs = medicineTabs;
		this.hospitalName = hospitalName;
		this.uploadDate = uploadDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineQnt() {
		return medicineQnt;
	}

	public void setMedicineQnt(String medicineQnt) {
		this.medicineQnt = medicineQnt;
	}

	public String getMedicineTabs() {
		return medicineTabs;
	}

	public void setMedicineTabs(String medicineTabs) {
		this.medicineTabs = medicineTabs;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
