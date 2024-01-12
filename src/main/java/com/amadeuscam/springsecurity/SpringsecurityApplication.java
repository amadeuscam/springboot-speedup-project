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
public class SpringsecurityApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User adminAccount = userRepository.findByRole(Role.ADMIN);
        if (adminAccount == null) {
            User user = new User();
            user.setEmail("admin@gmail.com");
            user.setFirstname("lucian");
            user.setSecondname("cati");
            user.setRole(Role.ADMIN);
            user.setPassword( new BCryptPasswordEncoder().encode("masina"));
            userRepository.save(user);
        }
    }
}
