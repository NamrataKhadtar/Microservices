package com.Test.Accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Test.Accountservice.entity.Account;
import com.Test.Accountservice.service.AccountService;

@RestController
@RequestMapping("/Accounts")
public class AccountController {
	
@Autowired
 private AccountService accountService;

@PostMapping("/")
public Account saveAccount(@RequestBody Account account) {
	
	return accountService.saveAccount(account);
}
@GetMapping("/{id}")
public Account findAccountsById(@PathVariable("id") Long accId) {
	
	return accountService.findAccountsById(accId);
}
	
}
