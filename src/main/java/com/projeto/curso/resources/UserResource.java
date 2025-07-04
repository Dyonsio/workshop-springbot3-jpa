package com.projeto.curso.resources;

import com.projeto.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <User> findAll() {
        User user = new User(1L, "1234", "11975341315", "João", "joao@gmail.com");
        return ResponseEntity.ok().body(user);
    }
}
