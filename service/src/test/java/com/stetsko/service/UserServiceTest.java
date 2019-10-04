package com.stetsko.service;

import com.stetsko.entity.User;
import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {

    private UserService userService = UserService.getInstance();

    @Test
    public void get() {
        User user = userService.get(1L);
        Assert.assertEquals(1L, user.getId());
        Assert.assertEquals("John", user.getName());
    }
}
