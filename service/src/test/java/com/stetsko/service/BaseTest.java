package com.stetsko.service;

import com.stetsko.database.util.TestDatabaseHelper;
import com.stetsko.service.config.ServiceConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ServiceConfig.class)
@Transactional
public abstract class BaseTest {

    @Autowired
    private TestDatabaseHelper databaseHelper;

    @Before
    public void init() {
        databaseHelper.clear();
        databaseHelper.fill(10);
    }
}
