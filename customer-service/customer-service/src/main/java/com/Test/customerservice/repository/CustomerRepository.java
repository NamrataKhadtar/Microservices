package com.Test.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Test.customerservice.VO.ResponseTemplateVO;
import com.Test.customerservice.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByCustomerId(Long customerId);

}
