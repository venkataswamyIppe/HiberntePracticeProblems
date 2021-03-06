package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries({ @NamedQuery(name = "findEmployeeByName", query = "from Employee e where e.name = :name") })
/*@NamedQuery(name = "findEmployeeByName", query = "from Employee e where e.name = ?") 
 * or
@NamedQuery(name = "findEmployeeByName", query = "from Employee e where e.name = :name")*/
@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private double salary;

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

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

}
