package com.backoffice.efiscoolproject.repository;
import com.backoffice.efiscoolproject.entity.Coffee;
import com.backoffice.efiscoolproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    // What
    @Transactional(readOnly = true)
    List<Coffee> findByName(String name);

    @Transactional(readOnly = true)
    List<Coffee> findByCategory_categoryName(String name);

    @Modifying
    @Transactional
    @Query("update Coffee c SET c.on_stock = :new_quantity where c.id = :id")
    int updateCoffeStock(Long id, int new_quantity);
}
