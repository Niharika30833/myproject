package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Userdao {
	
	@Autowired
	UserInterface repo;

	public void insert(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	public User finduser(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
		
		
	}

	public List<User> getall() {
		
		return repo.findAll();
	}

	public void deleteuser(String email) {
		// TODO Auto-generated method stub
		User u=repo.findByEmail(email);
		repo.delete(u);
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		User u=repo.findByEmail(user.getEmail());
		repo.delete(u);
		repo.save(user);
		
	}
	

}
