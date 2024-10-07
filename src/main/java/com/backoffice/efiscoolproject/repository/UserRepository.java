package com.backoffice.efiscoolproject.repository;

import com.backoffice.efiscoolproject.entity.Coffee;
import com.backoffice.efiscoolproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String name);

    @Modifying
    @Transactional
    @Query("update UserEntity u SET u.balance = :money where u.id = :id")
    int updateUserMoney(Long id, Float money);
}
