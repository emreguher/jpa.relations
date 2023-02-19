package jpa.relations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Kullanici implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=30, nullable = false)
	private String ad;
	@Column(length=30, nullable = false)
	private String soyad;
	
	@ElementCollection
	@Column(unique=true)
	private List<String> telefonNolar = new ArrayList<>() ; // NullPointerException
	
	public List<String> getTelefonNolar() {
		return telefonNolar;
	}

	public void setTelefonNolar(List<String> telefonNolar) {
		this.telefonNolar = telefonNolar;
	}

	@Embedded
	private IletisimBilgi iletisim;
	
	public IletisimBilgi getIletisim() {
		return iletisim;
	}

	public void setIletisim(IletisimBilgi iletisim) {
		this.iletisim = iletisim;
	}

	public Kullanici() {
		// TODO Auto-generated constructor stub
	}

	public Kullanici(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	
}
