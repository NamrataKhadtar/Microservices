package com.Test.Accountservice.entity;

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
public class Account {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long accId;
	private String acc_type;
	private Long acc_number;
	private double balance;
	
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public Long getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(Long acc_number) {
		this.acc_number = acc_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Long getAccId() {
		return accId;
	}
	public void setAccId(Long accId) {
		this.accId = accId;
	}

}
