package com.store.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entities.Account;

public interface IAccount extends JpaRepository<Account, Long>{

}
