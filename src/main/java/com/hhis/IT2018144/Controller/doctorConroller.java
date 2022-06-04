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

import com.hhis.IT2018144.Model.doctorTable;
import com.hhis.IT2018144.Repository.doctorRepository;
import com.hhis.IT2018144.Service.Impl.doctorServiceImpl;

@RestController
@CrossOrigin
public class doctorConroller {

	@Autowired
	doctorServiceImpl doctorService;

	@Autowired
	doctorRepository doctorRep;

	@PostMapping("/saveDoctorDetails")
	public doctorTable saveLoginDetails(@RequestBody doctorTable st) throws Exception {
		doctorTable doctorTableObj = doctorService.seveAllDoctorDetails(st);
		return doctorTableObj;
	}

	@GetMapping("/findDoctor/{username}")
	public List<doctorTable> getInvoice(@PathVariable("username") String username) {
		List staffObj = doctorService.fetchByUsername(username);
		return staffObj;
	}

	@GetMapping("/findDoctorByEmail/{email}")
	public doctorTable getdoctorbyEmail(@PathVariable("email") String email) {
		return doctorRep.getByDoctorEmail(email);
	}

	@DeleteMapping("/deleteDoctor/{id}")
	public ResponseEntity<?> deleteDoctor(@PathVariable("id") Long id) {
		doctorService.DeleteDoctor(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@PutMapping("/updateDoctor")
	public doctorTable UpdateDoctor(@RequestBody doctorTable tableDoctor) {
		return doctorService.UpdateServiceDoctor(tableDoctor);

	}

	@GetMapping("/findDoctor/{fromDate}/{toDate}")
	public List<doctorTable> ListStaffDateBtwn(@PathVariable("fromDate") String fromDate,
			@PathVariable("toDate") String toDate) {
		List doctorObj = doctorRep.getDoctorDateBetween(fromDate, toDate);
		return doctorObj;
	}

}
