package com.stetsko.dao;

import com.stetsko.entity.User;
import org.junit.Assert;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void get() {
        UserDao userDaoInstance = UserDao.getInstance();
        User user = userDaoInstance.get(1L);
        Assert.assertEquals(1L, user.getId());
        Assert.assertEquals("John", user.getName());
    }
}
