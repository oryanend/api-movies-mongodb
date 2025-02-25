package com.oryanend.mongodb_movies.service;

import com.oryanend.mongodb_movies.domain.User;
import com.oryanend.mongodb_movies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
