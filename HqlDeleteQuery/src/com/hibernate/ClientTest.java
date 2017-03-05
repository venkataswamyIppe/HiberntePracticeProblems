package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String hqlQuery = "select name from NewStudent";
		Query qry = session.createQuery(hqlQuery);
		List<String>list = qry.list();
		for(String names:list)
		{
			System.out.println(names);
		}
		tx.commit();
		session.close();

	}
}
