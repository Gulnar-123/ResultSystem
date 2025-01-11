package com.example.ResultSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ResultSystem.model.Marks;
import com.example.ResultSystem.service.MarksService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/resultsystem/")
public class MarksController {
	
	@Autowired 
	MarksService marksServ;
	
	@PostMapping("/marks")
	public Marks addrecord(@RequestBody Marks m)
	{
		return marksServ.insert(m);
	}
	
	@GetMapping("/marks")
	public List<Marks> getAll()
	{
		return marksServ.getAll();
	}
}
