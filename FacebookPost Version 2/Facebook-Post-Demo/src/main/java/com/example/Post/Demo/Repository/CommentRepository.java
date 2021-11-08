package com.example.Post.Demo.Repository;

import com.example.Post.Demo.Entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {
}
