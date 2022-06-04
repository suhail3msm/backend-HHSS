package com.hhis.IT2018144.Controller;

import java.util.List;
import java.util.Optional;

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

import com.hhis.IT2018144.Model.staffTable;
import com.hhis.IT2018144.Repository.staffRepository;
import com.hhis.IT2018144.Service.Impl.staffServiceImpl;

@RestController
@CrossOrigin
public class staffController {

	@Autowired
	staffServiceImpl staffService;

	@Autowired
	staffRepository staffRep;

	@PostMapping("/saveStaffDetails")
	public staffTable saveLoginDetails(@RequestBody staffTable st) throws Exception {
		staffTable staffTableObj = staffService.seveAllStaffDetails(st);
		return staffTableObj;
	}

	@GetMapping("/findStaffTableByEmail/{email}")
	public staffTable getstaffTablebyEmail(@PathVariable("email") String email) {
		return staffRep.getByStaffEmail(email);
	}

	@GetMapping("/findStaff/{username}")
	public List<staffTable> getInvoice(@PathVariable("username") String username) {
		List staffObj = staffService.fetchByUsername(username);
		return staffObj;
	}

	@GetMapping("/findStaffById/{id}")
	public Optional findStaffById(@PathVariable("id") Long id) {
		return staffService.findStaffById(id);

	}

	@DeleteMapping("/deleteStaff/{id}")
	public ResponseEntity<?> deleteStaff(@PathVariable("id") Long id) {
		staffService.DeleteStaff(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@PutMapping("/updateStaff")
	public staffTable UpdateInvoice(@RequestBody staffTable tableStaff) {
		return staffService.UpdateService(tableStaff);

	}

	@GetMapping("/findStaff/{fromDate}/{toDate}")
	public List<staffTable> ListStaffDateBtwn(@PathVariable("fromDate") String fromDate,
			@PathVariable("toDate") String toDate) {
		List staffObj = staffRep.getStaffDateBetween(fromDate, toDate);
		return staffObj;
	}
}
