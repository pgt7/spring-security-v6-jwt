package com.springboot.version3.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author P.GHAFARBEIGI
 * @version 1.0
 * @since 1/21/2023
 */

@RequestMapping("/user/v1/auth")
@RestController
public record UserController(UserService userService) {

    @GetMapping
    public ResponseEntity<?> register(@RequestBody UserEntity user) {
        return ResponseEntity.ok(userService.register(user));
    }

    @PostMapping
    public ResponseEntity<?> authentication(@RequestBody UserRequest request) {
        return ResponseEntity.ok(userService.authentication(request.getEmail(), request.getPassword()));
    }
}
