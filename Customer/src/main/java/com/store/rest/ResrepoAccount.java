package com.store.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.store.entities.Account;


@RepositoryRestResource(collectionResourceRel = "comptes", itemResourceRel = "compte")
public interface ResrepoAccount extends JpaRepository<Account, Long>{

		@RestResource(path ="abc", rel = "findByRole" )
		List<Account> findByRole(@Param(value = "role") String role);
		
		
		
	
}
