package com.stetsko.database.repository;

import com.stetsko.database.BaseTest;
import com.stetsko.database.entity.Content;
import com.stetsko.database.util.DslPredicateBuilder;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertThat;

public class ContentRepositoryTest extends BaseTest {

    @Autowired
    private ContentRepository contentRepository;

    @Test
    public void checkFindAllWithPredicate() {
        Iterable<Content> contents = contentRepository.findAll(
                new DslPredicateBuilder()
                        .containsIgnoreCase(content.translations.any().title, "Test")
                        .build()
        );
        assertThat(contents, Matchers.iterableWithSize(10));
    }
}
