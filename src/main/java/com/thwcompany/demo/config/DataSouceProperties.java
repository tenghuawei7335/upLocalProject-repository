package com.thwcompany.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;

import javax.sql.DataSource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Validated
public class DataSouceProperties {
    @NotNull(message = "driverclassname不能为空")
    private String driverclassname;
    @NotNull(message = "url不能为空")
    private String url;
    @NotNull(message = "username不能为空")
    private String username;
    @NotNull(message = "password不能为空")
    @Valid
    private String password;

    @Primary
    @Bean
    public DataSource dataSource(){
        String password = environment.getProperty("spring.datasource.password");
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName(this.driverclassname);
        hikariDataSource.setJdbcUrl(this.url);
        hikariDataSource.setUsername(this.username);
        hikariDataSource.setPassword(this.password);
        return hikariDataSource;

    }

    @Autowired
    private Environment environment;
}
