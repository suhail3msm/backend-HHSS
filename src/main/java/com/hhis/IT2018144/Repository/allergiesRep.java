package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.allergiesTable;

@Repository
public interface allergiesRep extends JpaRepository<allergiesTable, Long> {

	@Query("FROM allergiesTable WHERE patientNic = ?1 ORDER BY id")
	List<allergiesTable> listPatientAllergies(String nic);

}
