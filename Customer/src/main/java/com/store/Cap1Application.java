package com.store;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.store.entities.Account;
import com.store.entities.Adresse;
import com.store.entities.Profile;
import com.store.repos.IAccount;
import com.store.repos.IProfile;

@SpringBootApplication

public class Cap1Application  implements CommandLineRunner{

	@Autowired
	IAccount accrepo;
	@Autowired
	IProfile prfrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Cap1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		 
		//accrepo.save(acc);
		Account cc = accrepo.findByLogAndPass("log", "pass");
		System.out.println(cc.toString());
		List<Account> as = accrepo.findRole("role");
		
		System.out.println(as.size());
	}
	
	

}
