package com.hhis.IT2018144.Service.Impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.patientWardTable;
import com.hhis.IT2018144.Model.wardSectionesTable;
import com.hhis.IT2018144.Repository.patientWardRepository;
import com.hhis.IT2018144.Repository.wardSectionesRepository;
import com.hhis.IT2018144.Service.wardSectionesService;

@Service
public class wardSectionwsServiceImpl implements wardSectionesService {

	@Autowired
	wardSectionesRepository wardSecRep;

	@Autowired
	patientWardRepository pawarep;

	@Override
	public List<wardSectionesTable> seveAllWardSectionDetails(wardSectionesTable wrdSct) {

		Integer numberOfbad = wrdSct.getBedNumber();
		wardSectionesTable secObj = new wardSectionesTable();
		List<wardSectionesTable> listEntity = null;
		for (int i = 1; i <= numberOfbad; i++) {
			long j = secObj.getId();
			secObj.setId(i + j);
			secObj.setBedNumber(i);
			secObj.setAdmittedDate(wrdSct.getAdmittedDate());
			secObj.setHospitalId(wrdSct.getHospitalId());
			secObj.setHospitalName(wrdSct.getHospitalName());
			secObj.setPatientName(wrdSct.getPatientName());
			secObj.setPatientNIC(wrdSct.getPatientNIC());
			secObj.setSection(wrdSct.getSection());
			secObj.setStatus(wrdSct.getStatus());
			secObj.setWardId(wrdSct.getWardId());
			listEntity = Arrays.asList(wardSecRep.save(secObj));
		}
		return listEntity;
	}

	@Override
	public List<wardSectionesTable> FindWardSectionesByWardId(long wordId, String hospitalName) {
		// TODO Auto-generated method stub
		return wardSecRep.FindByWardSectionesByWardId(wordId, hospitalName);
	}

	@Override
	public APIExceptionResponse updateAllWardSectionDetails(wardSectionesTable wardSectionesTable) {

		APIExceptionResponse apiResponse = new APIExceptionResponse();
		try {
			apiResponse.setData(wardSecRep.save(wardSectionesTable));
			apiResponse.setStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			apiResponse.setError(e);
		}

		return apiResponse;
	}

	@Override
	public void DeleteWardSectiones(Long id) {
		wardSecRep.deleteById(id);

	}

	@Override
	public APIExceptionResponse insertAllWardSectionPatient(patientWardTable patientWardTable) {

		APIExceptionResponse apiResponse = new APIExceptionResponse();
		try {
			apiResponse.setData(pawarep.save(patientWardTable));
			apiResponse.setStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			apiResponse.setError(e);
		}

		return apiResponse;
	}

	@Override
	public List<patientWardTable> listWardPatientByHospital(String hospitalName) {
		// TODO Auto-generated method stub
		return pawarep.listPatientWardDetailsByHospital(hospitalName);
	}

}
