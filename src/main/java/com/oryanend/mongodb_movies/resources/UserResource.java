package com.oryanend.mongodb_movies.resources;

import com.oryanend.mongodb_movies.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User user = new User("1", "Name", "name@gmail.com", "senha123");
        User user2 = new User("2", "Test", "test@gmail.com", "password123");
        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(user, user2));
        return ResponseEntity.ok().body(users);
    }

}
