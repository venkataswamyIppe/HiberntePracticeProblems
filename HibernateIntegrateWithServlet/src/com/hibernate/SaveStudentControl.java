package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudentControl {
	private static SessionFactory sessionFactory;
	 
    @SuppressWarnings("deprecation")
	private Session getSession() {
        Session s = null;
        try {
            sessionFactory = new Configuration().configure(
                    "hibernate.cfg.xml").buildSessionFactory();
            s = sessionFactory.openSession();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
    public void addNewStudent(String stuname,
            String stuemail,String stumarks) throws Exception {
        try {
            Session s = getSession();
            Transaction tx = s.beginTransaction();
            Student stu = new Student();
            
            stu.setStuname(stuname);
            stu.setStuemail(stuemail);
            stu.setStumarks(stumarks);
            s.save(stu);
 
            tx.commit();
            System.out.println("\n\n Details Added \n");
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
 
    }
 
}// end of class

