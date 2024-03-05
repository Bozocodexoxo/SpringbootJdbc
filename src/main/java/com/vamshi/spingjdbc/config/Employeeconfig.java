package com.vamshi.spingjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Employeeconfig {
@Bean
    public DataSource dataSource(){
        DriverManagerDataSource dm=new DriverManagerDataSource();
        dm.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dm.setUsername("root");
        dm.setPassword("tiger");
        return dm;
    }@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
    return new JdbcTemplate(dataSource);
    }
}
