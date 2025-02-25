package com.oryanend.mongodb_movies.config;

import com.oryanend.mongodb_movies.domain.User;
import com.oryanend.mongodb_movies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com", "senha123");
        userRepository.save(maria);
    }
}
