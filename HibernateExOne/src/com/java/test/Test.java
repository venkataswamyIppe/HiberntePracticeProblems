package com.java.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Employee e=new Employee();
		e.setId(1);
		e.setName("RGUKT");
		e.setSalary(12.3);
		e.setV
		session.update(e);
		session.beginTransaction().commit();
		System.out.println("object updated successfully..");
		
		session.close();
		sf.close();
	}

}
