package org.example.bookmyshow.services;

import org.example.bookmyshow.models.User;
import org.example.bookmyshow.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void login(String email, String password) {
        String passwordFromDB = "asdas"; // getting from DB
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        if(bCryptPasswordEncoder.matches(passwordFromDB, password)) {
            return;
        }
    }

    public User signUp(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()) {
            throw new RuntimeException();
        }

        User user = new User();
        user.setEmail(email);

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(password));

        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
