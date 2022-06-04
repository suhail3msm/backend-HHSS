package com.hhis.IT2018144.Service;

import java.util.List;

import com.hhis.IT2018144.Model.hhisLoginTable;

public interface hhisLoginTableService {

	hhisLoginTable saveAllHHISLoginDetails(hhisLoginTable loginTable);

	hhisLoginTable fatchByusername(String username);

	List<hhisLoginTable> getLoginByHospitalName(String hospitalNm);

	void DeleteAccount(Long id);

}
