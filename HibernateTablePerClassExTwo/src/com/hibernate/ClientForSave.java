package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForSave {
	
	public static void main(String[] args)
	{
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		//derived class
		
		CreditCard c=new CreditCard();
		
		c.setAmount(1000.4);
		c.setCreditCardType("Visa");
		
		//derived class
		Cheque cq=new Cheque();
		cq.setAmount(1200.2);
		cq.setChequeType("ICICI");
		
		Transaction tx=session.beginTransaction();
		session.save(c);
		session.save(cq);
		tx.commit();
		session.close();
		System.out.println("saved success");
	}

}
