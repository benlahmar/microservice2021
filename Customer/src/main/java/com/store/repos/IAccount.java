package com.store.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.web.PageableDefault;

import com.store.entities.Account;

public interface IAccount extends JpaRepository<Account, Long>{
	
			Page<Account> findByLogLikeIgnoreCase(String log, Pageable p); 
			Account findByLogAndPass(String lg, String ps);
			List<Account> findByDateBetween(LocalDate dd, LocalDate df);
			Account findByProfileId(Long id);
			List<Account> findByProfileSexe(String s);
			
			List<Account> findRole(String r);
			
			@Query(value = "select c from Account c where c.pass=?1")
			List<Account> findklk(String pass);
			
			

}
