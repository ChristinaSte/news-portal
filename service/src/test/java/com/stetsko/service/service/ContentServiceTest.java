package com.stetsko.service.service;

import com.stetsko.database.dto.ContentDto;
import com.stetsko.database.util.DslPredicateBuilder;
import com.stetsko.service.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

public class ContentServiceTest extends BaseTest {

    @Autowired
    ContentService contentService;

    @Test
    public void checkFindAll() {
        List<ContentDto> contents = contentService.findAll();
        Assert.assertThat(contents, hasSize(10));
    }

    @Test
    public void checkFindAllWithPredicateAndPageable() {
        List<ContentDto> list = contentService.findAll(
                new DslPredicateBuilder()
                        .containsIgnoreCase(QContent.content.translations.any().title, "Test")
                        .build(),
                PageRequest.of(0, 5));
        Assert.assertThat(list, hasSize(5));
    }
}