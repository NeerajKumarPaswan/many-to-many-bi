package com.ty.Person.Cab;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonCab {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person1=new Person();
		person1.setName("Ramu");
		person1.setEmail("ramu@mail.com");
		person1.setAge(24);
		
		Person person2=new Person();
		person2.setName("Priya");
		person2.setEmail("priya@mail.com");
		person2.setAge(25);
		
		Person person3=new Person();
		person3.setName("Deepak");
		person3.setEmail("D@mail.com");
		person3.setAge(35);
		
		Cab cab1=new Cab();
		cab1.setCarName("Swift");
		cab1.setDriverName("Sandeep");
		cab1.setCost(603.2);
		
		Cab cab2=new Cab();
		cab2.setCarName("Ritz");
		cab2.setDriverName("Nitish");
		cab2.setCost(506);
		
		
		Cab cab3=new Cab();
		cab3.setCarName("Octavia");
		cab3.setDriverName("Mohit");
		cab3.setCost(2000);
		
		List<Person> persons1=new ArrayList();
		persons1.add(person3);
		persons1.add(person2);
		
		List<Person> persons2=new ArrayList();
		persons2.add(person3);
		persons2.add(person2);
		persons2.add(person1);
		
		List<Person> persons3=new ArrayList();
		persons3.add(person3);
		persons3.add(person2);
		persons3.add(person1);
		
        List<Cab> cabs=new ArrayList();
        cabs.add(cab3);
        cabs.add(cab2);
        cabs.add(cab1);
        
        person1.setCab(cabs);
        person2.setCab(cabs);
        person3.setCab(cabs);
        
        cab1.setPerson(persons3);
        cab2.setPerson(persons1);
        cab3.setPerson(persons2);
        
        entityTransaction.begin();
        entityManager.persist(person1);
        entityManager.persist(person2);
        entityManager.persist(person3);
        entityManager.persist(cab1);
        entityManager.persist(cab2);
        entityManager.persist(cab3);
       entityTransaction.commit();        
	}

}
