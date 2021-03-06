package com.stetsko.database.util;

import com.stetsko.database.entity.Category;
import com.stetsko.database.entity.Comment;
import com.stetsko.database.entity.Content;
import com.stetsko.database.entity.ContentType;
import com.stetsko.database.entity.Editor;
import com.stetsko.database.entity.Lang;
import com.stetsko.database.repository.ContentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Component
@AllArgsConstructor
public class TestDatabaseHelper {

    private final ContentRepository contentRepository;
    private final EntityManagerFactory entityManagerFactory;

    public void fill(int count) {
        Content content;
        Comment comment;
        ContentType contentType;
        Category category;
        Editor editor;
        for (int i = 0; i < count; i++) {
            content = TestEntityBuilder.buildContent();
            comment = TestEntityBuilder.buildComment();
            contentType = TestEntityBuilder.buildContentType();
            category = TestEntityBuilder.buildCategory();
            editor = TestEntityBuilder.buildEditor();

            contentType.addContent(content);
            category.addContent(content);
            editor.addContent(content);
            content.addComment(comment);
            for (Lang lang : Lang.values()) {
                content.addTag(TestEntityBuilder.buildTag(lang));
                content.addTranslation(TestEntityBuilder.buildContentTranslation(lang));
            }
            contentRepository.save(content);
        }
    }

    public void clear() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createQuery("delete from ContentTranslation").executeUpdate();
        entityManager.createQuery("delete from CategoryTranslation").executeUpdate();
        entityManager.createQuery("delete from Comment").executeUpdate();
        entityManager.createQuery("delete from Content").executeUpdate();
        entityManager.createQuery("delete from User").executeUpdate();
        entityManager.createQuery("delete from Category").executeUpdate();
        entityManager.createQuery("delete from Tag").executeUpdate();
        entityManager.createQuery("delete from ExtraField").executeUpdate();
        entityManager.createQuery("delete from ExtraFieldType").executeUpdate();
        entityManager.createQuery("delete from ContentType").executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
