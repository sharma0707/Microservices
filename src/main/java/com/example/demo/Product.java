package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productName;
	private double productprice;
	public Product(String productName, double productprice) {
		
		this.productName= productName;
		this.productprice = productprice;
		
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
//	public Product(String productName, double productprice) {
//		super();
//		this.productName = productName;
//		this.productprice = productprice;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
