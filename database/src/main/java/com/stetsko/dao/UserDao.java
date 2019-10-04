package com.stetsko.dao;

import com.stetsko.entity.User;

public class UserDao {

    public static final UserDao INSTANCE = new UserDao();

    public User get(Long id) {
        return User.builder()
                .id(id)
                .name("John")
                .build();
    }

    public static UserDao getInstance(){
        return INSTANCE;
    }
}
