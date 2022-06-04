package com.hhis.IT2018144.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Model.doctorTable;
import com.hhis.IT2018144.Repository.doctorRepository;
import com.hhis.IT2018144.Service.doctorService;

@Service
public class doctorServiceImpl implements doctorService {

	@Autowired
	doctorRepository doctorRep;

	@Override
	public doctorTable seveAllDoctorDetails(doctorTable dt) {
		// TODO Auto-generated method stub
		return doctorRep.save(dt);
	}

	@Override
	public List<doctorTable> fetchByUsername(String username) {
		// TODO Auto-generated method stub
		return doctorRep.findByUsername(username);
	}

	@Override
	public void DeleteDoctor(Long id) {
		// TODO Auto-generated method stub
		doctorRep.deleteById(id);
	}

	@Override
	public doctorTable UpdateServiceDoctor(doctorTable tableDoctor) {
		// TODO Auto-generated method stub
		return doctorRep.save(tableDoctor);
	}

}
