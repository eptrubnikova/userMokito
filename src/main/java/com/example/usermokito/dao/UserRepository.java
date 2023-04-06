package com.example.usermokito.dao;

import java.util.Collection;

public interface UserRepository {
    String getUserByName(String name);

    Collection<User> findAllUsers();
}