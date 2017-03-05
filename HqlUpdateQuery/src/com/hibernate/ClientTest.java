package com.hibernate;

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
		String hqlQuery = "update NewStudent set name='abc' ,email='abc@gmail.com' where id=101";
		Query qry = session.createQuery(hqlQuery);
		int res = qry.executeUpdate();
		tx.commit();
		System.out.println("Numer of records effected due to update query :"
				+ res);

		session.close();

	}
}
