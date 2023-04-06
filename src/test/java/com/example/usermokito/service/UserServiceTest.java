package com.example.usermokito.service;

import com.example.usermokito.dao.User;
import com.example.usermokito.dao.UserRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private static final String TRUE_NAME1 = "user1";
    private static final String TRUE_NAME2 = "user2";
    private static final String TRUE_NAME3 = "user3";
    private static final String TRUE_NAME4 = "user4";
    private static final String TRUE_NAME5 = "user5";
    private static final String NON_EXISTENT_USER = "not_user";
    private static final List<User> users = new ArrayList(Arrays.asList(
            new User(TRUE_NAME1),
            new User(TRUE_NAME2), new User(TRUE_NAME3),
            new User(TRUE_NAME4), new User(TRUE_NAME5))) {
    };
    private static final User CORRECT_USER = users.get(0);
    private static final User DEFAULT_USER = new User(NON_EXISTENT_USER);
    @Mock
    private UserRepositoryImpl user;

    @InjectMocks
    private UserServiceImpl out;

    @Test
    void shouldCheckUserExistReturnTrue() {
        when(user.getUsers()).thenReturn(users);
        Assertions.assertTrue(out.checkUserExist(CORRECT_USER));
    }
    @Test
    void shouldCheckUserExistReturnFalls() {
        when(user.getUsers()).thenReturn(users);
        Assertions.assertFalse(out.checkUserExist(DEFAULT_USER));
    }

}