package com.skilldistillery.restaurants.controllers;

import java.util.List;

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

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		List<Restaurant> restaurants = dao.findAll();
		model.addAttribute("restaurants", restaurants);
		return "index";
	}

	@RequestMapping(path="getRestaurant.do")
	public String findRestaurant(@RequestParam Integer rid, Model model) {
		Restaurant r = dao.findById(rid);
		model.addAttribute("restaurant", r);
		return "restaurant/restaurantDetail";
	}

	@RequestMapping(path="getMeal.do")
	public String findMeal(String keyword, Model model) {
		List<Restaurant> restaurant = dao.findMealsByKeyword(keyword);
		model.addAttribute("meal", restaurant);
		return "mealDetail";
	}

	@RequestMapping(path="addRestaurant.do")
	public String addRestaurant(Restaurant restaurant, Model model) {
		Restaurant r = dao.createRestaurant(restaurant);

		if (r != null) {
			model.addAttribute("restaurant", r);
			return "additionComplete";
		} else {
			return "index";
		}
	}

	@RequestMapping(path="updateRestaurant.do")
	public String updateRestaurant(Restaurant restaurant, Model model) {
		boolean r = dao.updateRestaurant(restaurant);

		if (r) {
			model.addAttribute("restaurant", r);
			return "updateComplete";
		} else {
			return "index";
		}
	}

//	@RequestMapping(path="")
//	public String deleteRestaurant(int rId) {
//		boolean r = dao.deleteRestaurant(rId);
//		
//		if()
//		return null;
//		
//	}
}
