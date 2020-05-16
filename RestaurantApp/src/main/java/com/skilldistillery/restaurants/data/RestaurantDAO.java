package com.skilldistillery.restaurants.data;

import com.skilldistillery.restaurants.entities.Restaurant;

public interface RestaurantDAO {
	public Restaurant findById(int id);

}
