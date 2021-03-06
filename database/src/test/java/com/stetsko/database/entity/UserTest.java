package com.stetsko.database.entity;

import com.stetsko.database.util.HibernateHelper;
import com.stetsko.database.util.TestEntityBuilder;
import lombok.Cleanup;
import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class UserTest extends BaseEntityTest {

    @Test
    public void checkPersist() {
        @Cleanup Session session = HibernateHelper.getSession();
        session.beginTransaction();
        User user = TestEntityBuilder.buildUser();
        session.persist(user);
        session.getTransaction().commit();
        assertNotNull(user.getId());
    }

    @Test
    public void checkFind() {
        @Cleanup Session session = HibernateHelper.getSession();
        User user = TestEntityBuilder.buildUser();
        session.beginTransaction();
        session.persist(user);
        session.clear();
        assertNotNull(session.get(User.class, user.getId()));
    }
}