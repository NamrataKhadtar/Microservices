package com.Test.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Test.customerservice.VO.ResponseTemplateVO;
import com.Test.customerservice.entity.Customer;
import com.Test.customerservice.service.CustomerService;



@RestController
@RequestMapping("/Customers")
public class CustomerController {
	
@Autowired
 private CustomerService customerService;

@PostMapping("/")
public Customer saveAccount(@RequestBody Customer customer) {
	
	return customerService.saveCustomer(customer);
}
/*
 * @GetMapping("/{id}") public Customer findCustomersById(@PathVariable("id")
 * Long customerId) {
 * 
 * return customerService.findCustomerById(customerId); }
 */

@GetMapping("/{id}")
public ResponseTemplateVO findCustomersWithAccount(@PathVariable("id") Long customerId) {
 
 return customerService.findCustomersWithAccount(customerId); 
 }

}