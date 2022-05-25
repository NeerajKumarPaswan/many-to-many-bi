package com.ty.student.course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudentCourse {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Student student1=new Student();
	student1.setName("Sandeep");
	student1.setAge(25);
	
	 Student student2=new Student();
	 student2.setName("MAdhu");
	 student2.setAge(24);
	 
	 Student student3=new Student();
	 student3.setName("Priya");
	 student3.setAge(16);

	  Course course1 =new Course();
	  course1.setName("Core Java");
	  course1.setDuration(3);
	  
	  Course course2=new Course();
	  course2.setName("HTML");
	  course2.setDuration(3);
	  
	  Course course3=new Course();
	  course3.setName("CSS");
	  course3.setDuration(2);
	  
	  List<Course> course=new ArrayList();
       course.add(course1);
       course.add(course2);
       course.add(course3);
       
       List<Student >student=new ArrayList();
       student.add(student3);
       student.add(student2);
       student.add(student1);
       
       student1.setCourses(course);
       student2.setCourses(course);
       student3.setCourses(course);
       
       
       course1.setStudents(student);
       course2.setStudents(student);
       course3.setStudents(student);
       
       entityTransaction.begin();
       
       entityManager.persist(course3);
       entityManager.persist(course2);
       entityManager.persist(course1);
       
       entityManager.persist(student1);
       entityManager.persist(student2);
       entityManager.persist(student3);
       
       entityTransaction.commit();
       
       
}
}
