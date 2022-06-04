package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.hospitalTable;

@Repository
public interface hospitalTableRepository extends JpaRepository<hospitalTable, Long> {

	@Query("FROM hospitalTable WHERE email = ?1")
	hospitalTable getHospitalByEmailId(String email);

	@Query("FROM hospitalTable")
	List<hospitalTable> getHospitalAlldetails();
}
