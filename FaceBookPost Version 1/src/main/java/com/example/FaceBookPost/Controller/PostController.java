package com.example.FaceBookPost.Controller;

import com.example.FaceBookPost.Model.Post;
import com.example.FaceBookPost.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/get2")
    public List<Post> getAllPost() {
        return postService.getAllPost();
    }

    @GetMapping("/get2/{id}")
    public Post getPostById(@PathVariable(value = "id") long id) {
        return postService.getPostById(id);
    }

    @PostMapping("/post2")
    public Post addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }

    @DeleteMapping("/delete2/{id}")
    public void deletePost(@PathVariable(value = "id") long id) {
        postService.deletePost(id);
    }

    @PutMapping("/put2/{id}")
    public Post updatePost(@RequestBody Post post, @PathVariable long id) {
        postService.updatePost(post, id);
        return post;
    }
}

