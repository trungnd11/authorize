package com.tnd.authorize.services;

import com.tnd.authorize.domain.entity.UserEntity;
import com.tnd.authorize.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;


    public List<UserEntity> getListUser() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserEntity user) {
        String enCodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(enCodePassword);
        return userRepository.save(user);
    }
}
