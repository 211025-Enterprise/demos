package com.revature.repository;

import com.revature.model.User;

public class UserRepository {

    public User getUserById(int id){
        return new User().setId(id).setName("From Repository");
    }
}
