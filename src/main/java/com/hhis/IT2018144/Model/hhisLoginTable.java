package com.hhis.IT2018144.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hhisLoginTable")
public class hhisLoginTable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "username", unique = true)
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	@Column(name = "hospitalName")
	private String hospitalName;

	public hhisLoginTable() {
		super();
	}

	public hhisLoginTable(long id, String username, String password, String role, String hospitalName) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.hospitalName = hospitalName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}