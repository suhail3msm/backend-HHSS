package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.patientMadicineTable;

@Repository
public interface patientMadicineRep extends JpaRepository<patientMadicineTable, Long> {

	@Query("FROM patientMadicineTable WHERE doctorEmail = ?1")
	List<patientMadicineTable> listUserDetailsBydoctorEmail(String doctorEmail);

	@Query("FROM patientMadicineTable WHERE hospitalName = ?1 and status = 'pending'")
	List<patientMadicineTable> listUserMedicineDetailsByHospitalName(String hospitalName);

	@Query("FROM patientMadicineTable WHERE hospitalName = ?1 and status = 'accept'")
	List<patientMadicineTable> listUserMedicineAcceptDetailsByHospitalName(String hospitalName);

	@Query("FROM patientMadicineTable WHERE patientNic = ?1 ORDER BY id DESC")
	List<patientMadicineTable> listUserDetailsBypatientNic(String nic);

	@Query("SELECT COUNT(*) as sum FROM patientMadicineTable WHERE status = 'pending' and hospitalName= ?1")
	String listpatientStaus(String hospitalName);

}
