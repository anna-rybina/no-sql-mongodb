package com.github.annarybina.nosqlmongo.repository;

import com.github.annarybina.nosqlmongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);
    List<User> findByAgeGreaterThan(int age);
}