package com.stetsko.service;

import com.stetsko.dao.Dao;
import com.stetsko.entity.Content;

public class ContentService {

    public static final ContentService INSTANCE = new ContentService();

    public Content find(Long id) {
        Dao<Content, Long> contentDao = new Dao<>(Content.class);
        return contentDao.find(id);
    }

    public static ContentService getInstance() {
        return INSTANCE;
    }
}