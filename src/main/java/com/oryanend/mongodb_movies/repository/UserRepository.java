package com.oryanend.mongodb_movies.repository;

import com.oryanend.mongodb_movies.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
