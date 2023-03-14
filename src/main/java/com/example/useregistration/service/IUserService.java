package com.example.useregistration.service;

import com.example.useregistration.entity.User;

import java.util.List;

public interface IUserService {

    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);

}
