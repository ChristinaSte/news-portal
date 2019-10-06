package com.stetsko.service;

import com.stetsko.dao.ContentDao;
import com.stetsko.entity.Content;

import java.util.Optional;

public class ContentService {

    public static final ContentService INSTANCE = new ContentService();

    public Optional<Content> find(Long id) {
        return ContentDao.getInstance().get(id);
    }

    public static ContentService getInstance() {
        return INSTANCE;
    }
}