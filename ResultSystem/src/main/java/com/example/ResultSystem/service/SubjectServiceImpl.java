package com.example.ResultSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ResultSystem.model.Subject;
import com.example.ResultSystem.model.Notice;
import com.example.ResultSystem.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	@Qualifier("subRepo")
	private SubjectRepository marksRepo;

	@Override
	public Subject insert(Subject m) {
		// TODO Auto-generated method stub
		return marksRepo.save(m);
	}

	@Override
	public List<Subject> getAllMarks() {
		// TODO Auto-generated method stub
		return marksRepo.findAll();
	}



	@Override
	public List<Subject> getAllSubjects(String s) {
		// TODO Auto-generated method stub
		return marksRepo.findAllBySem(s);
	}

}
