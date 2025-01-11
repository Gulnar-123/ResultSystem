package com.example.ResultSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ResultSystem.model.Profile;
import com.example.ResultSystem.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	@Qualifier("proRepo")
	private ProfileRepository proRepo;
	
	@Override
	public Profile insert(Profile p) {
		// TODO Auto-generated method stub
		return proRepo.save(p);
	}

	@Override
	public List<Profile> getAll() {
		// TODO Auto-generated method stub
		return proRepo.findAll();
	}

	@Override
	public Profile search(int id) {
		// TODO Auto-generated method stub
		Optional<Profile> opt=proRepo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
		return null;
	}

	@Override
	public Profile update(int id, Profile p) {
		// TODO Auto-generated method stub
				Optional<Profile> opt=proRepo.findById(id);
				if(opt.isPresent())
				{
				Profile old=opt.get();
				old.setBirthdate(p.getBirthdate());
				old.setEmailid(p.getEmailid());
				old.setFaculty(p.getFaculty());
				old.setGender(p.getGender());
				old.setPersuingyear(p.getPersuingyear());
				old.setSemester(p.getSemester());
				return proRepo.save(old);
				}
				else
				return null;
	}

}
