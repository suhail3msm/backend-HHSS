package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.wardTable;

@Repository
public interface wardRepository extends JpaRepository<wardTable, Long> {

	@Query("FROM wardTable WHERE hospitalName = ?1")
	List<wardTable> findByHospitalName(String hospitalNm);

	wardTable findById(long id);

}
