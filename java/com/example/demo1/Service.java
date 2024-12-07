package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

@RestController
@CrossOrigin
public class Service {
	
	@Autowired
	Userdao dao;
	
	
	@GetMapping("/{name}")
	public String hello(@PathVariable("name") String name ) {
		return "hello "+name;
	}
	
	
	@PostMapping("/signup")
	public String signup(@RequestBody User user)
	{
		dao.insert(user);
		return "User Inserted";
		
	}
	
	@GetMapping("/signin")
	public String signin(@RequestParam("email") String email,@RequestParam("password") String password) {
		User u1=dao.finduser(email);
		if(u1==null) {
			return "no";
		}else {
			if(u1.getPassword().equals(password)) {
				if(u1.getEmail().equals("admin@gmail.com")&&u1.getPassword().equals("admin")) {
					return "admin";
				}else
				{
					return "user";
				}
			}
			else {
				return "no";
			}
		}
	}
	
	
	
	@PostMapping("/adduser")

	public String adduser(@RequestBody User user) {
		dao.insert(user);
		return "User added Successfully";
	}
   
	@GetMapping("/viewall")
	public List<User> getusers() {
 		List<User> u=dao.getall();
		return u;
	}
	
	
	 @DeleteMapping("/delete")
	 public String deleteuser(@RequestParam("email") String email) {
		 dao.deleteuser(email);
		 return "User deleted Successfully";
	 }
	 
	 
	 @PutMapping("/update")
	 public String updateuser(@RequestBody User user) {
		 dao.update(user);
		 return "User updated successfully";
		 
	 }
	
}
