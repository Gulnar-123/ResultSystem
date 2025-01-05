package com.example.ResultSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.ResultSystem.model.Notice;
import com.example.ResultSystem.model.Register;
import com.example.ResultSystem.repository.NoticeRepository;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	@Qualifier("notRepo")
	private NoticeRepository notRepo;

	@Override
	public Notice insert(Notice n) {
		// TODO Auto-generated method stub
		return notRepo.save(n);
	}

	@Override
	public List<Notice> getAllNotices() {
		// TODO Auto-generated method stub
		return notRepo.findAll();
	}

	@Override
	public Notice search(int i) {
		// TODO Auto-generated method stub
		Optional<Notice> opt=notRepo.findById(i);
		if(opt.isPresent())
			return opt.get();
		else
		return null; 
		
	}
	

}
