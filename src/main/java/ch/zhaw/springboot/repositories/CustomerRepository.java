package ch.zhaw.springboot.repositories;

import ch.zhaw.springboot.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Customer;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT c FROM Customer c WHERE c.email = ?1")
    public Optional<Customer> getCustomerByEmail(String email);
}
