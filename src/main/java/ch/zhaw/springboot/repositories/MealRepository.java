package ch.zhaw.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.springboot.entities.Meal;
import ch.zhaw.springboot.entities.Restaurant;

public interface MealRepository extends JpaRepository<Meal, Integer> {
	
	@Query("SELECT m FROM Meal m WHERE m.restaurant.pk_restaurant = ?1")
	public List<Meal> getMealByRestaurant(int restaurant);
}