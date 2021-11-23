package com.revature.service;


import com.revature.model.User;
import com.revature.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserServiceTest {
    // do not mock your test variables
    private UserService userService;

    // do mock your test dependencies
    private UserRepository userRepositoryMock;


    @BeforeAll
    public void setup(){
        userRepositoryMock = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepositoryMock);
    }

    @Test
    public void getUserByIdFromRepository(){
        User testUser = new User(1, "Test User From Service");

        Mockito.when(userRepositoryMock.getUserById(1)).thenReturn(testUser);

        Assertions.assertEquals(testUser.getName(), userService.getUserById(1).getName());
    }

}
