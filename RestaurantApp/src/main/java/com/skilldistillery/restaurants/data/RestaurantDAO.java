package com.skilldistillery.restaurants.data;

import java.util.List;

import com.skilldistillery.restaurants.entities.Restaurant;

public interface RestaurantDAO {
	public Restaurant findById(int restId);
	List<Restaurant> findAll();
//	public List<Restaurant> findMealsByKeyword(String keyword);
	public Restaurant createRestaurant(Restaurant restaurant);
	public Restaurant updateRestaurant(int restId, Restaurant restaurant);
	public boolean deleteRestaurant(int restId);
//	List<Restaurant> findMealsByPrice(int minId, int maxId);
}
