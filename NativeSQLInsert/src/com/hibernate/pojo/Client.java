package com.hibernate.pojo;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		SQLQuery sql=session.createSQLQuery("insert into product(pname,price)values(?,?)");
		
		sql.setParameter(0,"sssssss");
		sql.setParameter(1, new Double(15.0));
	
		sql.executeUpdate();
		tx.commit();
		System.out.println("inserted");
	}

}
