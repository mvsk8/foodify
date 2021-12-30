package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
