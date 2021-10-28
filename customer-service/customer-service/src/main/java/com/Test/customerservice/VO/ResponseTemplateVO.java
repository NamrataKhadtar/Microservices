package com.Test.customerservice.VO;

import com.Test.customerservice.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private Account account;
	private Customer customer;

}
