package jpa.relations;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class IletisimBilgi implements Serializable {
	
	private String email;
	private String telno;
	private String website;
	private String linkedin;
	
	public IletisimBilgi() {
		// TODO Auto-generated constructor stub
	}
	
	public IletisimBilgi(String email, String telno, String website, String linkedin) {
		this.email = email;
		this.telno = telno;
		this.website = website;
		this.linkedin = linkedin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	
	
	
}
