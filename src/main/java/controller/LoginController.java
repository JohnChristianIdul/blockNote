package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import service.LoginService;

@RestController
public class LoginController {
    @Autowired
    LoginService loginservice;

    @PostMapping("/login")
    public User authUser(@RequestBody User u) {
        return loginservice.authenticate(u);
    }
}
