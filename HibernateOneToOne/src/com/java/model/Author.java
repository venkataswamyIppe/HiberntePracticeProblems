package com.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	private int id;
	@Column(name="author_name")
	private String name;
	@Column(name="author_email")
	private String email;
	
	
	public Author() {
    }
             
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Id
	@Column(name="author_id")
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}