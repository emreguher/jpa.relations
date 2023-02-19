package jpa.relations;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adres implements Serializable {
	
	private String mah;
	private String cad;
	private String sokak;
	private String ilce;
	private String il;
	
	public Adres() {
		// TODO Auto-generated constructor stub
	}

	public Adres(String mah, String cad, String sokak, String ilce, String il) {
		this.mah = mah;
		this.cad = cad;
		this.sokak = sokak;
		this.ilce = ilce;
		this.il = il;
	}

	public String getMah() {
		return mah;
	}

	public void setMah(String mah) {
		this.mah = mah;
	}

	public String getCad() {
		return cad;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}
	
	
	

}
