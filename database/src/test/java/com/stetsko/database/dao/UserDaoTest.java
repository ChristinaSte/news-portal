package com.stetsko.database.dao;

import com.stetsko.database.entity.Administrator;
import com.stetsko.database.entity.Editor;
import com.stetsko.database.entity.User;
import com.stetsko.database.util.TestEntityBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class UserDaoTest {

    private UserDao userDao = UserDao.getInstance();

    @Test
    public void checkUserDaoGet(){
        Long userId = userDao.save(TestEntityBuilder.buildUser());
        long editorId = userDao.save(TestEntityBuilder.buildEditor());
        Long administratorId = userDao.save(TestEntityBuilder.buildAdministrator());
        Optional<User> user = userDao.get(userId);
        Optional<User> editor = userDao.get(editorId);
        Optional<User> administrator = userDao.get(editorId);
        Assert.assertTrue(user.isPresent()&&user.get().getClass() == User.class);
        Assert.assertTrue(editor.isPresent()&&editor.get().getClass() == Editor.class);
        Assert.assertTrue(administrator.isPresent()&& administrator.get().getClass() == Administrator.class);
    }
}