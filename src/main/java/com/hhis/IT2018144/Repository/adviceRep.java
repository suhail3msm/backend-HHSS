package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.adviceTable;

@Repository
public interface adviceRep extends JpaRepository<adviceTable, Long> {

	@Query("FROM adviceTable WHERE patientNic = ?1 ORDER BY id")
	List<adviceTable> listPatientAdviceTable(String nic);

}
