package com.hhis.IT2018144.Model;

public class PatientChart {

	private String month;
	private Long TotalPatient;

	public PatientChart() {
		super();
	}

	public PatientChart(String month, Long totalPatient) {
		super();
		this.month = month;
		TotalPatient = totalPatient;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Long getTotalPatient() {
		return TotalPatient;
	}

	public void setTotalPatient(Long totalPatient) {
		TotalPatient = totalPatient;
	}

}
