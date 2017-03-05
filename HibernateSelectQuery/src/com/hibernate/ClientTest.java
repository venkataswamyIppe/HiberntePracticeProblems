package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		/*//case 1 : select all objects( records)
		Query qry = session.createQuery("from Product p");
		List list =qry.list();
		System.out.println("Total Number Of Records : "+list.size());
		System.out.println("----------------------");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object o = (Object)it.next();
			Product p = (Product)o;
			
			System.out.println("Product id : "+p.getProductId());
			System.out.println("Product Name : "+p.getProName());
			System.out.println("Product Price : "+p.getPrice());
			System.out.println("----------------------");
		}	*/
		
		/* case 2 :Selecting partial objects(More than one object) start__________ 		
		Query qry = session.createQuery("select p.productId,p.proName from Product p");
		 
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();
		System.out.println("----------------");
		while(it.hasNext())
		{
			Object o[] = (Object[])it.next();
			System.out.println("Product id : "+o[0]+ " Product Name : "+o[1]);
 
			System.out.println("----------------");
		}	*/	
		// Selecting single object start_____________
		 
        Query qry = session.createQuery("select p.productId from Product p");
 
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();
		System.out.println("---------------------------");
		while(it.hasNext())
		{
			Integer i = (Integer)it.next();
			System.out.println("Product id : "+i.intValue());
			System.out.println("---------------------------");
 
		}		
		session.close();
		
	}
}