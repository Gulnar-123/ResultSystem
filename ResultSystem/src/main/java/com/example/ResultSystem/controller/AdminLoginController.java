package com.example.ResultSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ResultSystem.model.AdminLogin;
import com.example.ResultSystem.service.AdminLoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/resultsystem/")
public class AdminLoginController {
	
	@Autowired 
	AdminLoginService adServ;
	
	@GetMapping("/admin/{emailid}/{password}")
	public AdminLogin login(@PathVariable("emailid")String emailid,@PathVariable("password")String password) {
		return adServ.login(emailid, password);
	}
	
	

}
