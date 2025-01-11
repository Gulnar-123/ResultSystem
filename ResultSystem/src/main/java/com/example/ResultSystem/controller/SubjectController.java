package com.example.ResultSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ResultSystem.model.Notice;
import com.example.ResultSystem.model.Subject;
import com.example.ResultSystem.service.SubjectService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/resultsystem/")
public class SubjectController {
	
	@Autowired 
	SubjectService marksServ;
	@PostMapping("/subject")
	public Subject addrecord(@RequestBody Subject s)
	{
		return marksServ.insert(s);
	}
	
	@GetMapping("/subject")
	public List<Subject> getAll()
	{
		return marksServ.getAllMarks();
	}
	
	@GetMapping("/subject/{sem}")
	public List <Subject>search(@PathVariable("sem") String s) {
		return marksServ.getAllSubjects(s);
	}

}
