package hibernate.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.jpa.dto.User;

public class Update {
	public static void main(String[] args) {
		User u=new User();
		u.setId(4);
		u.setAge(24);
		u.setName("badadon");
		u.setPassword("89767");
		u.setPhone(1234);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		em.merge(u);
		EntityTransaction et=em.getTransaction();
		et.begin();
		et.commit();

}
}
