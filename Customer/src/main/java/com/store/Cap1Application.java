package com.store;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.store.entities.Account;
import com.store.entities.Adresse;
import com.store.entities.Profile;
import com.store.repos.IAccount;
import com.store.repos.IProfile;

@SpringBootApplication

public class Cap1Application  implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(Cap1Application.class, args);
	}
/*
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
	return new BCryptPasswordEncoder();
	}
	a62a2b47-b158-4716-828f-862547f1b54e
	*/
	
	@Override
	public void run(String... args) throws Exception {
		
		
//		 
//		//accrepo.save(acc);
//		Account cc = accrepo.findByLogAndPass("log", "pass");
//		System.out.println(cc.toString());
//		List<Account> as = accrepo.findRole("role");
//		
//		System.out.println(as.size());
	}
	
	

}
