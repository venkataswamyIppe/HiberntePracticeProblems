package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CriterriaCondition {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Criteria crit = session.createCriteria(Product.class);
		//equal condition
		//Criterion cn = Restrictions.eq("id",1);
		// greater than condition
		Criterion cn = Restrictions.gt("price",new Double(26000));
		crit.add(cn);
		List l=crit.list();
		System.out.println("List total size :"+l.size());
		Iterator it=l.iterator();
		System.out.println("-----------------");
		while(it.hasNext())
		{
			Product p=(Product)it.next();
			System.out.println(p.getProductId());
			System.out.println(p.getProName());
			System.out.println(p.getPrice());
			System.out.println("-----------------");
		}
 session.close();

	}

}
