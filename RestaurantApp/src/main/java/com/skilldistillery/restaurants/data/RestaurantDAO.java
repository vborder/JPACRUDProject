package com.skilldistillery.restaurants.data;

import java.util.List;

import com.skilldistillery.restaurants.entities.Restaurant;

public interface RestaurantDAO {
	public Restaurant findById(int restId);
	List<Restaurant> findAll();
	public Restaurant createRestaurant(Restaurant restaurant);
	public Restaurant updateRestaurant(int restId, Restaurant restaurant);
	public boolean deleteRestaurant(int restId);

}
