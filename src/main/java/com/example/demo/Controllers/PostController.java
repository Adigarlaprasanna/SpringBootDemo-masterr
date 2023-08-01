//package com.example.demo.Controllers;
//
//import com.example.demo.Entities.Post;
//import com.example.demo.Services.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class PostController {
//
//    @Autowired
//    private PostService postService;
//
//    @GetMapping("/post/{id}")
//    public Post getPost(@PathVariable("id") int id) {
//        return this.postService.getPostById(id);
//    }
//
//    @GetMapping("/posts")
//    public List<Post> getAllPosts() {
//        return this.postService.getAllPosts();
//    }
//
//    @PostMapping("/savePost")
//    public Post createPost(@RequestBody Post post){
//        return this.postService.createPost(post);
//    }
//
//    @DeleteMapping("/deletePost/{id}")
//    public String  deletePost(@PathVariable("id") int id) {
//        return this.postService.deletePost(id);
//    }
//
//    @PutMapping("/update/{id}")
//    public Post updatePost(@PathVariable("id") int id) {
//        return this.postService.updatePost(id);
//    }
//}
