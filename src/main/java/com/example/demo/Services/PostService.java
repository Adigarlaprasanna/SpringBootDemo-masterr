package com.example.demo.Services;

import com.example.demo.Entities.Post;
import com.example.demo.Repository.PostRepo;
import com.example.demo.Repository.PostsRepo;
import com.example.demo.Repository.UserRepo;
import com.example.demo.dto.PostRequest;
import com.example.demo.dto.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class PostService {
    @Autowired
    PostRepo postRepo;
    @Autowired
    UserRepo userRepo;

    public Post savePost(PostRequest postRequest){
        Post post= new Post();
        post.setTitle(postRequest.getTitle());
        post.setBody(postRequest.getBody());
        return postRepo.save(post);
    }
    public List<Post> saveAllPosts(List<Post> posts){
        return postRepo.saveAll(posts);
    }
    public List<Post> getAllPosts(){
        return postRepo.findAll();
    }
    public Post getPostById(long id){
        return postRepo.findById(id).orElse(null);
    }
    public String deletePost(long id){
        postRepo.deleteById(id);
        return "the "+id+" Post data has been deleted";
    }
    public Post updatePost (Post post){
        Post existingPost = postRepo.findById(post.getId()).orElse(null);
        existingPost.setId(post.getId());
        existingPost.setTitle(post.getTitle());
        existingPost.setBody(post.getBody());
        return postRepo.save(existingPost);
    }

    //    for posts
    public List<PostResponse> getJointPostInfo(){
        return postRepo.getPostInformation();
    }
    //    for post by id
    public PostResponse getPostInfoById(@PathVariable long id){
        return postRepo.getPostById(id);
    }
}
