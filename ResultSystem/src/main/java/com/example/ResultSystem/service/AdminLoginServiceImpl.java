package com.example.ResultSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ResultSystem.model.AdminLogin;
import com.example.ResultSystem.repository.AdminLoginRepository;
import com.example.ResultSystem.repository.RegisterRepository;
@Service
public class AdminLoginServiceImpl implements AdminLoginService{

	
	@Autowired
	@Qualifier("adRepo")
	private AdminLoginRepository adRepo;
	@Override
	public AdminLogin login(String emailid, String password) {
		// TODO Auto-generated method stub
		return adRepo.findAllByEmailidAndPassword(emailid, password);
	}

}
