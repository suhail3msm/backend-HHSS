package com.hhis.IT2018144.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.patientTable;
import com.hhis.IT2018144.Repository.usersRep;
import com.hhis.IT2018144.Service.usersService;

@Service
public class usersServicImpl implements usersService {

	@Autowired
	usersRep userRep;

	@Override
	public APIExceptionResponse saveAllUsersDetails(patientTable patientTable) {
		APIExceptionResponse apiResponse = new APIExceptionResponse();
		try {
			apiResponse.setData(userRep.save(patientTable));
			apiResponse.setStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			apiResponse.setError("user email id or nic alredy exist..!");
		}

		return apiResponse;
	}

	@Override
	public patientTable fetchByNIC(String nic) {
		// TODO Auto-generated method stub
		return userRep.listUserDetailsByNIC(nic);
	}

}
