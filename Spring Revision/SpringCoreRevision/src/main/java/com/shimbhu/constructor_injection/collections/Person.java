package com.shimbhu.constructor_injection.collections;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@ToString
@AllArgsConstructor
public class Person {
    private Integer personId;
    private String personName;
    private List<String> nickNames;
    private Set<String> cities;
    private Map<String, String> jobs;
    private Properties properties;
}
