package com.devops.devops_demo.web;
import com.devops.devops_demo.model.AppUser;
import com.devops.devops_demo.repository.UserRepo;
import com.devops.devops_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/create")
    public String createUser(@RequestBody AppUser user) {
        userService.create(user);
        return "User created";
    }
}
