package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "account")
public class Account {
	
	@Id
	@Column(name = "accountid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountid;
	
	@Column(name = "balance")
	@NotNull(message = "balance can not be null")
	private double balance;
	
	
	@Column(name = "userid")
	@NotNull(message = "balance can not be null")
	private String userid;
	


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
