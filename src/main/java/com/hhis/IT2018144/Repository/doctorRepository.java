package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.doctorTable;

@Repository
public interface doctorRepository extends JpaRepository<doctorTable, Long> {
	List<doctorTable> findByUsername(String username);

	@Query("FROM doctorTable WHERE email = ?1")
	doctorTable getByDoctorEmail(String email);

	@Query("FROM doctorTable WHERE joindDate BETWEEN ?1 AND ?2 ")
	List<doctorTable> getDoctorDateBetween(String fromDate, String toDate);
}
