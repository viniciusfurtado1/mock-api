package com.example.MockApi.services;

import com.example.MockApi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
