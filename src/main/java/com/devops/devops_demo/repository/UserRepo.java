package com.devops.devops_demo.repository;

import com.devops.devops_demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {

}
