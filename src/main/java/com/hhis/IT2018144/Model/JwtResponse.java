package com.hhis.IT2018144.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {

	private String jwtToken;
	private String username;
	private String role;
	private long id;
	private String hospitalName;

	public JwtResponse() {
		super();
	}

	public JwtResponse(String jwtToken, String username, String role, long id, String hospitalName) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
		this.role = role;
		this.id = id;
		this.hospitalName = hospitalName;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
