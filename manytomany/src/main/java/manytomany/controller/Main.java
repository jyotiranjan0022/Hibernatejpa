package manytomany.controller;

import java.util.List;
import java.util.Scanner;

import manytomany.Course;
import manytomany.Student;
import manytomany.dao.StudentDao;

public class Main {
	public static void main(String[] args) {
		//System.out.println("enter the course id to display students");
		Scanner sc=new Scanner(System.in);
//		int course_id=sc.nextInt();
		StudentDao dao=new StudentDao();
//		List<Student> students=dao.fetchStudentsByCourseId(course_id);
//		if(students!=null)
//		{
//			for(Student st:students)
//			{
//				System.out.println(st.getId());
//				System.out.println(st.getName());
//			}
//		}
//		else
//		{
//			System.err.println("invalid id");
//		}
//		System.out.println("enter ur subject");
//		String subject=sc.nextLine();
//		List<Student> students1=dao.fetchStudentsBySubject(subject);
//		if(students1!=null)
//		{
//			for(Student st1:students1)
//			{
//				System.out.println(st1.getName());
//				System.out.println(st1.getId());
//			}
//		}
		System.out.println("enter student id");
		int student_id=sc.nextInt();
		List<Course> courses=dao.fetchCourseById(student_id);
		if(courses!=null)
		{
			for(Course c1:courses)
			{
				System.out.println(c1.getSubject());
				System.out.println(c1.getDuration());
			}
		}
	}

}
