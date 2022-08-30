package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Person p=new Person();
       // p.setpId(100);
       // p.setpName("Prasanna");
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");//helps to create connectivity between java app and database
        EntityManager em=emf.createEntityManager();
      //  em.getTransaction().begin();
      //  em.persist(p);
      //  em.getTransaction().commit();
        Person p=em.find(Person.class, 100);
        System.out.println(p);
    }
}
