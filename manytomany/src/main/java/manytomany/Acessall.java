package manytomany;

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
	public static void main(String[] args, Object Course_c) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Student s1=new Student();
		s1.setName("pinku");
		s1.setPhone(7897767);
		s1.setPerc(98.0);
		Student s2=new Student();
		s2.setName("sonu");
		s2.setPhone(46565);
		s2.setPerc(89.0);
		Course c=new Course();
		c.setSubject("java");
		c.setDuration(30);
		Course c2=new Course();
		c2.setDuration(20);
		c2.setSubject("j2ee");
		s1.setCourse(new ArrayList<Course>(Arrays.asList(c,c2)));
		s2.setCourse(new ArrayList<Course>(Arrays.asList(c)));
		c.setStudent(new ArrayList<Student>(Arrays.asList(s1,s2)));
		c2.setStudent(new ArrayList<Student>(Arrays.asList(s1)));
//		manager.persist(s1);
//		manager.persist(s2);
//		transaction.begin();
//		transaction.commit();
//		System.out.println("for batch---------");
//		Scanner sc=new Scanner (System.in);
//		System.out.println("enter ur id gtre details ");
//		int courseid =sc.nextInt();
//		String qry="select s from Student s where id=?1";
//		Query q=manager.createQuery(qry);
//		q.setParameter(1, courseid);
//		List<Student> students=q.getResultList();
//		for(Student s21:students)
//		{
//		System.out.println(s21.getName());
//		System.out.println(s21.getPerc());
//		}

	}

}
