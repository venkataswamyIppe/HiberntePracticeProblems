package com.hibernate.pojo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDeleteQuery {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		//Retrieve data using parent table primary key id
				Team tm=(Team) session.get(Team.class,new Integer(1));
				Transaction tx = session.beginTransaction();
				session.delete(tm);
				tx.commit();
				session.close();
				System.out.println("One To Many relation deleting is Done..!!");

	}

}
