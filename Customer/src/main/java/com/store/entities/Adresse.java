package com.store.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	String rue,ville,pays,codep;

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodep() {
		return codep;
	}

	public void setCodep(String codep) {
		this.codep = codep;
	}

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse(String rue, String ville, String pays, String codep) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		this.codep = codep;
	}
	
	
}
