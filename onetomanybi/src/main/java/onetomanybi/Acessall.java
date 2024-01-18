package onetomanybi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Acessall {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		User u=new User();
		u.setId(1);
		u.setDob(LocalDate.parse("1998-08-09"));
		u.setEmail("pinku@gmail.com");
		u.setName("Banty");
		u.setPassword("6776");
	Post p=new Post();
	p.setCaption("england");
	p.setLocation("america");
	p.setTimeupdate(LocalDate.now());
	Post p1=new Post();
	p1.setCaption("papa ki pari");
	p1.setLocation("america");
	//p1.setTimeupdate(LocalDateTime.parse("1998-02-02"));
	p1.setTimeupdate(LocalDate.now());
	u.setPost(new ArrayList<Post>(Arrays.asList(p,p1)));
//	em.persist(u);
//	et.begin();
//	et.commit();
//	System.out.println("update --------------------");
//	em.merge(u);
//	et.begin();
//	et.commit();
	System.out.println("fetch -------------------");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ur name");
	String name=sc.nextLine();
	String qry="select u from User u where u.name=?1";
	Query q=em.createQuery(qry);
	q.setParameter(1, name);
	List<User> user=q.getResultList();
	for(User b1:user)
	{
   System.out.println(u.getEmail());
   System.out.println(u.getPassword());
   System.out.println(u.getId());
  System.out.println(u.getName());
  System.out.println(u.getDob());
	
		
	

	}
	}

}
