package ch.zhaw.springboot.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.repositories.RestaurantRepository;
import ch.zhaw.springboot.entities.Restaurant;

@RestController
@CrossOrigin
public class RestaurantRestController {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@RequestMapping(value = "api/restaurants", method = RequestMethod.GET)
	public ResponseEntity<List<Restaurant>> getRestaurant() {
		List<Restaurant> result = this.restaurantRepository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Restaurant>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Restaurant>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "api/restaurants/{id}", method = RequestMethod.GET)
	public ResponseEntity<Restaurant> getRestaurantById(@PathVariable("id") int id) {
		Optional<Restaurant> result = this.restaurantRepository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<Restaurant>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "api/restaurants/byTown/{town}", method = RequestMethod.GET)
	public ResponseEntity<List<Restaurant>> getRestaurantbyTown(@PathVariable("town") String town) {
		List<Restaurant> result = this.restaurantRepository.getRestaurantByTown(town);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Restaurant>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Restaurant>>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "api/restaurants/byTownAndCategory/{town}/{category}", method = RequestMethod.GET)
	public ResponseEntity<List<Restaurant>> getRestaurantByTownAndCategory(@PathVariable("town") String town, @PathVariable("category") int category) {
		List<Restaurant> result = this.restaurantRepository.getRestaurantByTownAndCategory(town, category);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Restaurant>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Restaurant>>(HttpStatus.NOT_FOUND);
		}
	}
}
