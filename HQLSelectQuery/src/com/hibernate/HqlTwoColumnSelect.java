package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HqlTwoColumnSelect {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		String hqlQuery = "select name,email from NewStudent";
		Query qry = session.createQuery(hqlQuery);
		List<Object>list=qry.list();
		for(Object data:list)
		{
			Object o[]=(Object[]) data;
		System.out.println(o[0]+" "+o[1]);
		}
		session.close();

	}

}
