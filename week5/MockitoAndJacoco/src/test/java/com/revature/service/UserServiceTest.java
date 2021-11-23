package com.revature.service;

import com.revature.model.User;
import com.revature.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserServiceTest {

    // do NOT mock your test variables
    private UserService userService;

    // DO mock your dependencies
    private UserRepository userRepository;

    @BeforeEach
    public void setup(){

        // We use mockito to build a mock object to then be used during testing
        userRepository = Mockito.mock(UserRepository.class);

        userService = new UserService(userRepository);
    }

    @Test
    public void getUserByIdFromRepositoryTest() {
        User testUser = new User(9, "Test User"); // create a fake user to be returned by the mock
        Mockito.when(userRepository.getUserById(9)).thenReturn(testUser); // when a dependency's method gets called, replace the actual value with a value we can control
        Assertions.assertEquals(testUser.getName(), userService.getUserById(9).getName());


        // EntityManager em = Mockito.mock(EntityManager.class);
        // Mockito.when(em.persist(user)).thenReturn(user);
        // service.create(user){
        //    em.persist(user)  <- replace this actual db call with a mocked value
        //}
    }
}
