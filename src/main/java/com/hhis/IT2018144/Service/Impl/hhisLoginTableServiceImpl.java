package com.hhis.IT2018144.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Model.hhisLoginTable;
import com.hhis.IT2018144.Repository.hhisRepository;
import com.hhis.IT2018144.Service.hhisLoginTableService;

@Service
public class hhisLoginTableServiceImpl implements hhisLoginTableService {

	@Autowired
	hhisRepository hhisRep;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public hhisLoginTable saveAllHHISLoginDetails(hhisLoginTable user) {
		hhisLoginTable newUser = new hhisLoginTable();
		newUser.setUsername(user.getUsername());
		newUser.setRole(user.getRole());
		newUser.setId(user.getId());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setHospitalName(user.getHospitalName());
		return hhisRep.save(newUser);
	}

	@Override
	public hhisLoginTable fatchByusername(String username) {
		hhisLoginTable user = hhisRep.findByUsername(username);
		return user;
	}

	@Override
	public List<hhisLoginTable> getLoginByHospitalName(String hospitalNm) {
		// TODO Auto-generated method stub
		return hhisRep.listLoginTableDetailsByHospital(hospitalNm);
	}

	@Override
	public void DeleteAccount(Long id) {
		// TODO Auto-generated method stub
		hhisRep.deleteById(id);
	}
}
