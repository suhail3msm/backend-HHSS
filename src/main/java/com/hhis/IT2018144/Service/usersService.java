package com.hhis.IT2018144.Service;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.patientTable;

public interface usersService {

	APIExceptionResponse saveAllUsersDetails(patientTable PatientTable);

	patientTable fetchByNIC(String nic);
}
