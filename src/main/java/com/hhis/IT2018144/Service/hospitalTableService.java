package com.hhis.IT2018144.Service;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.hospitalTable;

public interface hospitalTableService {

	APIExceptionResponse saveAllHospitalDetails(hospitalTable hospital);

}
