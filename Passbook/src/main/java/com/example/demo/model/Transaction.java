package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity//add user id in this table
@Table(name = "transaction")
public class Transaction {
	
	@Id
	@Column(name = "transactionid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer transactionid;
	@Column(name = "time")
	@CreationTimestamp
	private Date time;
	@Column(name = "amount")
	@NotNull(message = "Transaction amount can not be null")
	private double amount;
	@Column(name = "updatetype")
	private String updatetype;
	@Column(name = "status")
	private String status;
	@Column(name = "result")
	private String result;
	@Column(name = "modeofpayment")
	private String modeofpayment;
	@Column(name = "fromaccountid")
	@NotNull(message = "Accountid can not be null")
	private int fromaccountid; 
	@Column(name = "toaccountid")
	@NotNull(message = "Accountid can not be null")
	private int toaccountid;
	public Integer getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(Integer transactionid) {
		this.transactionid = transactionid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getUpdatetype() {
		return updatetype;
	}
	public void setUpdatetype(String updatetype) {
		this.updatetype = updatetype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getModeofpayment() {
		return modeofpayment;
	}
	public void setModeofpayment(String modeofpayment) {
		this.modeofpayment = modeofpayment;
	}
	public int getFromaccountid() {
		return fromaccountid;
	}
	public void setFromaccountid(int fromaccountid) {
		this.fromaccountid = fromaccountid;
	}
	public int getToaccountid() {
		return toaccountid;
	}
	public void setToaccountid(int toaccountid) {
		this.toaccountid = toaccountid;
	}
	
	
	
	
	
}
