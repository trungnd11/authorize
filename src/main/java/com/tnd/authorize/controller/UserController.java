package com.tnd.authorize.controller;

import com.tnd.authorize.domain.entity.UserEntity;
import com.tnd.authorize.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getList() {
        return ResponseEntity.ok(userService.getListUser());
    }

    @PostMapping("")
    public ResponseEntity<?> getList(@RequestBody UserEntity user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
}
