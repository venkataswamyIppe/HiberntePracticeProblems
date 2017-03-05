package com.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity  
@Table(name="SHAPE")  
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Shape {
	
	 @Id  
	 @GeneratedValue(strategy = GenerationType.TABLE)  
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
