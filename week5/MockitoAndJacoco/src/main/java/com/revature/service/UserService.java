package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int id){
        // we don't want to be dependent on this outcome
        // in our tests, we create a Mock of the userRepository
        return userRepository.getUserById(id); // instead, we supply what's returned so that we aren't dependent
    }

    public User getUserByUsername(String username){
        return null;
    }
}
