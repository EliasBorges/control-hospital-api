package com.control.hospital.config.persistence;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data
@ConstructorBinding
@ConfigurationProperties(prefix = "db.credentials")
public class DatabaseCredentialsConfig {
    private String dbHost;
    private String dbUser;
    private String dbPasswordPath;
}
