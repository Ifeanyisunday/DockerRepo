package com.devops.devops_demo.service;


import com.devops.devops_demo.model.AppUser;
import com.devops.devops_demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;



    public AppUser create(AppUser user) {
        AppUser newUser = new AppUser();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());

        return userRepository.save(newUser);
    }
}
