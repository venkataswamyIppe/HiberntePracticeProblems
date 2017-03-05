package com.java.pojo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) {
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Answer ans1=new Answer();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("anil");
		
		Answer ans2=new Answer();
		ans2.setAnswername("Java is a oops language");
		ans2.setPostedBy("chandu");
		
		List<Answer>al1=new ArrayList<Answer>();
		al1.add(ans1);
		al1.add(ans2);
		
		Question q1=new Question();
		q1.setQname("What is Java");
		q1.setAnswers(al1);
		
		Answer ans3=new Answer();
		ans1.setAnswername("Servlet is an Interface");
		ans1.setPostedBy("swamy");
		
		Answer ans4=new Answer();
		ans2.setAnswername("Servlet is web technology");
		ans2.setPostedBy("raju");
		
		List<Answer>al2=new ArrayList<Answer>();
		al2.add(ans3);
		al2.add(ans4);
		
		Question q2=new Question();
		q2.setQname("What is Servlet");
		q2.setAnswers(al2);
		
		session.persist(q1);
		session.persist(q2);
		
		tx.commit();
		
		System.out.println("success");

	}

}
