package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HqlSelectAll {
	
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		String hqlQuery = "from NewStudent";
		Query qry = session.createQuery(hqlQuery);
		List<NewStudent>list=qry.list();
		for(NewStudent ns:list)
		{
		System.out.println(ns.getId()+" "+ns.getName()+" "+ns.getEmail());
		}
		session.close();

	}

}
