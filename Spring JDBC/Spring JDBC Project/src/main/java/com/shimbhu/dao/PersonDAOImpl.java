package com.shimbhu.dao;

import com.shimbhu.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDAOImpl implements PersonDAO{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Person person) {

        String query = "insert into person(id,name,gender,city) values(?,?,?,?)";

        return jdbcTemplate.update(query,person.getId(),person.getName(),person.getGender(),person.getCity());
    }

    @Override
    public int update(Person person) {

        String query = "update person set name = ?, city = ? where id = ?";

        return jdbcTemplate.update(query,person.getName(),person.getCity(),person.getId());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
