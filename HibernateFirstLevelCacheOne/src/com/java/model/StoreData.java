package com.java.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	
	public static void main(String[] args) { 
	//creating configuration object  
    Configuration cfg=new Configuration();
  //populates the data of the configuration file 
    cfg.configure("hibernate.cfg.xml");
  //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
    //creating session object  
    Session session1=factory.openSession();  
    Employee e=(Employee) session1.get(Employee.class, new Integer(1)); 
    System.out.println(e.getId()+" "+e.getFirstName()+" "+e.getLastName()+""+e.getSalary());
    System.out.println("1");
    session1.evict(e);
    System.out.println("employee object deleted");
    Session session2=factory.openSession();
    Employee e2=(Employee) session1.get(Employee.class, new Integer(1));
    System.out.println("2");
    System.out.println(e2.getId()+" "+e2.getFirstName()+" "+e2.getLastName()+""+e2.getSalary());
    session1.close(); 
    session2.close();
    System.out.println("successfully saved");  
    
	
	}
	
}
