package com.shimbhu.dao;

import com.shimbhu.model.Person;

public interface PersonDAO {

    int insert(Person person);
    int update(Person person);
    int delete(Integer id);
    Person findById(Integer id);
}