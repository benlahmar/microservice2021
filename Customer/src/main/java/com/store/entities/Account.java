package com.store.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "")
public class Account {

	@Id
	@GeneratedValue
	Long id;
	
	String log,pass,role;
	
	@CreatedDate
	LocalDate date;
	
	@OneToOne(mappedBy = "account" )
	@PrimaryKeyJoinColumn
	Profile profile;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String log, String pass, String role, LocalDate date) {
		super();
		this.log = log;
		this.pass = pass;
		this.role = role;
		this.date = date;
	}
	public Account(String log, String pass, String role) {
		super();
		this.log = log;
		this.pass = pass;
		this.role = role;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", log=" + log + ", pass=" + pass + ", role=" + role + ", date=" + date + "]";
	}
	
	
	
}
