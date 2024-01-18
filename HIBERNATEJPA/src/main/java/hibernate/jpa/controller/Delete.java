package hibernate.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.jpa.dto.User;

public class Delete {
	public static void main(String[] args) {
		User u=new User();
//		u.setAge(24);
//		u.setName("don");
//		u.setPassword("89767");
//		u.setPhone(1234);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		u=em.find(User.class, 1);
	
       if(u!=null) {
    	   em.remove(u);
    	   
    	  
       }
       else
       {
    	   System.out.println("invalid id");
       }
       et.begin();
       et.commit();
    
   
}
}
