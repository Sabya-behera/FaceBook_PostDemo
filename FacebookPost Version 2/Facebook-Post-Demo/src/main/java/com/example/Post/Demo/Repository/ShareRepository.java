package com.example.Post.Demo.Repository;

import com.example.Post.Demo.Entity.Share;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareRepository extends CrudRepository<Share,Integer> {
}
