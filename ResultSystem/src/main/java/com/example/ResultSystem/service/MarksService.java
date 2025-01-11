package com.example.ResultSystem.service;

import java.util.List;

import com.example.ResultSystem.model.Marks;

public interface MarksService {
	 Marks insert(Marks m);
	 List<Marks> getAll();
}
