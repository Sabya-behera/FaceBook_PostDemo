package com.example.Post.Demo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "LIKES")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String userLike;
    @ManyToOne
    @JsonBackReference
    private Post post;

    public Like() {
    }

    public Like(int id, String userLike, Post post) {
        this.id = id;
        this.userLike = userLike;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserLike() {
        return userLike;
    }

    public void setUserLike(String userLike) {
        this.userLike = userLike;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", userLike='" + userLike + '\'' +
                ", post=" + post +
                '}';
    }
}
