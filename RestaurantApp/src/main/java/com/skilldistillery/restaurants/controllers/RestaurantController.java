package com.skilldistillery.restaurants.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.restaurants.data.RestaurantDAO;
import com.skilldistillery.restaurants.entities.Restaurant;

@Controller
public class RestaurantController {
	
	@Autowired
	private RestaurantDAO dao;
	
	@RequestMapping(path="getRestaurant.do")
	public String findRestaurant(@RequestParam Integer rid, Model model) {
		Restaurant r = dao.findById(rid);
		model.addAttribute("restaurant", r);
		return "restaurantDetail";
	}

}
