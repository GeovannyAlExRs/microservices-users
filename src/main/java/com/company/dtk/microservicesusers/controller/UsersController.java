package com.company.dtk.microservicesusers.controller;

import com.company.dtk.microservicesusers.model.Users;
import com.company.dtk.microservicesusers.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(usersService.findAllUsers());
    }

    @PostMapping
    public  ResponseEntity<?> createUsers(@RequestBody Users users) {
        return new ResponseEntity<>(
                usersService.createUsers(users),
                HttpStatus.CREATED
        );
    }

    @GetMapping("{username}")
    public ResponseEntity<?> findByUsername(@PathVariable String username) {
        return ResponseEntity.ok(usersService.findByUsername(username));
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<?> deleteUsers(@PathVariable Long userId) {
        usersService.deleteUsers(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
