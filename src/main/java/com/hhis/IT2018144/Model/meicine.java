package com.hhis.IT2018144.Model;

public class meicine {

	private long id;
	private String medicineName;
	private String medicineQnt;
	private String medicineTabs;
	private String hospitalName;

	public meicine() {

	}

	public meicine(long id, String medicineName, String medicineQnt, String medicineTabs, String hospitalName) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.medicineQnt = medicineQnt;
		this.medicineTabs = medicineTabs;
		this.hospitalName = hospitalName;
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

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
