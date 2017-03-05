package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Employee;

public class ClientForUpdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Employee.class, new Integer(1));
		Employee e=(Employee)o;
		Transaction tx = session.beginTransaction();

		e.setName("ffffff"); // implicitly update method will be call

		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
	}

}
