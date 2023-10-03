package onetomanyormanytoone;

import java.util.List;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBusSeat {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		Bus b=new Bus();
//		b.setBid(101);
//		b.setNumber("AP 003321");
//		b.setType("A.C");
//		
//		Seat s1=new Seat();
//		s1.setSno(11);
//		s1.setColor("blue");
//		s1.setB(b);
//		
//		
//		Seat s2=new Seat();
//		s2.setSno(12);
//		s2.setColor("blueSky");
//		s2.setB(b);
//		
//		Seat s3=new Seat();
//		s3.setSno(13);
//		s3.setColor("green");
//		s3.setB(b);
//		
//		
//		List<Seat> seats=new ArrayList<Seat>();
//		seats.add(s1);
//		seats.add(s2);
//		seats.add(s2);
//		et.begin();
//		em.persist(b);
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
//		et.commit();
//		
//		
	}
}
