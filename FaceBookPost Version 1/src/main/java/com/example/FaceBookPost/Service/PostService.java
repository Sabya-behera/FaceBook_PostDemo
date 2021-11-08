package com.example.FaceBookPost.Service;

import com.example.FaceBookPost.Model.Post;
import com.example.FaceBookPost.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public List<Post> getAllPost() {
        return postRepo.findAll();
    }

    public Post getPostById(long id) {
        return postRepo.findById(id).get();
    }

    public Post addPost(Post post) {
        return postRepo.save(post);
    }

    public void deletePost(long id) {
        postRepo.deleteById(id);
    }

    public void updatePost(Post post, long id) {
       Post post1= postRepo.getById(id);
        post1.setComments(post.getComments());
        post1.setLikes(post.getLikes());
        post1.setShare(post.getShare());
        postRepo.save(post1);
    }
}
