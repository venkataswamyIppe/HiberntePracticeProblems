package com.java.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BooksManager {
	 
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
         
        // loads configuration and mappings
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
         
        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory();
         
        // obtains the session
        Session session = sessionFactory.openSession();
        session.beginTransaction();
         
        // creates a Book entity
        Book newBook = new Book();
        newBook.setTitle("Times Made Easy");
        newBook.setDescription("made easy is a good book");
       
        newBook.setAuthor(new Author("venkat", "venkat@gmail.com"));
         
        // persists the book entity
        int bookId =  (int) session.save(newBook);
         
        // gets the book entity back
        Book book = (Book) session.get(Book.class, bookId);
        System.out.println("Book's Title: " + book.getTitle());
        System.out.println("Book's Description: " + book.getDescription());
         
        Author author = book.getAuthor();
        System.out.println("Author's Name: " + author.getName());
        System.out.println("Author's Email: " + author.getEmail());
         
        session.getTransaction().commit();
        session.close();       
    }
}