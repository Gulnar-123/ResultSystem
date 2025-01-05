package com.example.ResultSystem.service;

import java.util.List;

import com.example.ResultSystem.model.Register;

public interface RegisterService {

	Register insert(Register r);
	List<Register> getAllRegistrations();
	List<Register>  login(String emailid,String password);
	Register search(int i);
}
