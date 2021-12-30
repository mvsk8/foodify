package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Town;

public interface TownRepository extends JpaRepository<Town, Integer> {
	
}