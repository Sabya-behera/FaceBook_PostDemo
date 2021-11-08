package com.example.Post.Demo.Controller;

import com.example.Post.Demo.Entity.Comment;
import com.example.Post.Demo.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/getAllComment")
    public List<Comment> getAllComment() {
        return (List<Comment>) commentService.getAllComment();
    }
    @GetMapping("/commentById/{id}")
    public Comment commentById(@PathVariable int id) {
        return commentService.commenttById(id);


    }
    @PostMapping("/createComment/{id}")
    public String createComment(@PathVariable int id,@RequestBody Comment comment) {
        commentService.createComment(id, comment);
        return "Data Created";
    }
    @DeleteMapping("/deleteComment/{id}")
    public String deleteComment(@PathVariable int id) {
        commentService.deleteComment(id);
        return "Data Deleted";
    }
    @PutMapping("/updateComment/{id}")
    public Comment updateComment(@PathVariable int id, @RequestBody Comment comment){
        commentService.updateComment(id, comment);
        return comment;
    }
}
