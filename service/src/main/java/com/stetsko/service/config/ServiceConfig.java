package com.stetsko.service.config;

import com.stetsko.database.config.DatabaseConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.stetsko.service")
@Import(DatabaseConfig.class)
public class ServiceConfig {
}
