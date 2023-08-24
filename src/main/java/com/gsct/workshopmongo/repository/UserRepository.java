package com.gsct.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsct.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

    // Remove this method as it's no longer supported
    // User findOne(String id);

    // Use this method with the correct signature
    // User findById(String id);

    // Define your custom method
    User findOneById(String id);
}
