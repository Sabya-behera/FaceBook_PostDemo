package com.example.FaceBookPost.Service;

import com.example.FaceBookPost.Model.User;
import com.example.FaceBookPost.Repository.PostRepo;
import com.example.FaceBookPost.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    PostRepo postRepo;

    public List<User> getAllUser() {
       return userRepo.findAll();
    }

    public User getUserById(long id) {
       return userRepo.findById(id).get();
    }

    public String  addUser(User user) {
         userRepo.save(user);
         postRepo.saveAll(user.getPosts());
         return "Post added";
    }

    public void deleteUser(long id) {
       userRepo.deleteById(id);
    }

    public User updateUser(User user, long id) {
        User user1= userRepo.getById(id);
       user1.setUserEmail(user.getUserName());
       user1.setUserEmail(user.getUserEmail());
       user1.setPosts(user.getPosts());
       userRepo.save(user1);
       return user1;
    }
}
