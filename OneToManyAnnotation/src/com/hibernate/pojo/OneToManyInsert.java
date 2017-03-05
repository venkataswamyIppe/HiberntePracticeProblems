package com.hibernate.pojo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyInsert {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Department department = new Department();
		department.setDepartmentName("Sales");
		session.save(department);
		
		Employee emp1 = new Employee();
		emp1.setEmployeeName("usha");
		emp1.setEmployeecellphone("7411232951");
		Employee emp2 = new Employee();
		emp2.setEmployeeName("sita");
		emp2.setEmployeecellphone("8333035730");
		
		emp1.setDepartment(department);
		emp2.setDepartment(department);
		
		session.save(emp1);
		session.save(emp2);
		tx.commit();
		session.close();
		System.out.println("inserted");

	}

}