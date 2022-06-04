package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.medicineTable;

@Repository
public interface medicineRep extends JpaRepository<medicineTable, Long> {

	@Query("FROM medicineTable WHERE hospitalName = ?1")
	List<medicineTable> listmedicineTableDetailsByHospital(String hospitalName);
}
