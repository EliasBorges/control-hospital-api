package com.control.hospital.config.persistence;

import com.google.common.io.Files;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource getDataSource(DatabaseCredentialsConfig dbCredentialsConfig) throws IOException {
        String user = dbCredentialsConfig.getDbUser();
        String password = dbCredentialsConfig.getDbPasswordPath();
        String host = dbCredentialsConfig.getDbHost();

        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://" + host + "/account?createDatabaseIfNotExist=true");
        dataSourceBuilder.username(user);
        dataSourceBuilder.password(Files.toString(new File(password), UTF_8));

        return dataSourceBuilder.build();
    }
}
