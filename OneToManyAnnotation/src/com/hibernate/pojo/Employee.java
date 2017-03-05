package com.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee111")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private Long employeeId;
	
	@Column(name="emp_name")
	private String employeeName;
	
	@Column(name="emp_cell_phone")
	private String employeecellphone;

	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeecellphone() {
		return employeecellphone;
	}

	public void setEmployeecellphone(String employeecellphone) {
		this.employeecellphone = employeecellphone;
	}

}
