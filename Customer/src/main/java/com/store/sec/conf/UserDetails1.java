package com.store.sec.conf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.store.entities.Account;

public class UserDetails1 extends Account  implements UserDetails{

	
	public UserDetails1(Account c) {
		super(c);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		GrantedAuthority g=new SimpleGrantedAuthority(this.getRole());
		List<GrantedAuthority> au=new ArrayList<GrantedAuthority>();
		au.add(g);
		return au;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.getPass();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.getLog();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
