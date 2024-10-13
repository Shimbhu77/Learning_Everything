package com.shimbhu.configuration;

import com.shimbhu.dao.PersonDAO;
import com.shimbhu.dao.PersonDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.shimbhu.dao")
public class JdbcConfig {

    @Bean(name = {"dataSource"})
    public DataSource getDataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        return dataSource;
    }

    @Bean(name = {"jdbc"})
    public JdbcTemplate getJdbcTemplate()
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    /*@Bean(name = {"personDaoBean"})
    public PersonDAO getPersonDao()
    {
        PersonDAOImpl personDAO = new PersonDAOImpl();
        personDAO.setJdbcTemplate(getJdbcTemplate());
        return personDAO;
    }*/

}
