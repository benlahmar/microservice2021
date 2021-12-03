package com.store.sec.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.store.entities.Account;
import com.store.repos.IAccount;

//@Service
public class UserServiceDetailsImp implements UserDetailsService{

	@Autowired
	IAccount repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account c = repo.findByLog(username);
		UserDetails ud=new UserDetails1(c);
		return ud;
	}

}
