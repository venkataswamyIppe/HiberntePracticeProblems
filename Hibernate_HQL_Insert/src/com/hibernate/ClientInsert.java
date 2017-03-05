package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		OldStudent os1=new OldStudent();
		os1.setId(104);
		os1.setName("anu");
		os1.setEmail("anu@gmail.com");
		OldStudent os2=new OldStudent();
		os2.setId(103);
		os2.setName("usha");
		os2.setEmail("usha@gmail.com");
		
		session.save(os1);
		session.save(os2);
		tx.commit();
		session.close();
		System.out.println("saved");

	}

}
