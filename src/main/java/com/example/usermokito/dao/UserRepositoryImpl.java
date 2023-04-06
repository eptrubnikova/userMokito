package com.example.usermokito.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
public class UserRepositoryImpl implements UserRepository {

    private final List<User> users = new ArrayList();

    public UserRepositoryImpl() {
        users.add(new User("user1"));
        users.add(new User("user2"));
        users.add(new User("user3"));
        users.add(new User("user4"));
        users.add(new User("user5"));

    }

    @Override
    public String getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return name;
            }
        }
        return null;
    }

    @Override

    public List<User> findAllUsers() {
        return users;
    }

}
