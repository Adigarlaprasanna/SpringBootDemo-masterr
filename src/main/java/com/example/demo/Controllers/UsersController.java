//package com.example.demo.Controllers;
//
//import com.example.demo.Entities.User;
//import com.example.demo.Repository.UsersRepo;
//import com.example.demo.Services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value="/UserData")
//public class UsersController {
//    @Autowired
//    UserService userService;
//
//    @Autowired
//    UsersRepo usersRepo;
//
//    @PostMapping("/save/{id}")
//    public User insertUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//    @PostMapping("/saveAll")
//    public List<User> addAllUsers(@RequestBody List<User> userList) {
//        return userService.saveAllUsers(userList);
//    }
//    @GetMapping("/get")
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//    @GetMapping("/get/{id}")
//    public User findUsersById(@PathVariable long id) {
//        return userService.getUserById(id);
//    }
//    @DeleteMapping("/delete/{id}")
//    public void deleteUserById(@PathVariable long id) {
//        userService.deleteUser(id);
//    }
//    @PutMapping("/update/{id}")
//    public User updateTheUser(@RequestBody User user) {
//        return userService.updateUser(user);
//    }
//
//}
//
