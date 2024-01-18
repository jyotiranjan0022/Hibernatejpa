package hibernate.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.jpa.dto.User;

public class Find {
	public static void main(String[] args) {
		User u=new User();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		u=em.find(User.class, 2);
		if(u!=null)
		{
			System.out.println(u.getName());
		}
	}

}
