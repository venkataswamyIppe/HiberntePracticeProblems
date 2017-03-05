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
		 v.setVendorName("admin");
		 
		//creating 3 child objects
		 Customer c1=new Customer();
		 c1.setCustomerName("aaaa");
		 c1.setVendorId(v);
		 
		 Customer c2=new Customer();
		 c2.setCustomerName("bbbb");
		  c2.setVendorId(v);
		 Customer c3=new Customer();
		 c3.setCustomerName("cccc");
		 c3.setVendorId(v);
		
		 session.save(c1);
		 session.save(c2);
		 session.save(c3);
		 tx.commit();
		 session.close();
		 System.out.println("inserted");

	}

}
