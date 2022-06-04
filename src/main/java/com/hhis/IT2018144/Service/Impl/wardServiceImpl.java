package com.hhis.IT2018144.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.wardTable;
import com.hhis.IT2018144.Repository.wardRepository;
import com.hhis.IT2018144.Service.wardService;

@Service
public class wardServiceImpl implements wardService {

	@Autowired
	wardRepository wardRep;

	@Override
	public APIExceptionResponse saveAllWardDetails(wardTable wardTable) {
		// TODO Auto-generated method stub
		APIExceptionResponse apiResponse = new APIExceptionResponse();
		try {
			apiResponse.setData(wardRep.save(wardTable));
			apiResponse.setStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			apiResponse.setError("Ward number and Ward name must be Unique...");
		}

		return apiResponse;
	}

	@Override
	public List<wardTable> getAllWardsByHospitalName(String username) {
		// TODO Auto-generated method stub
		return wardRep.findByHospitalName(username);
	}

	@Override
	public wardTable getById(long id) {
		return wardRep.findById(id);
	}

}
