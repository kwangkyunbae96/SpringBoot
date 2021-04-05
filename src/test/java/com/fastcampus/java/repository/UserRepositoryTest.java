package com.fastcampus.java.repository;


import com.fastcampus.java.JavaApplicationTests;
import com.fastcampus.java.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends JavaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();

        user.setAccount("TestUser02");
        user.setEmail("TestUser02@gmail.com");
        user.setPhoneNumber("010-9939-1221");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user);
        System.out.print("newUser : " + newUser);

    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }

}
