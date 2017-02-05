package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForSave {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Product p=new Product();
		p.setProductId(101);
        p.setProName("iPhone");
        p.setPrice(25000);
        
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		System.out.println("saved success");
	}

}
