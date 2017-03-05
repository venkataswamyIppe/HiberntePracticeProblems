package com.hibernate.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer01")
public class Customer {
	@Id
	@GeneratedValue
	@Column
	private int customerId;
	@Column
	private String customerName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vendorId")
	private Vendor vendorId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Vendor getVendorId() {
		return vendorId;
	}
	public void setVendorId(Vendor vendorId) {
		this.vendorId = vendorId;
	}

}
