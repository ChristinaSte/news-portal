package com.stetsko.dao;

import com.stetsko.entity.User;

public class UserDao implements BaseDao<Long, User> {

    private static final UserDao INSTANCE = new UserDao();

    public static UserDao getInstance() {
        return INSTANCE;
    }
}