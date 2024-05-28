package com.tour.tour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tour.tour.model.AdminLogin;
import com.tour.tour.model.Register;
import com.tour.tour.repository.AdminLoginRepository;
import com.tour.tour.repository.RagisterRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/tour/")
public class AdminController {

	@Autowired
	@Qualifier("admRepo")
	AdminLoginRepository admRepo;
	
	@GetMapping("/admin/{emailid}/{password}")
	public AdminLogin login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
	{
		return admRepo.findByEmailIdAndPassword(emailid, password);
	}


}
