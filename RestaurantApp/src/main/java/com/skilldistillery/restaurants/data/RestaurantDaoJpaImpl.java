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
	public Restaurant findById(int rid) {
		return em.find(Restaurant.class, rid);
	}
	
	@Override
	public List<Restaurant> findAll() {
		String jpql = "SELECT r FROM Restaurant r";
		List<Restaurant> restaurants = em.createQuery(jpql, Restaurant.class).getResultList();
		
		return restaurants;
	}

//	@Override
//	public List<Restaurant> findMealsByKeyword(String keyword) {
//		String jpql = "SELECT r FROM Restaurant r WHERE r.meal LIKE %:meal%";
//		List<Restaurant> results = em.createQuery(jpql, Restaurant.class).getResultList();
//		
//		return results;
//	}
	
//	@Override
//	public List<Restaurant> findMealsByPrice(int minId, int maxId) {
//		String jpql = "SELECT r from Restaurant r WHERE r.price BETWEEN :low and :high";
//		List<Restaurant> meals = em.createQuery(jpql, Restaurant.class)
//				.setParameter("low", minId)
//				.setParameter("high", maxId)
//				.getResultList();
//		
//		em.close();
//		return meals;
//	}

	@Override
	public Restaurant createRestaurant(Restaurant restaurant) {
		em.persist(restaurant);
		em.flush();
		em.close();
		
		return restaurant;
	}

	@Override
	public Restaurant updateRestaurant(int restId, Restaurant restaurant) {
		String jpql = "SELECT r FROM Restaurant r WHERE r.id = newId";
		Restaurant updatedRest =em.createQuery(jpql, Restaurant.class).setParameter("newId", restId).getSingleResult();
				updatedRest.setName(restaurant.getName());
				updatedRest.setMeal(restaurant.getMeal());
				updatedRest.setMealPrice(restaurant.getMealPrice());
				updatedRest.setCalories(restaurant.getCalories());
		
		em.flush();
		em.close();
		return updatedRest;
	}

	@Override
	public boolean deleteRestaurant(int restId) {
		em.remove(em.find(Restaurant.class, restId));
		
		boolean stillContains = em.contains(em.find(Restaurant.class, restId));
		
		em.flush();
		em.close();
		
		return !stillContains;
	}
}
