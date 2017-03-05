package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setName("Ravi Malik");
		e1.setEmail("ravi@gmail.com");

		Address address1 = new Address();
		address1.setCity("Ghaziabad");
		address1.setState("UP");
		e1.setAddress(address1);
		address1.setEmployee(e1);
		session.persist(e1);
		tx.commit();
		session.close();
		System.out.println("success");
	}

}
