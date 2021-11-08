package com.example.FaceBookPost.Repository;

import com.example.FaceBookPost.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
