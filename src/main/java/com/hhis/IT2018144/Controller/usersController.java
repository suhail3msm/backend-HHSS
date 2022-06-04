package com.hhis.IT2018144.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.PatientChart;
import com.hhis.IT2018144.Model.adviceTable;
import com.hhis.IT2018144.Model.allergiesTable;
import com.hhis.IT2018144.Model.appointmentTable;
import com.hhis.IT2018144.Model.bloodPressure;
import com.hhis.IT2018144.Model.bloodSuger;
import com.hhis.IT2018144.Model.patientMadicineTable;
import com.hhis.IT2018144.Model.patientTable;
import com.hhis.IT2018144.Model.patientWardTable;
import com.hhis.IT2018144.Repository.adviceRep;
import com.hhis.IT2018144.Repository.allergiesRep;
import com.hhis.IT2018144.Repository.appointmentRep;
import com.hhis.IT2018144.Repository.bloodPressureRep;
import com.hhis.IT2018144.Repository.bloodSugerRep;
import com.hhis.IT2018144.Repository.chartPatientRep;
import com.hhis.IT2018144.Repository.patientMadicineRep;
import com.hhis.IT2018144.Repository.patientWardRepository;
import com.hhis.IT2018144.Repository.usersRep;
import com.hhis.IT2018144.Service.Impl.usersServicImpl;

@RestController
@CrossOrigin
public class usersController {

	@Autowired
	usersServicImpl userServicImpl;

	@Autowired
	bloodSugerRep bloodSuger;

	@Autowired
	bloodPressureRep bloodPressure;

	@Autowired
	patientMadicineRep patientMadicine;

	@Autowired
	patientWardRepository patientWard;

	@Autowired
	chartPatientRep chartPatient;

	@Autowired
	allergiesRep allergies;

	@Autowired
	adviceRep advice;

	@Autowired
	appointmentRep appointment;

	@Autowired
	usersRep userRep;

	// save appointment
	@PostMapping("/saveAppointment")
	public appointmentTable saveAppointmentDetails(@RequestBody appointmentTable appointmentTbl) throws Exception {
		return appointment.save(appointmentTbl);
	}

	// get appointment details
	@GetMapping("/getAppointment/{NIC}")
	public List<appointmentTable> getAppointmentDetails(@PathVariable("NIC") String nic) {
		return appointment.listAppointment(nic);
	}

	// get appointment By Hospital details
	@GetMapping("/getAppointmentByDoctor/{doctorEmail}")
	public List<appointmentTable> getAppointmentDetailsByDoctorEmail(@PathVariable("doctorEmail") String doctorEmail) {
		return appointment.listAppointmentDetailsByDoctorEmail(doctorEmail);
	}

	// get appointment By Hospital details
	@GetMapping("/getAppointmentByHospital/{hospitalName}")
	public List<appointmentTable> getAppointmentDetailsByHospital(@PathVariable("hospitalName") String hospitalName) {
		return appointment.listAppointmentDetailsByHospital(hospitalName);
	}

	@DeleteMapping("/deleteappointment/{id}")
	public ResponseEntity<?> deleteStaff(@PathVariable("id") Long id) {
		appointment.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	// save advice
	@PostMapping("/saveAdvice")
	public adviceTable saveAdviceDetails(@RequestBody adviceTable adviceTbl) throws Exception {
		return advice.save(adviceTbl);
	}

	// get advice details
	@GetMapping("/getAdvice/{NIC}")
	public List<adviceTable> getAdviceDetails(@PathVariable("NIC") String nic) {
		return advice.listPatientAdviceTable(nic);
	}

	// save allergies
	@PostMapping("/saveAllergies")
	public allergiesTable saveAllergiesDetails(@RequestBody allergiesTable allergiesTbl) throws Exception {
		return allergies.save(allergiesTbl);
	}

	// get Allergies details
	@GetMapping("/getAllergies/{NIC}")
	public List<allergiesTable> getAllergiesDetails(@PathVariable("NIC") String nic) {
		return allergies.listPatientAllergies(nic);
	}

	// Upload User details
	@PostMapping("/saveUserDetails")
	public APIExceptionResponse saveWardDetails(@RequestBody patientTable userTable) throws Exception {
		APIExceptionResponse userTableObj = userServicImpl.saveAllUsersDetails(userTable);
		return userTableObj;
	}

	// get user details
	@GetMapping("/getuserDetails/{NIC}")
	public patientTable getWardDetails(@PathVariable("NIC") String nic) {

		return userServicImpl.fetchByNIC(nic);
	}

	// save bloodSuger
	@PostMapping("/saveBloodSuger")
	public bloodSuger saveBloodSugerDetails(@RequestBody bloodSuger bloodSugerTable) throws Exception {
		return bloodSuger.save(bloodSugerTable);
	}

	// get bloodSuger details
	@GetMapping("/getBloodSuger/{NIC}")
	public List<bloodSuger> getbloodSugerDetails(@PathVariable("NIC") String nic) {
		return bloodSuger.listPatientbloodSuger(nic);
	}

	// save bloodSuger
	@PostMapping("/saveBloodPressure")
	public bloodPressure saveBloodPressureDetails(@RequestBody bloodPressure bloodPressureTable) throws Exception {
		return bloodPressure.save(bloodPressureTable);
	}

	// get bloodPressure details
	@GetMapping("/getBloodPressure/{NIC}")
	public List<bloodPressure> getbloodPressureDetails(@PathVariable("NIC") String nic) {
		return bloodPressure.listPatientbloodPressure(nic);
	}

	// get patientMadicine details
	@GetMapping("/getPatientMedicineByNic/{NIC}")
	public List<patientMadicineTable> getPatientMadicineDetails(@PathVariable("NIC") String nic) {
		return patientMadicine.listUserDetailsBypatientNic(nic);
	}

	// get Patient Ward Details By NIC details
	@GetMapping("/getPatientWardDetailsByNIC/{NIC}")
	public List<patientWardTable> getPatientWardDetailsByNIC(@PathVariable("NIC") String nic) {
		return patientWard.listPatientWardDetailsByNIC(nic);
	}

	// get Medicine patient monthly count details by patient nic
	@GetMapping("/getMedicineMonthlyCountByNic/{NIC}")
	public List<PatientChart> getpatientMonthlyCount(@PathVariable("NIC") String nic) {
		return chartPatient.listSerchByNICPatientMonthlyCount(nic);
	}

	// get all total user count
	@GetMapping("/totalUser")
	public List<patientTable> getTotalUser() {
		return userRep.TotalUsers();

	}

}
