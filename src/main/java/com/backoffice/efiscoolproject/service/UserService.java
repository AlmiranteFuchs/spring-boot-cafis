package com.backoffice.efiscoolproject.service;

import com.backoffice.efiscoolproject.entity.UserEntity;
import com.backoffice.efiscoolproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public int updateUserMoney(UserEntity user, Float money){
        return userRepository.updateUserMoney(user.getId(), money);
    }
}
