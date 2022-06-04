package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.PatientChart;
import com.hhis.IT2018144.Model.patientMadicineTable;

@Repository
public interface chartPatientRep extends CrudRepository<patientMadicineTable, Long> {
	@Query("SELECT new com.hhis.IT2018144.Model.PatientChart(v.descrMonth, COUNT(v))"
			+ "FROM patientMadicineTable v WHERE doctorEmail = ?1 GROUP BY v.descrMonth ORDER BY v.descrMonth DESC")
	List<PatientChart> listPatientMonthlyCount(String doctorEmail);

	@Query("SELECT new com.hhis.IT2018144.Model.PatientChart(v.descrMonth, COUNT(v))"
			+ "FROM patientMadicineTable v WHERE v.patientNic = ?1 GROUP BY v.descrMonth ORDER BY v.descrMonth DESC")
	List<PatientChart> listSerchByNICPatientMonthlyCount(String nic);

	@Query("SELECT new com.hhis.IT2018144.Model.PatientChart(v.descrMonth, COUNT(v))"
			+ "FROM patientMadicineTable v WHERE v.hospitalName = ?1 GROUP BY v.descrMonth ORDER BY v.descrMonth DESC")
	List<PatientChart> listSerchByHospitalPatientMonthlyCount(String hospitalName);
}
