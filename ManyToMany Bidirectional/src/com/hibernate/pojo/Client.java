package com.hibernate.pojo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		
		Set<Author> howToProgramWithJavaAuthor = new HashSet<Author>();  
        Set<Author> howToProgramWithJava2ndAuthors = new HashSet<Author>();  
        Set<Author> howToPlayGuitarAuthor = new HashSet<Author>();  
          
        Set<Book> trevorsBooks = new HashSet<Book>();  
        Set<Book> johnsBooks = new HashSet<Book>();  
          
        Author author1 = new Author();  
        author1.setAuthorName("Trevor Page");  
        howToProgramWithJavaAuthor.add(author1);  
          
        Author author2 = new Author();  
        author2.setAuthorName("John Doe");  
          
        howToProgramWithJava2ndAuthors.add(author1);  
        howToProgramWithJava2ndAuthors.add(author2);  
        howToPlayGuitarAuthor.add(author2);  
          
        Book book1 = new Book();  
        book1.setBookName("How to Program with Java");  
          
        Book book2 = new Book();  
        book2.setBookName("How to Program with Java 2nd Edition");  
          
        Book book3 = new Book();  
        book3.setBookName("How to Play Guitar");  
          
        trevorsBooks.add(book1);  
        trevorsBooks.add(book2);  
        johnsBooks.add(book2);  
        johnsBooks.add(book3);  
        author1.setBooks(trevorsBooks);  
        author2.setBooks(johnsBooks);  
        book1.setAuthors(howToProgramWithJavaAuthor);  
        book2.setAuthors(howToProgramWithJava2ndAuthors);  
        book3.setAuthors(howToPlayGuitarAuthor); 
        
        session.save(author1);
        session.save(author2);
        tx.commit();
        session.close();
        System.out.println("success");
	}
        

}
