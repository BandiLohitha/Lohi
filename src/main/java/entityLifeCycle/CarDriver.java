package entityLifeCycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {

	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Lohi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Car c=new Car();
		
		c.setName("Lohi");
		
		et.begin();
		em.persist(c);
		em.detach(c);
		c.setName("chaithu");
		em.merge(c);
		et.commit();
		
		
		
		
	}
}
