package com.hibernate.pojo; 

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity  
@Table(name="author01")
public class Author  
{  
	
  @Column(name="author_Id")  
  private Long authorId; 
  @Column(name="author_name")
  private String authorName;  
  
  private Set<Book>books;
  
      
  @Id  
  @GeneratedValue(strategy=GenerationType.AUTO)  
  public Long getAuthorId()  
    {  
        return authorId;  
    }  
    public void setAuthorId(Long authorId)  
    {  
        this.authorId = authorId;  
    }  
    public String getAuthorName()  
    {  
        return authorName;  
    }  
    public void setAuthorName(String authorName)  
    {  
        this.authorName = authorName;  
    }  
    
    @ManyToMany(cascade=CascadeType.ALL, mappedBy="authors")  
    public Set<Book> getBooks()  
    {  
        return books;  
    }  
    public void setBooks(Set<Book> books)  
    {  
        this.books = books;  
    }  
}  