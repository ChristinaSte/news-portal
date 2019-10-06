package com.stetsko.dao;

import com.stetsko.entity.Content;

public class ContentDao implements BaseDao<Long, Content> {

    public static final ContentDao INSTANCE = new ContentDao();

    public static ContentDao getInstance() {
        return INSTANCE;
    }
}