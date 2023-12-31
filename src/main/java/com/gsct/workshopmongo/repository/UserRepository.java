package com.gsct.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsct.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {


    User findOneById(String id);
}
