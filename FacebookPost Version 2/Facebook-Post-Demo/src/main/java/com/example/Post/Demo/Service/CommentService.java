package com.example.Post.Demo.Service;

import com.example.Post.Demo.Entity.Comment;
import com.example.Post.Demo.Repository.CommentRepository;
import com.example.Post.Demo.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    PostRepository postRepository;


    public List<Comment> getAllComment() {
        return (List<Comment>) commentRepository.findAll();
    }

    public Comment commenttById(int id) {
        return commentRepository.findById(id).get();

    }

    public Comment createComment(int id ,Comment comment) {
        comment.setPost(postRepository.findById(id).get());
        return commentRepository.save(comment);
    }

    public void deleteComment(int id) {
        commentRepository.deleteById(id);
    }

    public Comment updateComment(int id, Comment comment){
        Comment comment1=commentRepository.findById(id).get();
        comment1.setUserComment(comment.getUserComment());
        commentRepository.save(comment1);
        return comment1;
    }


}

