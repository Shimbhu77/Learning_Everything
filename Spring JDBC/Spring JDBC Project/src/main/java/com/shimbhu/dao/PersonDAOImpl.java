package com.shimbhu.dao;

import com.shimbhu.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("personDaoBean")
public class PersonDAOImpl implements PersonDAO{

    @Autowired
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

    @Override
    public int delete(Integer id) {

        String query = "delete from person where id = ?";

        return jdbcTemplate.update(query,id);
    }

    @Override
    public Person findById(Integer id) {

        String query = "select * from person where id = ?";

        RowMapper<Person> rowMapper = new RowMapperImpl();
        return jdbcTemplate.queryForObject(query,rowMapper,id);
    }

    @Override
    public List<Person> findAll() {

        String query = "select * from person ";

        RowMapper<Person> rowMapper = new RowMapperImpl();
        return jdbcTemplate.query(query,rowMapper);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
