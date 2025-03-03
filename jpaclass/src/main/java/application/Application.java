package main.java.application;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import main.java.domain.Person;

public class Application {

	public static void main(String[] args) {
		
		/*Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
		Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
		Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");*/
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplojpa");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class, 2);
		
		/*em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		System.out.println(p);
		

	}

}
