package com.example.MockApi.services;

import com.example.MockApi.domain.User;

public interface UserService {

    User findById(Integer id);
}