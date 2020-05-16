package com.skilldistillery.restaurants.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.restaurants.entities.Restaurant;

@Service
@Transactional
public class RestaurantDaoJpaImpl implements RestaurantDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Restaurant findById(int rId) {
		return em.find(Restaurant.class, rId);
	}
	
	@Override
	public List<Restaurant> findAll() {
		String jpql = "SELECT r FROM Restaurant r";
		List<Restaurant> restaurants = em.createQuery(jpql, Restaurant.class).getResultList();
		
		return restaurants;
	}

	@Override
	public List<Restaurant> findMealsByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant createRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRestaurant(int rId) {
		// TODO Auto-generated method stub
		return false;
	}
}
