package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.hhisLoginTable;

@Repository
public interface hhisRepository extends JpaRepository<hhisLoginTable, Long> {

	hhisLoginTable findByUsername(String userName);

	@Query("FROM hhisLoginTable WHERE hospitalName = ?1")
	List<hhisLoginTable> listLoginTableDetailsByHospital(String hospitalName);

	@Query("FROM hhisLoginTable WHERE username = ?1")
	hhisLoginTable getByUsername(String username);

}
