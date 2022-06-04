package com.hhis.IT2018144.Service;

import java.util.List;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.patientWardTable;
import com.hhis.IT2018144.Model.wardSectionesTable;

public interface wardSectionesService {

	List<wardSectionesTable> seveAllWardSectionDetails(wardSectionesTable wardSectionesTable);

	List<wardSectionesTable> FindWardSectionesByWardId(long wordId, String hospitalName);

	APIExceptionResponse updateAllWardSectionDetails(wardSectionesTable wardSectionesTable);

	void DeleteWardSectiones(Long id);

	APIExceptionResponse insertAllWardSectionPatient(patientWardTable patientWardTable);

	List<patientWardTable> listWardPatientByHospital(String hospitalName);

}
