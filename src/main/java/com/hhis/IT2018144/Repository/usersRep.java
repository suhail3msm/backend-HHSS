package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.patientTable;

@Repository
public interface usersRep extends JpaRepository<patientTable, Long> {

	@Query("FROM patientTable WHERE NIC = ?1")
	patientTable listUserDetailsByNIC(String NIC);

	@Query("FROM patientTable")
	List<patientTable> TotalUsers();

}
