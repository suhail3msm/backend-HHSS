package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.patientWardTable;

@Repository
public interface patientWardRepository extends JpaRepository<patientWardTable, Long> {

	@Query("FROM patientWardTable WHERE hospitalName = ?1")
	List<patientWardTable> listPatientWardDetailsByHospital(String hospitalName);

	@Query("FROM patientWardTable WHERE patientNIC = ?1 ORDER BY id DESC")
	List<patientWardTable> listPatientWardDetailsByNIC(String nic);

}
