package com.hhis.IT2018144.Service;

import java.util.List;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.PatientChart;
import com.hhis.IT2018144.Model.medicineTable;
import com.hhis.IT2018144.Model.patientMadicineTable;

public interface medicineService {

	APIExceptionResponse saveAllMedicineDetails(medicineTable medicineTable);

	List<medicineTable> getAllMedicineByHospitalName(String hospitalNm);

	patientMadicineTable saveAllpatientMadicineDetails(patientMadicineTable patientMadicineTable);

	void DeleteWardSectiones(Long id);

	APIExceptionResponse updateMedicineDetails(medicineTable wrdSct);

	List<patientMadicineTable> getAllMedicineByDoctorEmail(String doctorEmail);

	List<PatientChart> patientMonthlyCount(String hospitalNm);

	String countAllPendingStatus(String hospitalNm);

}
