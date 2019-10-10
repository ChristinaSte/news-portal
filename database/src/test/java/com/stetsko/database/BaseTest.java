package com.stetsko.database;

import com.stetsko.database.config.DatabaseConfig;
import com.stetsko.database.util.TestDatabaseHelper;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DatabaseConfig.class)
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
