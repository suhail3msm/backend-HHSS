package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.bloodSuger;

@Repository
public interface bloodSugerRep extends JpaRepository<bloodSuger, Long> {

	@Query("FROM bloodSuger WHERE patientNic = ?1 ORDER BY id DESC")
	List<bloodSuger> listPatientbloodSuger(String nic);

}
