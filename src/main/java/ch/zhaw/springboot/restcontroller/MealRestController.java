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

import ch.zhaw.springboot.repositories.MealRepository;
import ch.zhaw.springboot.entities.Meal;

@RestController
@CrossOrigin
public class MealRestController {

	@Autowired
	private MealRepository mealRepository;

	@RequestMapping(value = "api/meals/byRestaurant/{restaurant}", method = RequestMethod.GET)
	public ResponseEntity<List<Meal>> getMealByRestaurant(@PathVariable("restaurant") int restaurant) {
		List<Meal> result = this.mealRepository.getMealByRestaurant(restaurant);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Meal>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Meal>>(HttpStatus.NOT_FOUND);
		}
	}
}
