package com.Test.customerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Test.customerservice.VO.Account;
import com.Test.customerservice.VO.ResponseTemplateVO;
import com.Test.customerservice.entity.Customer;
import com.Test.customerservice.repository.CustomerRepository;

import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {
	
	public static final String CUSTOMERSERVICE = "customerService";
	int attempts = 1;
	Long fallbackId;

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CustomerRepository customerRepository;
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
 
	@Retry(name = CUSTOMERSERVICE, fallbackMethod = "fallback_getCustomerWithAccount")
	public ResponseTemplateVO findCustomersWithAccount(Long customerId) {
		
		log.info("Request Attempt "+ attempts++);
		 fallbackId = customerId;
		ResponseTemplateVO vo=new ResponseTemplateVO();
		Customer customer= customerRepository.findById(customerId).get();
		Account account=restTemplate.getForObject("http://ACCOUNT-SERVICE/Accounts/"+ customer.getAccountId(), Account.class);

		vo.setCustomer(customer);
		vo.setAccount(account);
		return vo;
	}
	
	
	 public ResponseTemplateVO fallback_getCustomerWithAccount(Exception exception) {

		 ResponseTemplateVO vo=new ResponseTemplateVO();
			Customer customer= customerRepository.findById(fallbackId).get();

		  Account account = new Account();
		  account.setAccId(9999L);
		  account.setAcc_type("Saving");
		  account.setAcc_number(100010001000L);
		  account.setBalance(10);
          vo.setCustomer(customer);
		  vo.setAccount(account);
		  return vo;
	 }

}
