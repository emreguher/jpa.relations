package jpa.relations.test;

import java.util.*;
import javax.persistence.*;
import jpa.relations.*;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager manager = factory.createEntityManager();
		
		Kullanici kullanici = new Kullanici("Ali","Veli");
		IletisimBilgi iletisim = new IletisimBilgi("ali@gmail.com","0555 333 22 11", null,null);

		//kullanici.setTelefonNolar(new ArrayList<String>());

		kullanici.getTelefonNolar().add("0544 555 66 77");
		kullanici.getTelefonNolar().add("0312 123 66 77");
		
		kullanici.setIletisim(iletisim);
		
		
		Personel personel = new Personel("Fatma","Şen");
		
		personel.getAdresler().put(AdresTuru.EV,new Adres("XYZ mah","ABC caddesi",null,"Çankaya","Ankara"));
		personel.getAdresler().put(AdresTuru.IS,new Adres("123 mah","456 caddesi",null,"Polatlı","Ankara"));
		
		manager.getTransaction().begin();
	
		manager.persist(kullanici);
		
		manager.persist(personel);
		
		manager.getTransaction().commit();
		
	}

}
