package com.skilldistillery.restaurants.data;

import java.util.List;

import com.skilldistillery.restaurants.entities.Restaurant;

public interface RestaurantDAO {
	public Restaurant findById(int rId);
	List<Restaurant> findAll();
	public List<Restaurant> findMealsByKeyword(String keyword);
	public Restaurant createRestaurant(Restaurant restaurant);
	public boolean updateRestaurant(Restaurant restaurant);
	public boolean deleteRestaurant(int rid);
}
