package com.example.FaceBookPost.Repository;

import com.example.FaceBookPost.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Long> {
}
