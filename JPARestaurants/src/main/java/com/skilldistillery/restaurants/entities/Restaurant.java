package com.skilldistillery.restaurants.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;

	public Restaurant(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Restaurant() {
		
	}
	
	//methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + "]";
	}
}
