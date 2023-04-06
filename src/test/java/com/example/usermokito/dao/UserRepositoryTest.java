package com.example.usermokito.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    private static final String TRUE_NAME1 = "user1";
    private static final String TRUE_NAME2 = "user2";
    private static final String TRUE_NAME3 = "user3";
    private static final String TRUE_NAME4 = "user4";
    private static final String TRUE_NAME5 = "user5";
    private static final String NON_EXISTENT_USER = "not_user";
    private static final HashSet<User> users = new HashSet<>(Arrays.asList(
            new User(TRUE_NAME1),
            new User(TRUE_NAME2), new User(TRUE_NAME3),
            new User(TRUE_NAME4), new User(TRUE_NAME5)));
    private final UserRepositoryImpl out = new UserRepositoryImpl();

    @Test
    void shouldCreateUserObjectWithCorrectParameters() {
        User user = new User(TRUE_NAME1);
        Assertions.assertEquals(TRUE_NAME1, out.getUserByName(user.getName()));
    }

    @Test
    void shouldCreateUserObjectWithDefaultParameters() {
        assertNull(out.getUserByName(NON_EXISTENT_USER));
    }
}