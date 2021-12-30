package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.repositories.CategoryRepository;

import ch.zhaw.springboot.entities.Category;

@RestController
@CrossOrigin
public class CategoryRestController {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@RequestMapping(value = "api/categories", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getCategories() {
		List<Category> result = this.categoryRepository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Category>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Category>>(HttpStatus.NOT_FOUND);
		}
	}
}
