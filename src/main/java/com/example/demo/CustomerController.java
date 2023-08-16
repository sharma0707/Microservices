package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;

	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return cs.saveCustomer(customer);

	}
	
	@GetMapping("/myorder/{custId}")
	public MyOrder myProductOrder(@PathVariable int custId) {
		 return cs.getMyOrder(custId);
}
}
