package com.hibernate.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//parent object
		Vendor v =new Vendor();
		 v.setVendorName("animal");
		 
		//creating 3 child objects
		 Customer c1=new Customer();
		 c1.setCustomerName("dog");
		 c1.setVendorId(v);
		 
		 Customer c2=new Customer();
		 c2.setCustomerName("fox");
		  c2.setVendorId(v);
		 Customer c3=new Customer();
		 c3.setCustomerName("tiger");
		 c3.setVendorId(v);
		
		 session.save(c1);
		 session.save(c2);
		 session.save(c3);
		 tx.commit();
		 session.close();
		 System.out.println("inserted");


	}

}
