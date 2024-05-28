package com.tour.tour.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tour.tour.model.Feedback;
import com.tour.tour.repository.FeedbackRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/tour/")
public class FeedbackController {
@Autowired
@Qualifier("feedRepo")
FeedbackRepository feedRepo;

		@GetMapping("/feedback") 
	public ArrayList<Feedback> feedback() {
		return (ArrayList<Feedback>)feedRepo.findAll();
	}
		
	@PostMapping("/feedback")
		public Feedback saveFeedback(@RequestBody Feedback f)
		{
		return feedRepo.save(f);
		}
}
