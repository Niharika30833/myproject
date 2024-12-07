package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Itemservice {
	@Autowired
 Itemdao dao;
	
	
	

	    @PostMapping("/additem")
	    public String additem(
	            @RequestBody Item item
	           ) {
	        
	        // Create an Item object from the received parameters
	       
	        
	        dao.insert(item);
	        return "Item added successfully";
	    }
	    
	    @GetMapping("/getitems")
	    public List<Item> getitems() {
	 		List<Item> u=dao.getall();
	 		return u;
			
		}
		 @DeleteMapping("/deleteitem")
		 public String deleteitem(@RequestParam("id") String id) {
			 dao.deleteitems(id);
			 return "Item deleted Successfully";
		 }
		 @PutMapping("/updateitem")
		 public String updateitem(@RequestBody Item item) {
			 dao.update(item);
			 return "item updated successfully";
		 
		 }
}


