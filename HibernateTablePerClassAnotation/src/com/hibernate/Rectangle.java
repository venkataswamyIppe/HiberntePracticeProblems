package com.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue(value="R") 
public class Rectangle extends Shape {
	
	@Column(name="Rectangle_Length")  
	 int length;  
	@Column(name="Rectangle_Breadth")  
	 int breadth; 
	
	 public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	

}
