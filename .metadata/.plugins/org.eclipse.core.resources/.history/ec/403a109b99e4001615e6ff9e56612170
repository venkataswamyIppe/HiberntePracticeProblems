package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		//base class
		Shape shape=new Shape(); 
		shape.setShapeName("Square");
		//derived class
		Rectangle rectangle=new Rectangle();
		rectangle.setShapeName("Rectangle"); 
		rectangle.setLength(10);
		rectangle.setBreadth(20);
		
		//derived class
		  Circle circle=new Circle(); 
		  circle.setShapeName("Circle");
		  circle.setRadius(4);
		  Transaction tx=session.beginTransaction();
		  session.save(shape);
		  session.save(rectangle);
		  session.save(circle);
		  tx.commit();
		  session.close();
		  System.out.println("saved");

		
	}

}
