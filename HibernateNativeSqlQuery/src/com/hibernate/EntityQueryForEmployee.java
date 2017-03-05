package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EntityQueryForEmployee {
 public static void main(String[] args) {
		 
		 Session session =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		 Transaction tx=session.beginTransaction();
		 /*READ all the employees using Entity Query */
		 String sql = "SELECT * FROM EMPLOYEE";
         SQLQuery query = session.createSQLQuery(sql);
         query.addEntity(Employee.class);
         List employees = query.list();
         Iterator itr = employees.iterator();
         while(itr.hasNext())
         {
        	 Employee emp = (Employee) itr.next(); 
        	 System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
         }
         tx.commit();
         session.close();
 }

}
