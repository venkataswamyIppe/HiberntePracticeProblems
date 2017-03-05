package com.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HQlOneRowSelect {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		String hqlQuery = "from NewStudent where id=104";
		Query qry = session.createQuery(hqlQuery);
		NewStudent ns = (NewStudent) qry.uniqueResult();
		System.out.println(ns.getId()+" "+ns.getName()+" "+ns.getEmail());
		session.close();

	}
}