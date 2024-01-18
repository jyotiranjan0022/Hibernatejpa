package composite;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Acessall {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		User u=new User();
		u.setAge(24);
		u.setName("pinku");
		Userid uid=new Userid();
		uid.setEmail("p@gamil.com");
		uid.setPhone(587699);
		u.setUserid(uid);
		manager.persist(u);
		transaction.begin();
		transaction.commit();
		
	}

}
