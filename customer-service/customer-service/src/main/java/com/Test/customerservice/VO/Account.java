package com.Test.customerservice.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	
	private Long accId;
	private String acc_type;
	private Long acc_number;
	private double balance;

}
