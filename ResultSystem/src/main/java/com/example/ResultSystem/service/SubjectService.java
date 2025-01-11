package com.example.ResultSystem.service;

import java.util.List;

import com.example.ResultSystem.model.Subject;

public interface SubjectService {
	
	Subject insert(Subject m);
	List<Subject> getAllMarks();
	
	List<Subject> getAllSubjects(String s);
}
