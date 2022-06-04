package com.hhis.IT2018144.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.hospitalTable;
import com.hhis.IT2018144.Repository.hospitalTableRepository;
import com.hhis.IT2018144.Service.hospitalTableService;

@Service
public class hospitaleTableServiceImpl implements hospitalTableService {

	@Autowired
	hospitalTableRepository hospitalTableRep;

	@Override
	public APIExceptionResponse saveAllHospitalDetails(hospitalTable hospital) {

		APIExceptionResponse apiResponse = new APIExceptionResponse();

		try {
			apiResponse.setData(hospitalTableRep.save(hospital));
			apiResponse.setStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			apiResponse.setError("Already Used Email Id Or Hospital Registration Number Try New One...! ");
		}

		return apiResponse;
	}

}
