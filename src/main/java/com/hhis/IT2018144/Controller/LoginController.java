package com.hhis.IT2018144.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hhis.IT2018144.Model.JwtRequest;
import com.hhis.IT2018144.Model.JwtResponse;
import com.hhis.IT2018144.Model.hhisLoginTable;
import com.hhis.IT2018144.Repository.hhisRepository;
import com.hhis.IT2018144.Service.UserService;
import com.hhis.IT2018144.Service.Impl.hhisLoginTableServiceImpl;
import com.hhis.IT2018144.utility.JWTUtility;

@RestController
@CrossOrigin
public class LoginController {

	@Autowired
	hhisLoginTableServiceImpl hhisService;

	@Autowired
	private JWTUtility jwtUtility;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	hhisRepository hhisRep;

	@Autowired
	private UserService userService;

	@PostMapping("/saveLoginDetails")
	public hhisLoginTable saveLoginDetails(@RequestBody hhisLoginTable hhisTable) throws Exception {
		hhisLoginTable hhisTableObj = hhisService.saveAllHHISLoginDetails(hhisTable);
		return hhisTableObj;
	}

	@PutMapping("/updateLoginDetails")
	public hhisLoginTable updateLoginDetails(@RequestBody hhisLoginTable hhisTable) throws Exception {
		hhisLoginTable hhisTableObj = hhisService.saveAllHHISLoginDetails(hhisTable);
		return hhisTableObj;
	}

	@DeleteMapping("/deleteAccount/{id}")
	public ResponseEntity<?> deleteAccount(@PathVariable("id") Long id) {
		hhisService.DeleteAccount(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@PostMapping("/authenticate")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {

		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}

		final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUsername());

		final String token = jwtUtility.generateToken(userDetails);
		String username = jwtRequest.getUsername();
		hhisLoginTable lgnTable = hhisService.fatchByusername(username);
		String role = lgnTable.getRole();
		long id = lgnTable.getId();
		String hospitalName = lgnTable.getHospitalName();

		return new JwtResponse(token, username, role, id, hospitalName);
	}

	// get Login details
	@GetMapping("/getAccountBy/{hospitalName}")
	public List<hhisLoginTable> getMedicineDetails(@PathVariable("hospitalName") String hospitalName) {
		List wardsecObj = hhisService.getLoginByHospitalName(hospitalName);
		return wardsecObj;
	}

	// get Login details by username
	@GetMapping("/getAccountByUsername/{username}")
	public hhisLoginTable getAccountByUsername(@PathVariable("username") String username) {
		return hhisRep.getByUsername(username);
	}

	@GetMapping("/welcom")
	public String welcome() {
		return "welcome to HHIS";
	}
}
