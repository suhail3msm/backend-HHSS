package com.hhis.IT2018144.Service;

import java.util.List;

import com.hhis.IT2018144.Exception.APIExceptionResponse;
import com.hhis.IT2018144.Model.wardTable;

public interface wardService {

	APIExceptionResponse saveAllWardDetails(wardTable wardTable);

	List<wardTable> getAllWardsByHospitalName(String hospitalNm);

	wardTable getById(long id);

}
