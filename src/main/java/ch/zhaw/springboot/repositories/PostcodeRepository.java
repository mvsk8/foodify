package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Postcode;

public interface PostcodeRepository extends JpaRepository<Postcode, Integer> {
	
}