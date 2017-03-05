package com.hibernate.pojo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDeleteAllParentObjects {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Query qry=session.createQuery("from Team tm");
		List list=qry.list();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Team team=(Team) it.next();
			session.delete(team);
		}
		tx.commit();
		session.close();
		System.out.println("One To Many is Done for deleting all parents with childs...!");
	}

}
