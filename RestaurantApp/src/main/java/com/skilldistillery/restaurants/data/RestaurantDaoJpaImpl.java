package com.skilldistillery.restaurants.data;

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
	public Restaurant findById(int id) {
		return em.find(Restaurant.class, id);
	}

}
