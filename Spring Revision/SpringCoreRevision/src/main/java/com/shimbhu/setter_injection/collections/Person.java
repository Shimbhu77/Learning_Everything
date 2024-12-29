package com.shimbhu.setter_injection.collections;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class Person {
    private Integer personId;
    private String personName;
    private List<String> nickNames;
    private Set<String> cities;
    private Map<String, String> jobs;
    private Properties properties;
}
