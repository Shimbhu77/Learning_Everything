package com.shimbhu.dao;

import com.shimbhu.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class RowMapperImpl implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

        Person person = new Person();

        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setGender(rs.getString("gender"));
        person.setCity(rs.getString("city"));

        return person;
    }
}
