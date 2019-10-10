package com.stetsko.database.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@UtilityClass
@Log4j
public class AppConfig {

    public static final String CONFIG_FILE_NAME = "app.properties";
    public static final Properties PROPERTIES = new Properties();

    static {
        try (InputStream resourceAsStream = AppConfig.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME)) {
            PROPERTIES.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}