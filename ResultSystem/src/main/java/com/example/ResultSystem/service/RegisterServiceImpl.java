package com.example.ResultSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ResultSystem.model.Register;
import com.example.ResultSystem.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	@Qualifier("regRepo")
	private RegisterRepository regRepo;
	
	@Override
	public Register insert(Register r) {
		// TODO Auto-generated method stub
		return regRepo.save(r);
	}

	@Override
	public List<Register> getAllRegistrations() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public List<Register> login(String emailid, String password) {
		// TODO Auto-generated method stub
		return regRepo.findAllByEmailidAndPassword(emailid, password);
	}

	@Override
	public Register search(int i) {
		// TODO Auto-generated method stub
		Optional<Register> opt=regRepo.findById(i);;
		if(opt.isPresent())
			return opt.get();
		else
		return null; 
	}

}
