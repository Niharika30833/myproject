package com.example.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="itemss")
public class Item {
	@Id
	private String id;
	@Override
	public String toString() {
		return "Item [id=" + id + ", type=" + type + ", description=" + description + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	private String type;
	private String description;

}
