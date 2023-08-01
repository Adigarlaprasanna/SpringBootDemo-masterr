//package com.example.demo.Controllers;
//
//import com.example.demo.Entities.Post;
//import com.example.demo.Services.PostService;
//import com.example.demo.dto.PostResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping(value="/PostData")
//public class PostsController {
//    @Autowired
//    PostService postService;
//
//    @PostMapping("/save/{id}")
//    public Post insertPost(@RequestBody Post post) {
//        return postService.savePost(post);
//    }
//    @PostMapping("/saveAll")
//    public List<Post> addAllPosts(@RequestBody List<Post> postList) {
//        return postService.saveAllPosts(postList);
//    }
//    @GetMapping("/get")
//    public List<Post> getAllPosts() {
//        return postService.getAllPosts();
//    }
//    @GetMapping("/get/{id}")
//    public Post findPostsById(@PathVariable long id) {
//        return postService.getPostById(id);
//    }
//    @DeleteMapping("/delete/{id}")
//    public void deleteUserById(@PathVariable long id) {
//        postService.deletePost(id);
//    }
//    @PutMapping("/update/{id}")
//    public Post updateThePost(@RequestBody Post post) {
//        return postService.updatePost(post);
//    }
//
//    //    for posts
//    @GetMapping("/GetPostInfo")
//    public List<PostResponse> getAllPostsInfo(){
//        return postService.getJointPostInfo();
//    }
//    //    for post by id
//    @GetMapping("GetPosts/{id}")
//    public PostResponse getaPostInfoById(@PathVariable long id){
//        return postService.getPostInfoById(id);
//    }
//}
