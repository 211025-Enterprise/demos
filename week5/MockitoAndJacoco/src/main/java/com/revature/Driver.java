package com.revature;

import com.revature.service.UserService;

public class Driver {

    private UserService userService;



    public Driver(UserService userService) {
        this.userService = userService;
    }

    public String getNameOfUserById(int id){
        return userService.getUserById(id).getName();

        // we enter this method with an id
        // we call userService getUser
        // that calls user repository getUser
    }
}
