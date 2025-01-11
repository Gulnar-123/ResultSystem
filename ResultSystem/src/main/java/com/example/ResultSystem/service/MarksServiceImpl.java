package com.example.ResultSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ResultSystem.model.Marks;
import com.example.ResultSystem.repository.MarksRepository;

@Service
public class MarksServiceImpl implements MarksService {
	@Autowired
	@Qualifier("marksRepo")
	private MarksRepository marksRepo;

	@Override
	public Marks insert(Marks m) {
		// TODO Auto-generated method stub
		return marksRepo.save(m);
	}

	@Override
	public List<Marks> getAll() {
		// TODO Auto-generated method stub
		return marksRepo.findAll();
	}
}
