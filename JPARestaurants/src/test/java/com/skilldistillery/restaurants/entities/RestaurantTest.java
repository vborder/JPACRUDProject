package com.skilldistillery.restaurants.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaurantTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Restaurant restaurant;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("RestaurantPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		restaurant = em.find(Restaurant.class, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		restaurant = null;
	}
	
	@Test
	void test_Restaurant_entity_mapping() {
		assertNotNull(restaurant);
		assertEquals("Starbucks Coffee", restaurant.getName());
		assertEquals("Roasted Tomato and Mozzarella Panini", restaurant.getMeal());
//		assertEquals("", restaurant.getPrice()); // test null values?
		assertEquals(420, restaurant.getCalories());
		
	}
}
