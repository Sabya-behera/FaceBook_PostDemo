package com.example.Post.Demo.Repository;

import com.example.Post.Demo.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post,Integer> {
}
