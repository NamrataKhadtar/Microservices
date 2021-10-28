package com.Test.Accountservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.Accountservice.entity.Account;
import com.Test.Accountservice.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;


	public Account saveAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	public Account findAccountsById(Long accId) {
		// TODO Auto-generated method stub
 		return accountRepository.findByAccId(accId);

	}

}
