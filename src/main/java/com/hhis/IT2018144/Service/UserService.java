package com.hhis.IT2018144.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hhis.IT2018144.Model.hhisLoginTable;
import com.hhis.IT2018144.Repository.hhisRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	hhisRepository logintableRep;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		hhisLoginTable user = logintableRep.findByUsername(userName);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + userName);
		} else {
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
					new ArrayList<>());
		}

	}
}
