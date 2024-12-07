package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Itemdao {
	
	@Autowired
	Iteminterface repo;

	public void insert(Item item) {
		// TODO Auto-generated method stub
		repo.save(item);
		
	}

	public List<Item> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void deleteitems(String id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
		
	}

	public void update(Item item) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 
		repo.delete(item);
		repo.save(item);
		
	}
	

}
