package com.store;

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
		
		Account acc= new Account("log", "pass", "role");
		 
		//accrepo.save(acc);
		
		String[] prenoms= {"aa","bb"};
		Adresse adresse=new Adresse("rue", "ville", "pays", "codep");
		Profile p=new Profile("nom", "email", "tel", "sexe", prenoms, adresse);
		
		//prfrepo.save(p);
		//System.out.println(p1.getAccount());
		Account c = accrepo.findById(1L).get();
		Profile p1 = prfrepo.findById(2L).get();
		
		p1.setAccount(c);
		
		//prfrepo.save(p1);
		System.out.println(c.toString());
		System.out.println(p1.toString());
		
	}
	
	

}
