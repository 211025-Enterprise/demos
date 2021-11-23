package com.revature.service;

import com.revature.Driver;
import com.revature.model.User;
import com.revature.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DriverTest {

    // don't mock what you're testing
    private Driver driver;

    // first dependency -> needs a mock
    private UserService userService;

    // second dependency -> needs a mock
    //private UserRepository userRepository;

    @BeforeEach
    public void setup(){
        //userRepository = Mockito.mock(UserRepository.class);
        userService = Mockito.mock(UserService.class);
        driver = new Driver(userService);
    }

    @Test
    public void getNameByUserId(){
        int userId = 1;
        String testName = "Brandon";
        Mockito.when(userService.getUserById(userId)).thenReturn(new User().setName(testName));
        Assertions.assertEquals(testName, driver.getNameOfUserById(userId));
    }
}
