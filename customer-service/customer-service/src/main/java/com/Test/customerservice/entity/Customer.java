package com.Test.customerservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	private String customer_name;
	private String customer_address;
	private Long customer_mobile;
	private Long accountId;
}