package com.hhis.IT2018144.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Model.staffTable;
import com.hhis.IT2018144.Repository.staffRepository;
import com.hhis.IT2018144.Service.staffService;

@Service
public class staffServiceImpl implements staffService {

	@Autowired
	staffRepository staffRep;

	@Override
	public staffTable seveAllStaffDetails(staffTable st) {
		return staffRep.save(st);
	}

	@Override
	public List<staffTable> fetchByUsername(String username) {
		// TODO Auto-generated method stub
		return staffRep.findByUsername(username);
	}

	@Override
	public void DeleteStaff(Long id) {
		// TODO Auto-generated method stub
		staffRep.deleteById(id);
	}

	@Override
	public Optional findStaffById(Long id) {
		// TODO Auto-generated method stub
		return staffRep.findById(id);
	}

	@Override
	public staffTable UpdateService(staffTable tableStaff) {
		return staffRep.save(tableStaff);
	}

}
