package com.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CriteriaSelectAll {
	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Criteria crit = session.createCriteria(Product.class);
		List<Product> list= crit.list();
		for(Product p:list)
		{
			System.out.println(p.getProductId()+" "+p.getProName()+" "+p.getPrice());
		}
		session.close();
		
	}

}
