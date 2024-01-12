package com.amadeuscam.springsecurity;

import com.amadeuscam.springsecurity.entities.Role;
import com.amadeuscam.springsecurity.entities.User;
import com.amadeuscam.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecurityApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }


}
