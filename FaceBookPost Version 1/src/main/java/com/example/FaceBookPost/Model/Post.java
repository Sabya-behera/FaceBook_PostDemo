package com.example.FaceBookPost.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "post")
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="likes")
    private int likes;
    @Column(name="comments")
    private String comments;
    @Column(name = "share")
    private String share;

    @ManyToOne
    @JsonBackReference
    private User user;

    public Post() {
    }

    public Post(int likes,String comments,String share, User user) {
        this.likes = likes;
        this.comments = comments;
        this.share = share;
        this.user=user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}