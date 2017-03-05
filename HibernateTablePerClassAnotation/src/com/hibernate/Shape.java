package com.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType; 


@Entity  
@Table(name="SHAPE")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
@DiscriminatorValue(value="S")
public class Shape {
	
	 @Id  
	 @GeneratedValue  
	 @Column(name="Shape_Id")  
	 private int shapeId;  
	 @Column(name="Shape_Name")  
	 private String shapeName; 
	 
	 public int getShapeId() {
		return shapeId;
	}
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	

	

}