package com.example.Post.Demo.Service;

import com.example.Post.Demo.Entity.User;
import com.example.Post.Demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    public User userById(int id) {
        return userRepository.findById(id).get();

    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public User updateUser(int id,User user){
        User user1=userRepository.findById(id).get();
        user1.setName(user.getName());
        user1.setDob(user.getDob());
        user1.setMobNumber(user.getMobNumber());
        user1.setState(user.getState());
        userRepository.save(user1);
        return user1;
    }
}
