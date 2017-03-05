package com.hibernate.pojo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//parent object
		Vendor v =new Vendor();
		 v.setVendorName("chiru");
		 
		//creating 3 child objects
		 Customer c1=new Customer();
		 c1.setCustomerName("abc");
		 
		 Customer c2=new Customer();
		 c2.setCustomerName("pqr");
		  
		 Customer c3=new Customer();
		 c3.setCustomerName("xyz");
		 
		// adding child objects to set, as we taken 3rd property set in parent
		 Set<Customer> s=new HashSet<Customer>();
		 s.add(c1);
		 s.add(c2);
		 s.add(c3);
		 v.setCustomers(s);
		 
		 session.save(v);
		 tx.commit();
		 session.close();
		 System.out.println("inserted");

	}

}
