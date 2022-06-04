package com.hhis.IT2018144.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.PatientChart;
import com.hhis.IT2018144.Model.medicineTable;
import com.hhis.IT2018144.Model.patientMadicineTable;
import com.hhis.IT2018144.Repository.chartPatientRep;
import com.hhis.IT2018144.Repository.medicineRep;
import com.hhis.IT2018144.Repository.patientMadicineRep;
import com.hhis.IT2018144.Service.medicineService;

@Service
public class medicineServiceImpl implements medicineService {

	@Autowired
	medicineRep medRep;

	@Autowired
	chartPatientRep ctPatientRep;

	@Autowired
	patientMadicineRep patientMadRep;

	@Override
	public APIExceptionResponse saveAllMedicineDetails(medicineTable medicineTable) {

		APIExceptionResponse apiResponse = new APIExceptionResponse();

		apiResponse.setData(medRep.save(medicineTable));
		apiResponse.setStatus(HttpStatus.OK.value());

		return apiResponse;
	}

	@Override
	public List<medicineTable> getAllMedicineByHospitalName(String hospitalNm) {
		// TODO Auto-generated method stub
		return medRep.listmedicineTableDetailsByHospital(hospitalNm);
	}

	@Override
	public patientMadicineTable saveAllpatientMadicineDetails(patientMadicineTable patientMadicineTable) {
		// TODO Auto-generated method stub
		return patientMadRep.save(patientMadicineTable);
	}

	@Override
	public void DeleteWardSectiones(Long id) {
		// TODO Auto-generated method stub
		medRep.deleteById(id);
	}

	@Override
	public APIExceptionResponse updateMedicineDetails(medicineTable wrdSct) {
		// TODO Auto-generated method stub
		APIExceptionResponse apiResponse = new APIExceptionResponse();
		try {
			apiResponse.setData(medRep.save(wrdSct));
			apiResponse.setStatus(HttpStatus.OK.value());
		} catch (Exception e) {
			apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
			apiResponse.setError("Medicine Name must be Unique...");
		}

		return apiResponse;
	}

	@Override
	public List<patientMadicineTable> getAllMedicineByDoctorEmail(String doctorEmail) {
		// TODO Auto-generated method stub
		return patientMadRep.listUserDetailsBydoctorEmail(doctorEmail);
	}

	@Override
	public String countAllPendingStatus(String hospitalNm) {
		// TODO Auto-generated method stub
		return patientMadRep.listpatientStaus(hospitalNm);
	}

	@Override
	public List<PatientChart> patientMonthlyCount(String hospitalNm) {
		// TODO Auto-generated method stub
		return ctPatientRep.listPatientMonthlyCount(hospitalNm);
	}

}
