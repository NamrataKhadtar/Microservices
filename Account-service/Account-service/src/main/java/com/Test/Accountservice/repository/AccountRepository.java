package com.Test.Accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Test.Accountservice.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	public Account findByAccId(Long accId);

}
