package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component	
public class Feedbackdao {
	
	@Autowired
	feedback1 repo;

	public void insert(Feedback feedback) {
		// TODO Auto-generated method stub
		repo.save(feedback);
		
	}

	public List<Feedback> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	};


}
