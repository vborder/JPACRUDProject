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

	private String meal;

	private Double price;

	private Integer calories;

	public Restaurant(int id, String name, String meal, double mealPrice, int calories) {
		super();
		this.id = id;
		this.name = name;
		this.meal = meal;
		this.price = mealPrice;
		this.calories = calories;
	}

	public Restaurant() {

	}

	// methods
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

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", meal=" + meal + ", price=" + price + ", calories="
				+ calories + "]";
	}
}
