package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Deliverer;

public interface DelivererRepository extends JpaRepository<Deliverer, Integer> {
	
}
