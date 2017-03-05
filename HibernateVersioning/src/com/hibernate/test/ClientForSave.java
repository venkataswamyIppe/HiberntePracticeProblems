package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Employee;



public class ClientForSave {
	
public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Employee e=new Employee();
		e.setName("ssss");
		//e.setSalary(124.2);
		
		Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
        sf.close();
        System.out.println("saved sucuess");
	}

}
