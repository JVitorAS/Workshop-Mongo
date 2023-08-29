package com.gsct.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gsct.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
}
