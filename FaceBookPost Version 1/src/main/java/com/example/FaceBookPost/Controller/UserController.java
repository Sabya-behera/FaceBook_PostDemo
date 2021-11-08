package com.example.FaceBookPost.Controller;

import com.example.FaceBookPost.Model.Post;
import com.example.FaceBookPost.Model.User;
import com.example.FaceBookPost.Service.PostService;
import com.example.FaceBookPost.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @GetMapping("/get")
    public List<Post> getAllPost() {
        return postService.getAllPost();
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable (value = "id") long id)
    {
        return userService.getUserById(id);
    }

    @PostMapping("/post")
    public String addUser(@Valid  @RequestBody User user)
    {
         userService.addUser(user);
         return "Controller";
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable(value = "id")long id)
    {
        userService.deleteUser(id);
    }

    @PutMapping("/put/{id}")
    public User updateUser(@RequestBody User user,@PathVariable long id)
    {
         userService.updateUser(user,id);
         return user;
    }

}
