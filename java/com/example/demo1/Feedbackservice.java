package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Feedbackservice {
	@Autowired
	Feedbackdao dao;
	@PostMapping("/addfeedback")
public String postfb(@RequestBody Feedback feedback) {
		System.out.println(feedback);
	dao.insert(feedback);
	return "Feedback added Successfully";
}
	 @GetMapping("/getfeedback")
	 public List<Feedback> getfeedback() {
		 		List<Feedback> p=dao.getall();
				return p;
	 }
}
