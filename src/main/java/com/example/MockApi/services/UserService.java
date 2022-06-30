package com.example.MockApi.services;

import com.example.MockApi.domain.User;
import com.example.MockApi.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
