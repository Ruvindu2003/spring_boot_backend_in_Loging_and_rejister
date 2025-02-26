package com.example.RejisterLogin.service;
import com.example.RejisterLogin.entity.Userentity;
import com.example.RejisterLogin.reporsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

    @Service
    public class Userimpl implements UserService{

        @Autowired
        private UserRepository userRepository;

        @Autowired
        private BCryptPasswordEncoder passwordEncoder;

        public void registerUser(@org.jetbrains.annotations.NotNull Userentity user) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
        }

        public Userentity loginUser(String email, String password) {
            Userentity user = userRepository.findByEmail(email);
            if (user != null && passwordEncoder.matches(password, user.getPassword())) {
                return user;
            }
            return null;
        }
    }


