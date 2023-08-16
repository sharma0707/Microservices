package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String custName;
	private String custAddress;
	private String custOrder;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustOrder() {
		return custOrder;
	}
	public void setCustOrder(String custOrder) {
		this.custOrder = custOrder;
	}
	
	
	

}
