package com.store.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.entities.Account;
import com.store.entities.Profile;
import com.store.repos.IAccount;
import com.store.repos.IProfile;


@RestController
public class RestAccount {

	@Autowired
	IAccount accrepo;
	@Autowired
	IProfile profrepo;
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> addaccount(@RequestBody Account ac)
	{
		Account c = accrepo.save(ac);
		ResponseEntity<Account> e=new ResponseEntity<Account>(c, HttpStatus.CREATED);
		
		  
		  return e;
	}
	
	@GetMapping("/accounts")
	public List<Account> accs()
	{
		return  accrepo.findAll();
	}
	
	@GetMapping("/accounts/{id}")
	public ResponseEntity<Account> getbyid(@PathVariable long id)
	{
		Optional<Account> o = accrepo.findById(id);
		ResponseEntity<Account> e;
		if(o.isPresent())
		{
			e=new ResponseEntity<Account>(o.get(), HttpStatus.FOUND);
			return e;
		}
		else
			return e=new ResponseEntity(null, HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<Void> delete(@PathVariable long id)
	{
		accrepo.deleteById(id);
		ResponseEntity<Void> e=new ResponseEntity<>(HttpStatus.OK);
		return e;
	}
	
	
	@PostMapping("/accounts/signin")
	public ResponseEntity<Account> signin(@RequestParam(name = "lg") String lg,@RequestParam(name="ps") String ps)
	{
		Account c = accrepo.findByLogAndPass(lg, ps);
		ResponseEntity<Account> e=new ResponseEntity<Account>(c, HttpStatus.CREATED);
		
		  
		  return e;
	}
	
//	@GetMapping("/accounts/search")
//	public Page<Account> bylog(@RequestParam(name = "log") String log,@RequestParam(name="page") int page, @RequestParam(name="size")  int size)
//	{
//		Pageable p=PageRequest.of(page, size);
//		return accrepo.findByLog(log, p);
//	}
	
	@PostMapping("/accounts/{idacc}/profile")
	public Account addproile(Profile p, long idacc)
	{
		Account c = accrepo.findById(idacc).get();
		p.setAccount(c);
		profrepo.save(p);
		return c;
	}
	
	
}
