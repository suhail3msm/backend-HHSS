package com.hhis.IT2018144.Service;

import java.util.List;

import com.hhis.IT2018144.Model.doctorTable;

public interface doctorService {

	doctorTable seveAllDoctorDetails(doctorTable dt);

	List<doctorTable> fetchByUsername(String username);

	void DeleteDoctor(Long id);

	doctorTable UpdateServiceDoctor(doctorTable tableDoctor);
}
