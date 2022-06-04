package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.bloodPressure;

@Repository
public interface bloodPressureRep extends JpaRepository<bloodPressure, Long> {

	@Query("FROM bloodPressure WHERE patientNic = ?1 ORDER BY id DESC")
	List<bloodPressure> listPatientbloodPressure(String nic);

}
