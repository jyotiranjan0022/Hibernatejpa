package manytomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytomany.Course;
import manytomany.Student;

public class StudentDao {
 
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		public List<Student> fetchStudentsByCourseId(int course_id)
		{
			Course c=manager.find(Course.class, course_id);
			if(c!=null)
			{
				return c.getStudent();
			}
			return null;
		}
		public List<Student> fetchStudentsBySubject(String subject)
		{
			Query q=manager.createQuery("select c From Course c where c.subject=?1");
			q.setParameter(1, subject);
			List<Course>course=q.getResultList();
			if(course.size()>0)
			{
				Course c=course.get(0);
				return c.getStudent();
			}
			return null;
		}
		public List<Course> fetchCourseById(int student_id)
		{
			Student s=manager.find(Student.class, student_id);
			if(s!=null)
			{
				return s.getCourse();
			}
			return null;
		}
		
		
		
		
		
		
		
	

}
