package com.inventory.dedasys.controllers;

import com.inventory.dedasys.models.User;
import com.inventory.dedasys.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserControllers {

    @Autowired
    private UserRepositories userRepositories;

    @GetMapping
    public ResponseEntity<List<User>> listUsers(){
        List<User> list = (List<User>) userRepositories.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userRepositories.save(user);
        return ResponseEntity.status(201).body(newUser);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User newUser = userRepositories.save(user);
        return ResponseEntity.status(200).body(newUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        userRepositories.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
