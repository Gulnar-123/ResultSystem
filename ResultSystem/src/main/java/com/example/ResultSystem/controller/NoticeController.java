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
import com.example.ResultSystem.model.Register;
import com.example.ResultSystem.service.NoticeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/resultsystem/")
public class NoticeController {
	
	@Autowired 
	NoticeService notServ;
	
	@PostMapping("/notice")
	public Notice addrecord(@RequestBody Notice n)
	{
		return notServ.insert(n);
	}
	
	@GetMapping("/notice")
	public List<Notice> getAll()
	{
		return notServ.getAllNotices();
	}
	
	@GetMapping("/notice/{id}")
	public Notice search(@PathVariable("id") int n) {
		return notServ.search(n);
	}

}
