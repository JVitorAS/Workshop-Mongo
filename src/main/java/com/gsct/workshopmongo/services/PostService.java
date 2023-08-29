package com.gsct.workshopmongo.services;

import com.gsct.workshopmongo.domain.Post;
import com.gsct.workshopmongo.repository.PostRepository;
import com.gsct.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
	}
}
