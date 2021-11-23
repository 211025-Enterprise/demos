package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int id){
        return userRepository.getUserById(id);
    }
}
