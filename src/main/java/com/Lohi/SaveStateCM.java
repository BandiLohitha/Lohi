package com.Lohi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStateCM {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		State s=new State();
		s.setNo(1);
		s.setName("Andhara Pradesh");
		s.setCapital("Amaravathi");
		
		CM c=new CM();
		c.setName("Y.S Jagan Mohan Reddy");
		c.setAge(49);
		c.setQualification("B.Sc Agriculture");
		
		s.setCm(c);
		c.setS(s);
		
		et.begin();
		em.persist(c);
		em.persist(s);
		et.commit();
	}
}
