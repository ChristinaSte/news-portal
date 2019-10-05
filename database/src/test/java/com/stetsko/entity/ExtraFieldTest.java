package com.stetsko.entity;

import com.stetsko.util.HibernateHelper;
import com.stetsko.util.TestEntityBuilder;
import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ExtraFieldTest extends BaseEntityTest {

    @Test
    public void checkPersist() {
        Session session = HibernateHelper.getSession();
        session.beginTransaction();

        ExtraField extraField = TestEntityBuilder.buildExtraField();
        ContentType contentType = TestEntityBuilder.buildContentType();
        ExtraFieldType extraFieldType = TestEntityBuilder.buildExtraFieldType();
        contentType.addExtraField(extraField);
        extraFieldType.addExtraFieldType(extraField);
        session.persist(contentType);
        session.persist(extraFieldType);
        session.persist(extraField);

        session.getTransaction().commit();
        assertNotNull(extraField.getId());
    }

    @Test
    public void checkFind() {
        Session session = HibernateHelper.getSession();
        session.getTransaction();

        ExtraField extraField = TestEntityBuilder.buildExtraField();
        ContentType contentType = TestEntityBuilder.buildContentType();
        ExtraFieldType extraFieldType = TestEntityBuilder.buildExtraFieldType();
        contentType.addExtraField(extraField);
        extraFieldType.addExtraFieldType(extraField);
        session.persist(contentType);
        session.persist(extraFieldType);
        session.persist(extraField);
        session.clear();
        ExtraField findExtraField = session.find(ExtraField.class, extraField.getId());

        session.getTransaction().commit();
        assertNotNull(findExtraField);
        assertNotNull(findExtraField.getContentType());
        assertNotNull(findExtraField.getExtraFieldType());
    }
}