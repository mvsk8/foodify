package ch.zhaw.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.springboot.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
	
	@Query("SELECT r FROM Restaurant r WHERE r.postcode.town.name = ?1")
	public List<Restaurant> getRestaurantByTown(String town);
	
	@Query("SELECT r FROM Restaurant r WHERE r.postcode.town.name = ?1 AND r.category.name = ?2")
	public List<Restaurant> getRestaurantByTownAndCategory(String town, int category);
}