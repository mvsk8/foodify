package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
	
}