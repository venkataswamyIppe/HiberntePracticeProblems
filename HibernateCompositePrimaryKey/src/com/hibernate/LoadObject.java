package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadObject {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		
		Product p=new Product();
		p.setProductId(101);
	    p.setProName("iPhone");
	    Object o=session.get(Product.class, p);
	    Product p1=(Product)o;
	    
	    System.out.println("The price is: "+p1.getPrice());	    
		System.out.println("Object Loaded successfully.....!!");
		session.close();
		factory.close();

	}

}
