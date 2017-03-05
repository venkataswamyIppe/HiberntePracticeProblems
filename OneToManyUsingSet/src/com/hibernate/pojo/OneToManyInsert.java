package com.hibernate.pojo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyInsert {

	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Actor ac=new Actor();
		ac.setActorname("chiru");
		
		Movie mv1=new Movie();
		mv1.setMovieName("indra");
		
		Movie mv2=new Movie();
		mv2.setMovieName("khidi");
		
		Set<Movie>set=new HashSet<Movie>();
		set.add(mv1);
		set.add(mv2);
		ac.setMovies(set);
		
		session.save(ac);
		session.save(mv1);
		session.save(mv2);
		tx.commit();
		System.out.println("inserted");

	}

}
