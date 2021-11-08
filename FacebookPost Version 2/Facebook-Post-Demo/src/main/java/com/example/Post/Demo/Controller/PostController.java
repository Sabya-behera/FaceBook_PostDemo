package com.example.Post.Demo.Controller;

import com.example.Post.Demo.Entity.Post;
import com.example.Post.Demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/getAllPost")
    public List<Post> getAllPost() {
        return (List<Post>) postService.getAllPost();
    }
    @GetMapping("/postById/{id}")
    public Post postById(@PathVariable int id) {
        return postService.postById(id);


    }

    @PostMapping("/createPost/{id}")
    public String createPost(@PathVariable int id,@RequestBody Post post) {
        postService.createPost(id, post);
        return "Data Created";
    }


    @DeleteMapping("/deletePost/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return "Data Deleted";
    }
    @PutMapping("/updatePost/{id}")
    public String updatePost(@RequestBody Post post){
        postService.createPost(post);
        return "Post Created";
    }

}
