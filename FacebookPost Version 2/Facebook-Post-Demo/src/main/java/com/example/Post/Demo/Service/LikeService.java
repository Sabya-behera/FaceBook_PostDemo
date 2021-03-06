package com.example.Post.Demo.Service;

import com.example.Post.Demo.Entity.Like;
import com.example.Post.Demo.Repository.LikeRepository;
import com.example.Post.Demo.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LikeService {
    @Autowired
    LikeRepository likeRepository;
    @Autowired
    PostRepository postRepository;


    public List<Like> getAllLike(){
        return (List<Like>) likeRepository.findAll();
    }
    public Like likeById(int id){
        return likeRepository.findById(id).get();

    }
    public Like createLike(int id,Like like){
        like.setPost(postRepository.findById(id).get());
        return likeRepository.save(like);
    }
    public  void deleteLike(int id){
        likeRepository.deleteById(id);
    }

    public Like updateLike(int id, Like like) {
        Like like1 = likeRepository.findById(id).get();
        like1.setUserLike(like.getUserLike());
        likeRepository.save(like1);
        return like1;
    }


}
