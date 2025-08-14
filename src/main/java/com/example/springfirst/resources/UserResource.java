package com.example.springfirst.resources;

import com.example.springfirst.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "71987658182", "123"); //Abrir auxiliador de parametros é CTRL P
        return ResponseEntity.ok().body(u);
    }
}
