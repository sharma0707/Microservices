package com.example.demo;

import java.util.HashMap;
import java.util.List;

import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	@Autowired
	RestTemplate restTemplate;

	
	public List<Customer> getCustomer() {
		return repo.findAll();

	}
	public Optional<Customer> getCustById(int custid){
		return repo.findById(custid);
	}
	public Customer saveCustomer(Customer c) {
		return repo.save(c);
	}
//	public Optional<Customer> getMyOrder(int orderid) {
//		return repo.findById(orderid);
//	}
	
	public MyOrder getMyOrder(int custid) {
		Optional<Customer> cust  = repo.findById(custid);
//		int id  = cust.get().getCustId();
//		
		Object jsonpObject = restTemplate.getForObject("http://localhost:8080/product/", Object.class);
		List<HashMap<String,Object>> result = (List<HashMap<String,Object>>)jsonpObject;
		Product pro  = new Product((String)result.get(0).get("productName"),(Double)result.get(0).get("productprice"));
//	List<Product> pro = (List<Product>) restTemplate.getForEntity("http://localhost:8080/product/", List.class);
		LoggerFactory.getLogger(getClass()).info((String) result.get(0).get("productName"));
		MyOrder mo = new MyOrder();
		mo.setCust(cust.get());
		mo.setProduct(pro);
		return mo;
	}

}
