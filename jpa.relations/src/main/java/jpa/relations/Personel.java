package jpa.relations;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
public class Personel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ad;
	private String soyad;
	//           "EV", Adres
	@ElementCollection
	@CollectionTable(name="pers_adres", joinColumns=@JoinColumn(name="pid"))
	@MapKeyColumn(name="adresturu")
	@MapKeyEnumerated(EnumType.STRING)
	private Map<AdresTuru,Adres> adresler = new HashMap<>();
//	@ElementCollection
//	@CollectionTable(name="pers_adres", joinColumns=@JoinColumn(name="pid"))
//	@AttributeOverrides({
//		@AttributeOverride(name="mah", column=@Column(name="mahalle", length=30, nullable=false)),
//		@AttributeOverride(name="cad", column=@Column(name="cadde", length=40, nullable=false))
//	})
//	private List<Adres> adresler = new ArrayList<>();

//	public List<Adres> getAdresler() {
//		return adresler;
//	}
//
//	public void setAdresler(List<Adres> adresler) {
//		
//	}


	public Personel() {
		
	}

	public Map<AdresTuru, Adres> getAdresler() {
		return adresler;
	}

	public void setAdresler(Map<AdresTuru, Adres> adresler) {
		this.adresler = adresler;
	}

	public Personel(String ad, String soyad) {
		
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
