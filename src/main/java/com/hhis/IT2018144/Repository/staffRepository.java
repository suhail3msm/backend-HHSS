package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.staffTable;

@Repository
public interface staffRepository extends JpaRepository<staffTable, Long> {
	List<staffTable> findByUsername(String username);

	@Query("FROM staffTable WHERE email = ?1")
	staffTable getByStaffEmail(String email);

	@Query("FROM staffTable WHERE joindDate BETWEEN ?1 AND ?2 ")
	List<staffTable> getStaffDateBetween(String fromDate, String toDate);

}
