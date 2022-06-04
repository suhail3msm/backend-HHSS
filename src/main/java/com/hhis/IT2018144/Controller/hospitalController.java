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
import com.hhis.IT2018144.Model.hospitalTable;
import com.hhis.IT2018144.Model.patientWardTable;
import com.hhis.IT2018144.Model.wardSectionesTable;
import com.hhis.IT2018144.Model.wardTable;
import com.hhis.IT2018144.Repository.hospitalTableRepository;
import com.hhis.IT2018144.Repository.wardRepository;
import com.hhis.IT2018144.Repository.wardSectionesRepository;
import com.hhis.IT2018144.Service.Impl.hospitaleTableServiceImpl;
import com.hhis.IT2018144.Service.Impl.wardSectionwsServiceImpl;
import com.hhis.IT2018144.Service.Impl.wardServiceImpl;

@RestController
@CrossOrigin
public class hospitalController {

	@Autowired
	hospitaleTableServiceImpl hosTableService;

	@Autowired
	wardServiceImpl wardSrvice;

	@Autowired
	wardSectionwsServiceImpl wardSection;

	@Autowired
	hospitalTableRepository hospitalTableRep;

	@Autowired
	wardSectionesRepository wardSectionesRep;

	@Autowired
	wardRepository wardRepo;

	// Upload Hospital Details
	@PostMapping("/saveHospitalDetails")
	public APIExceptionResponse saveHospitalDetailse(@RequestBody hospitalTable hosTable) throws Exception {
		APIExceptionResponse hosObj = hosTableService.saveAllHospitalDetails(hosTable);
		return hosObj;
	}

	@PutMapping("/updateHospitalDetails")
	public hospitalTable updateHospitalDetailse(@RequestBody hospitalTable hosTable) throws Exception {
		return hospitalTableRep.save(hosTable);
	}

	// get Hospital Details by email id
	@GetMapping("/getHospitalByEmailId/{email}")
	public hospitalTable getHospitalByEmailIdDetails(@PathVariable("email") String email) {
		return hospitalTableRep.getHospitalByEmailId(email);
	}

	// get Hospital All records Details by email id
	@GetMapping("/getHospitalAll")
	public List<hospitalTable> getHospitalAllDetails() {
		return hospitalTableRep.getHospitalAlldetails();
	}

	// Upload ward details
	@PostMapping("/saveWardDetails")
	public APIExceptionResponse saveWardDetails(@RequestBody wardTable wrdTable) throws Exception {
		APIExceptionResponse wdTableObj = wardSrvice.saveAllWardDetails(wrdTable);
		return wdTableObj;
	}

	// Upload ward details
	@PutMapping("/updateWardDetails")
	public APIExceptionResponse updateWardDetails(@RequestBody wardTable wrdTable) throws Exception {
		APIExceptionResponse wdTableObj = wardSrvice.saveAllWardDetails(wrdTable);
		return wdTableObj;
	}

	// get ward details
	@GetMapping("/getWardDetails/{username}")
	public List<wardTable> getWardDetails(@PathVariable("username") String username) {
		List wardObj = wardSrvice.getAllWardsByHospitalName(username);
		return wardObj;
	}

	// delete ward
	@DeleteMapping("/deleteWardBy/{id}")
	public ResponseEntity<?> deleteWardBy(@PathVariable("id") Long id) {
		wardRepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	// upload ward section details
	@PostMapping("/saveWardSectionDeatils")
	public List<wardSectionesTable> saveWardSection(@RequestBody wardSectionesTable wrdSct) throws Exception {
		return wardSection.seveAllWardSectionDetails(wrdSct);
	}

	// upload ward section details 2
	@PostMapping("/saveWardSectionDeatils2")
	public wardSectionesTable saveWardSection2(@RequestBody wardSectionesTable wrdSct) throws Exception {
		return wardSectionesRep.save(wrdSct);
	}

	// get ward details
	@GetMapping("/getWardBy/{wardId}/{hospitalName}")
	public List<wardSectionesTable> getWardSectionesDetails(@PathVariable("wardId") long wardId,
			@PathVariable("hospitalName") String hospitalName) {
		List wardsecObj = wardSection.FindWardSectionesByWardId(wardId, hospitalName);
		return wardsecObj;
	}

	// get ward patient by hospital email id details
	@GetMapping("/getWardPatientByEmail/{email}")
	public List<wardSectionesTable> getWardSectionesDetailsByEmail(@PathVariable("email") String email) {
		List wardsecObj = wardSectionesRep.listByWardSectionesByWardEmail(email);
		return wardsecObj;
	}

	// update ward section details
	@PutMapping("/updateWardSection")
	public APIExceptionResponse updateSection(@RequestBody wardSectionesTable wrdSct) throws Exception {
		APIExceptionResponse wdTableObj = wardSection.updateAllWardSectionDetails(wrdSct);
		return wdTableObj;
	}

	// delete ward section By WardId
	@DeleteMapping("/deletewardSectionByWard/{id}")
	public ResponseEntity<String> deleteWardSectionByWardId(@PathVariable("id") long id) {

		return new ResponseEntity<String>(wardSectionesRep.deleteByWardId(id) + " record(s) deleted", HttpStatus.OK);

	}

	// delete ward section
	@DeleteMapping("/deletewardSection/{id}")
	public ResponseEntity<?> deleteWardSection(@PathVariable("id") Long id) {
		wardSection.DeleteWardSectiones(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	// insert ward section patient details
	@PostMapping("/insertwardsectionPatient")
	public APIExceptionResponse insertwardPatient(@RequestBody patientWardTable patientWard) throws Exception {
		APIExceptionResponse wdTableObj = wardSection.insertAllWardSectionPatient(patientWard);
		return wdTableObj;
	}

	// get ward patient details
	@GetMapping("/getWardPatientBy/{hospitalName}")
	public List<patientWardTable> getWardSectionesPatientDetails(@PathVariable("hospitalName") String hospitalName) {
		List wardsecObj = wardSection.listWardPatientByHospital(hospitalName);
		return wardsecObj;
	}

	// get all total hospital count
	@GetMapping("/totalHospital")
	public List<hospitalTable> getTotalHospital() {
		return hospitalTableRep.getHospitalAlldetails();

	}

}
