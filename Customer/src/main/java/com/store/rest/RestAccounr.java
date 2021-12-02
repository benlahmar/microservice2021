package com.store.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.entities.Account;
import com.store.repos.IAccount;

@RestController
public class RestAccounr {

	@Autowired
	IAccount accrepo;
	
	@PostMapping("/accounts")
	public Account addaccount(@RequestBody Account ac)
	{
		return  accrepo.save(ac);
	}
	
	@GetMapping("/accounts")
	public List<Account> accs()
	{
		return  accrepo.findAll();
	}
	
	@GetMapping("/accounts/{id}")
	public Account getbyid(@PathVariable long id)
	{
		Optional<Account> o = accrepo.findById(id);
		if(o.isPresent())
			return o.get();
		else
			return null;
	}
	
	
}
