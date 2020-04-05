package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Response;
import com.example.demo.service.impl.PassbookServiceImpl;

@RestController
public class passbookcontroller {

	@Autowired
	private PassbookServiceImpl book;
	
	@GetMapping("/passbook")
	public Response getPassbook(@RequestBody @RequestParam String userid) throws Exception
	{
		//User user.user.getUserid();
		return book.getPassbook(userid);  
	}
}
