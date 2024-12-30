package com.shimbhu.bean_configuration_methods.bean_with_xml_with_component_annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("house")
public class Home {

    @Value("Payal Bhawan")
    private String name;

    @Value("Shimla")
    private String city;

    @Value("5 crore")
    private String price;
}
