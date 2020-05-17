package com.skilldistillery.restaurants.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.restaurants.data.RestaurantDAO;
import com.skilldistillery.restaurants.entities.Restaurant;

@Controller
public class RestaurantController {

	@Autowired
	private RestaurantDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		List<Restaurant> restaurants = dao.findAll();
		model.addAttribute("restaurants", restaurants);
		
		return "index";
	}

	@RequestMapping(path = "getRestaurant.do", method = RequestMethod.GET)
	public String findRestaurant(@RequestParam("rid") Integer restId, Model model) {
		Restaurant r = dao.findById(restId);
		model.addAttribute("restaurant", r);
		
		return "restaurant/restaurantDetail";
	}

	@RequestMapping(path = "addRestForm.do", method = RequestMethod.GET)
	public String addRestaurantPage() {
		
		return "restaurant/addRestForm";
	}
	
	@RequestMapping(path = "addRestaurant.do", method = RequestMethod.POST)
	public String addRestaurant(Restaurant restaurant, Model model) {
		Restaurant r = dao.createRestaurant(restaurant);
		model.addAttribute("restaurant", r);
		
		return "restaurant/additionComplete";
	}

	@RequestMapping(path = "updateRestPage.do", method = RequestMethod.POST)
	public String updateRestaurantPage(@RequestParam("rest") int restId, Model model) {
		Restaurant r = dao.findById(restId);
		model.addAttribute("restaurant", r);
		
		return "restaurant/updateRestForm";
	}
		
	@RequestMapping(path = "updateRestaurant.do", method = RequestMethod.POST)
	public String updateRestaurant(int restId, Restaurant restaurant) {
		dao.updateRestaurant(restId, restaurant);
		
		return "restaurant/updateComplete";
	}

	@RequestMapping(path = "deleteRestaurant.do")
	public String deleteRestaurant(int rid) {
		Restaurant r = dao.findById(rid);
		dao.deleteRestaurant(rid);
		
		return "restaurant/deleteComplete";
	}
}
