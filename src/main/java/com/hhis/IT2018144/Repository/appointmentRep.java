package com.hhis.IT2018144.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hhis.IT2018144.Model.appointmentTable;

@Repository
public interface appointmentRep extends JpaRepository<appointmentTable, Long> {

	@Query("FROM appointmentTable WHERE hospitalName = ?1")
	List<appointmentTable> listAppointmentDetailsByHospital(String hospitalName);

	@Query("FROM appointmentTable WHERE doctorEmail = ?1")
	List<appointmentTable> listAppointmentDetailsByDoctorEmail(String doctorEmail);

	@Query("FROM appointmentTable WHERE patientNic = ?1 ORDER BY id")
	List<appointmentTable> listAppointment(String nic);

}
