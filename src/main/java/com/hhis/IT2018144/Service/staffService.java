package com.hhis.IT2018144.Service;

import java.util.List;
import java.util.Optional;

import com.hhis.IT2018144.Model.staffTable;

public interface staffService {

	staffTable seveAllStaffDetails(staffTable st);

	List<staffTable> fetchByUsername(String username);

	void DeleteStaff(Long id);

	Optional findStaffById(Long id);

	staffTable UpdateService(staffTable tableStaff);
}
