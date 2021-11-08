package com.example.Post.Demo.Repository;

import com.example.Post.Demo.Entity.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends CrudRepository<Like,Integer>{

}
