package com.example.RejisterLogin.service;

import com.example.RejisterLogin.entity.Userentity;

public interface UserService {
    void registerUser(Userentity user);

    Userentity loginUser(String email, String password);
}
