package hibernate.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;

import hibernate.jpa.dto.User;

public class SaveUser {
	public static void main(String[] args) {
		User u=new User();
		u.setAge(24);
		u.setName("banty");
		u.setPassword("89767");
		u.setPhone(1234);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		em.persist(u);
		EntityTransaction et=em.getTransaction();
		et.begin();
		et.commit();
	}

}
