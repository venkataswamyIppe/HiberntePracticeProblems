package com.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_Table_Table_Dump {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String hqlQuery = "insert into NewStudent(id,name,email) select s.id,s.name,s.email from OldStudent s";
		Query qry = session.createQuery(hqlQuery);
		int result=qry.executeUpdate();
		System.out.println("no.of rows dumped from old table to new table :"+result);
		tx.commit();
		session.close();
	}
}
