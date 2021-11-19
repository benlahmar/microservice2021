package com.store.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;

@Entity
public class Profile {

	@Id
	@GeneratedValue
	@Column(name="id")
	Long id;
	String nom,email,tel,sexe;
	
	@ElementCollection
	@OrderColumn
	String[] prenoms;
	 
	@Embedded
	Adresse adresse;
	
	@OneToOne()
	@JoinTable(name = "acc_profile",
	joinColumns = {  @JoinColumn(name="id_p",referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name="id_acc",referencedColumnName = "id")}
)
	Account account;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String[] getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(String nom, String email, String tel, String sexe, String[] prenoms, Adresse adresse) {
		super();
		this.nom = nom;
		this.email = email;
		this.tel = tel;
		this.sexe = sexe;
		this.prenoms = prenoms;
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", nom=" + nom + ", email=" + email + ", tel=" + tel + ", sexe=" + sexe
				+ ", prenoms=" + Arrays.toString(prenoms) + ", adresse=" + adresse + ", account=" + account + "]";
	}
	
	
	
	
	
}

