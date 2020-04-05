package com.example.demo.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountRepository;
import com.example.demo.dao.PassbookRepo;
import com.example.demo.model.Account;
import com.example.demo.model.Response;
import com.example.demo.model.Transaction;
import com.example.demo.service.PassbookService;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class PassbookServiceImpl implements PassbookService {

	@Autowired
	private PassbookRepo dao;
	@Autowired
	private AccountRepository accdao;
	  
	@Override 
	public Response getPassbook(String userid) throws Exception {
		
		
		Account acc=accdao.findByuserid(userid);
		int id=acc.getAccountid();
		
		System.out.println(id);
		List<Transaction> L=dao.findByAccountid(id);
		//check from and to id from trasaction and return a list of those here
		
		if(L != null)
		{
			String jsonStr="";
			ObjectMapper Obj = new ObjectMapper(); 
	        	try 
	        	{ 
	        		jsonStr = Obj.writeValueAsString(L); 
	        	} 
	        	catch (IOException e) { 
	        		throw new Exception(); 
	        	} 
	        return new Response(true,jsonStr);
		}
		
		else
		{
			return new Response(false, "No Transaction Available");
		}
		
	}

}
