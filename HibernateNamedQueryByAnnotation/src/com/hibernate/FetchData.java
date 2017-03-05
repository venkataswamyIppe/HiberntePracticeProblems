package com.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		//Hibernate Named Query  
	    Query query = session.getNamedQuery("findEmployeeByName");  
	    query.setString("name", "swami");  
	    //query.setParameter(0,"amit");
	    List<Employee> employees=query.list();
	    Iterator<Employee> itr=employees.iterator();  
	     while(itr.hasNext()){  
	    Employee e=itr.next();  
	    System.out.println(e);  
	     }  
	          
	    session.close();  
	}

}
