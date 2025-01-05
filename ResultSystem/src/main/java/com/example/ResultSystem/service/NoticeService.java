package com.example.ResultSystem.service;

import java.util.List;

import com.example.ResultSystem.model.Notice;
import com.example.ResultSystem.model.Register;

public interface NoticeService {
	
	Notice insert(Notice n);
	List<Notice> getAllNotices();
	Notice search(int i);

}
