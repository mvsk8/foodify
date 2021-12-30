package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ListRepository extends JpaRepository<List, Integer> {

    @Query("SELECT l FROM List l WHERE l.purchase.pk_purchase = ?1")
    public java.util.List<List> getListByPurchase(int id);

    @Transactional
    @Modifying
    @Query("DELETE FROM List l WHERE l.purchase.pk_purchase = ?1 AND l.meal.pk_meal = ?2")
    public void deleteMealFromPurchase(int pid, int mid);
}