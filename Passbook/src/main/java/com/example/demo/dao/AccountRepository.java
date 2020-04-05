package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Account;



public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	Account findByuserid(String userName);

}
