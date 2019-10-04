package com.stetsko.service;

import com.stetsko.dao.UserDao;
import com.stetsko.entity.User;

public class UserService {

    public static final UserService INSTANCE = new UserService();
    private UserDao userDao = UserDao.getInstance();

    public User get(long id) {
        return userDao.get(id);
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}
