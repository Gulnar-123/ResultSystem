package com.example.ResultSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ResultSystem.model.Register;
import com.example.ResultSystem.service.RegisterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/resultsystem/")
public class RegisterController {

	@Autowired 
	RegisterService regServ;
	
	@PostMapping("/register")
	public Register addrecord(@RequestBody Register r)
	{
		return regServ.insert(r);
	}
	@GetMapping("/register")
	public List<Register> getAll()
	{
		return regServ.getAllRegistrations();
	}
	@GetMapping("/register/{emailid}/{password}")
	public List<Register> login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
	{
		return regServ.login(emailid, password);
	}
	
	@GetMapping("/register/{id}")
	public Register search(@PathVariable("id") int r) {
		return regServ.search(r);
	}
	
}
