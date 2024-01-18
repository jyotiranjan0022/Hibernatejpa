package hibernate.jpa.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate.jpa.dto.User;

public class Verify {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur name");
				String name=sc.nextLine();
				System.out.println("enter ur phone");
				long phone=sc.nextLong();
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
				EntityManager em=emf.createEntityManager();
				String qry="select u from User u where u.name=?1 and u.phone=?2";
				Query q=em.createQuery(qry);
				q.setParameter(1, name);
				q.setParameter(2, phone);
				try
				{
					User u=(User)q.getSingleResult();
					System.out.println(u.getAge());
					System.out.println(u.getId());
					System.out.println(u.getName());
					System.out.println(u.getPassword());
					System.out.println(u.getPhone());
				}
				catch(Exception e)
				{
					System.err.println("invalid");
				}
		
	}

}
