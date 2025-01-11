package com.example.ResultSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ResultSystem.model.Profile;
import com.example.ResultSystem.service.ProfileService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/resultsystem/")
public class ProfileController {

	@Autowired
	private ProfileService pser;
	
	@PostMapping("/profile")
	public Profile add(@RequestBody Profile p)
	{
		return pser.insert(p);
	}
	@GetMapping("/profile")
	public List<Profile> getAll()
	{
		return pser.getAll();
	}
	
	@GetMapping("/profile/{id}")
	public Profile search(@PathVariable("id") int id)
	{
		return pser.search(id);
	}
	
	@PutMapping("/profile/{id}")
	public Profile update(@PathVariable("id")int id,@RequestBody Profile p)
	{
		return pser.update(id, p);
	}
	
}
