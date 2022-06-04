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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.PatientChart;
import com.hhis.IT2018144.Model.medicineTable;
import com.hhis.IT2018144.Model.meicine;
import com.hhis.IT2018144.Model.patientMadicineTable;
import com.hhis.IT2018144.Repository.patientMadicineRep;
import com.hhis.IT2018144.Service.Impl.medicineServiceImpl;

@RestController
@CrossOrigin
public class farmacyController {

	@Autowired
	medicineServiceImpl medicineImpl;

	@Autowired
	patientMadicineRep patientMdRep;

	// Upload medicine Details
	@PostMapping("/saveMedicineDetails")
	public APIExceptionResponse saveMedicineDetailse(@RequestBody medicineTable medicine) throws Exception {
		APIExceptionResponse wdTableObj = medicineImpl.saveAllMedicineDetails(medicine);
		return wdTableObj;
	}

	// get Medicine details
	@GetMapping("/getMedicineBy/{hospitalName}")
	public List<medicineTable> getMedicineDetails(@PathVariable("hospitalName") String hospitalName) {
		List wardsecObj = medicineImpl.getAllMedicineByHospitalName(hospitalName);
		return wardsecObj;
	}

	// delete Medicine
	@DeleteMapping("/deleteMedicine/{id}")
	public ResponseEntity<?> deleteMedicine(@PathVariable("id") Long id) {
		medicineImpl.DeleteWardSectiones(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	// update Medicine details
	@PutMapping("/updateMedicine")
	public APIExceptionResponse updateMedicine(@RequestBody medicineTable wrdSct) throws Exception {
		APIExceptionResponse wdTableObj = medicineImpl.updateMedicineDetails(wrdSct);
		return wdTableObj;
	}

	// save Medicine patient details
	@PostMapping("/savePatientMadicineTable")
	public patientMadicineTable savepatientMadicineTableDetails(@RequestBody patientMadicineTable st) throws Exception {
		patientMadicineTable patientMadicineObj = medicineImpl.saveAllpatientMadicineDetails(st);
		return patientMadicineObj;
	}

	// get Medicine patient details
	@GetMapping("/getMedicineDoctorBy/{doctorEmail}")
	public List<patientMadicineTable> getMedicinePatientDetails(@PathVariable("doctorEmail") String doctorEmail) {
		List wardsecObj = medicineImpl.getAllMedicineByDoctorEmail(doctorEmail);
		return wardsecObj;
	}

	// get Medicine patientmonthly count details
	@GetMapping("/getMedicineMonthlyCount/{doctorEmail}")
	public List<PatientChart> getpatientMonthlyCount(@PathVariable("doctorEmail") String doctorEmail) {
		List wardsecObj = medicineImpl.patientMonthlyCount(doctorEmail);
		return wardsecObj;
	}

	// get Medicine patient details
	@GetMapping("/getPendingStatus/{hospitalNm}")
	public String getPendingStutus(@PathVariable("hospitalNm") String hospitalNm) {
		return medicineImpl.countAllPendingStatus(hospitalNm);
	}

	// get getUserMedicineDetailsByHospitalName
	@GetMapping("/getUserMedicineDetailsByHospitalName/{hospitalNm}")
	public List<patientMadicineTable> getUserMedicineDetailsByHospitalName(
			@PathVariable("hospitalNm") String hospitalNm) {
		return patientMdRep.listUserMedicineDetailsByHospitalName(hospitalNm);
	}

	// get getUserMedicine Accept DetailsByHospitalName
	@GetMapping("/getUserMedicineAcceptDetailsByHospitalName/{hospitalNm}")
	public List<patientMadicineTable> getUserMedicineAcceptDetailsByHospitalName(
			@PathVariable("hospitalNm") String hospitalNm) {
		return patientMdRep.listUserMedicineAcceptDetailsByHospitalName(hospitalNm);
	}

	// delete Patient Medicine
	@DeleteMapping("/deletePatientMedicine/{id}")
	public ResponseEntity<?> deletePatientMedicine(@PathVariable("id") Long id) {
		patientMdRep.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// update ward section details
	@PostMapping("/uploadMedicine")
	public meicine uploadFile(@RequestBody meicine wrdSct) throws Exception {
		meicine wardsecObj = wrdSct;
		return wardsecObj;
	}

}
