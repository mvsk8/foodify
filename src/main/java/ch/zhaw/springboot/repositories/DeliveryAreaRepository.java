package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.DeliveryArea;

public interface DeliveryAreaRepository extends JpaRepository<DeliveryArea, Integer> {
	
}