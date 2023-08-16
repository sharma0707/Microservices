package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
