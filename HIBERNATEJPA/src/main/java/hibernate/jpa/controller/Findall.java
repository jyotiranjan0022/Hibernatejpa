package hibernate.jpa.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate.jpa.dto.User;

public class Findall {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter ur id gtre details ");
		String name =sc.nextLine();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		String qry="select u from User u where u.name=?1";
		Query q=em.createQuery(qry);
		q.setParameter(1, name);
		List<User> user=q.getResultList();
		for(User u:user)
		{
			System.out.println(u.getAge());
			System.out.println(u.getName());
			System.out.println(u.getName());
			System.out.println(u.getPhone());
		}
	
	}
}
